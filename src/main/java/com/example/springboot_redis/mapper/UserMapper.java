package com.example.springboot_redis.mapper;

import com.example.springboot_redis.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserMapper {

    @Select("select * from user where userId=#{userid}")
    User  selectById(@Param("userid") int userid);
}
