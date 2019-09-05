package com.example.springboot_redis.service;

import com.example.springboot_redis.pojo.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

     //为每个用户添加索引
    void insertUser(User user);

     String selectById(String  userid);
}
