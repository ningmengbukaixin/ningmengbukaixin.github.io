package com.wangxin.demo.mapper;

import com.wangxin.demo.pojo.Userinfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserinfoMapper {
    List<Userinfo> findAll();
    List<Userinfo> findList();
    List<Userinfo> findMap(@Param("map") Object o);
}