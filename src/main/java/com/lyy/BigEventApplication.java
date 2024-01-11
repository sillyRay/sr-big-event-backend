package com.lyy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 */
//@MapperScan(value = "com.lyy.mapper")
//@ComponentScan(basePackages = "com.lyy")
@SpringBootApplication
public class BigEventApplication {
    public static void main(String[] args) {
        SpringApplication.run(BigEventApplication.class,args);
    }
}
