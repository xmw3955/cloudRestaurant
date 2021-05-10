package com.tedu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tedu.dao")//加载所有的DAO接口，完成DAO的自动映射
public class SpringBootApplicationContext {
    //Spring Boot启动方法
    public static void main(String[] args) {
        //启动Spring Boot()
        SpringApplication.run(SpringBootApplicationContext.class, args);
    }
}
