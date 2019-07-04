package com.wangxin.demo.service;

import com.wangxin.demo.pojo.Userinfo;

import java.util.List;

public interface UserinfoService {
    void insert(Userinfo userinfo);
    List<Userinfo> findList();
    List<Userinfo> findAll(Object o);
    List<Userinfo> findAll();
}
