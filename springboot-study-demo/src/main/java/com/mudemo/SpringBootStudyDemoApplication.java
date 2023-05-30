package com.mudemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.mudemo.dao")
public class SpringBootStudyDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStudyDemoApplication.class, args);
    }

}
