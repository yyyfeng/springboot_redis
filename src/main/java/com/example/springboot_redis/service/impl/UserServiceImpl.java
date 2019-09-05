package com.example.springboot_redis.service.impl;

import com.example.springboot_redis.mapper.UserMapper;
import com.example.springboot_redis.pojo.User;
import com.example.springboot_redis.service.UserService;
import com.example.springboot_redis.util.ObjectAndByte;
import com.example.springboot_redis.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insertUser(User user) {
        String key="USER_"+user.getUserid();
        RedisUtil.getRedisUtil().setObject(key,user);
    }

    @Override
    public String selectById(String  userid) {
        String key =userid;
        User user = (User)RedisUtil.getRedisUtil().getObject(key);
        return user.toString();

    }

}
