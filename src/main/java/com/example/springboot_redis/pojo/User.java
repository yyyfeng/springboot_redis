package com.example.springboot_redis.pojo;


import lombok.Data;

import java.io.Serializable;

@Data
//对象实现序列化，才能进行序列化与反序列化
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private int userid;
    private String userName;
    private String passWord;
    private int salary;

    public User() {
        super();
    }

    public User(int userid, String userName, String passWord, int salary) {
        this.userid = userid;
        this.userName = userName;
        this.passWord = passWord;
        this.salary = salary;
    }
}
