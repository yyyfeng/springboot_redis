package com.example.springboot_redis.util;

import org.springframework.beans.factory.annotation.Value;

import java.io.*;
import java.util.Properties;

public class SysConfigUtil {

    @Value("${spring.redis.host}")
    private static String host;

    private static Properties properties=null;

    public static SysConfigUtil getSysConfigUtil(String s) {

        InputStream inputStream = SysConfigUtil.class.getClassLoader().getResourceAsStream("application.properties");



        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new SysConfigUtil();
    }

    private String getProperty(String key){
        return properties.getProperty(key);
    }

    public static void main(String[] args) {

        String jarPath = SysConfigUtil.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        System.out.println(jarPath);
        String configPath = jarPath+"application.properties";
        System.out.println(configPath);

        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(new File(configPath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Properties properties = new Properties();

        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(properties.get("spring.redis.host"));
    }
}
