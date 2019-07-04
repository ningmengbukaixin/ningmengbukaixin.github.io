package com.wangxin.demo.service.test;

import com.wangxin.demo.pojo.Userinfo;
import com.wangxin.demo.service.UserinfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserinfoServiceImplTest {

    @Resource
    private UserinfoService userinfoService;

    @Test
    public void insert() {
    }

    @Test
    public void findList() {
    }

    @Test
    public void findAll() {
        Map<String,Object> map = new HashMap<>();
        map.put("id",13);
        List<Userinfo> userinfos = userinfoService.findAll(map);
        for (Userinfo userinfo : userinfos) {
            System.out.println(userinfo.getId());
        }
    }

    @Test
    public void findAll1() {
        List<Userinfo> userinfos = userinfoService.findAll();
        for (Userinfo userinfo : userinfos) {
            System.out.println(userinfo.getId());
        }
    }
}