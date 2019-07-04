package com.wangxin.demo.service.impl;

import com.wangxin.demo.mapper.UserinfoMapper;
import com.wangxin.demo.pojo.Userinfo;
import com.wangxin.demo.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserinfoServiceImpl implements UserinfoService {

    @Autowired
    private UserinfoMapper userinfoMapper;
    @Override
    public void insert(Userinfo userinfo) {

    }

    @Override
    public List<Userinfo> findList() {
        return null;
    }

    @Override
    public List<Userinfo> findAll(Object o) {
        return userinfoMapper.findMap(o);
    }

    @Override
    public List<Userinfo> findAll() {
        return userinfoMapper.findAll();
    }
}
