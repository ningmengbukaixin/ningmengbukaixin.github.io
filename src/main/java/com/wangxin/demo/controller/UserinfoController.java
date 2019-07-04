package com.wangxin.demo.controller;

import com.wangxin.demo.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserinfoController {

    @Autowired
    private UserinfoService userinfoService;

    @RequestMapping("demo")
    public ModelAndView demo(){
        ModelAndView mv = new ModelAndView();
        Map<String,Object> map = new HashMap<>();
        map.put("userName","111");
        map.put("userPass","222");
        mv.addAllObjects(map);
        return mv;
    }

    @RequestMapping("test")
    public void test(){

    }
}
