package com.shop.miniso;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shop.miniso.dao")
public class MinisoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MinisoApplication.class, args);
    }

}
