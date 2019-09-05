package com.example.springboot_redis.controller;

import com.example.springboot_redis.pojo.User;
import com.example.springboot_redis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestContoller {


    @Autowired
    private UserService userService;

    @RequestMapping("/insertUser")
    @ResponseBody
    public void insertUser(String  userid){
       User u=new  User(1,"zhangsan","123",100);
       userService.insertUser(u);
    }

    /**
     * 根据键值查询
     * @param userid
     * @return
     */
    @RequestMapping("/selectById")
    @ResponseBody
    public String selectById(String  userid){
        String s = userService.selectById(userid);
        return  s;
    }

}
