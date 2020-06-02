package com.example.ym;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;




@MapperScan("com.example.ym.dao")
@AutoConfigurationPackage
@SpringBootApplication
public class  YmApplication {

    public static void main(String[] args) {
        SpringApplication.run(YmApplication.class, args);
    }

}
