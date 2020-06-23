package com.igeek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类  @SpringBootApplication
 * 来标注一个主程序类，说明这是一个Spring Boot应用
 */
@SpringBootApplication
public class HelloSpringApplication {

    public static void main(String[] args) {

        SpringApplication.run(HelloSpringApplication.class,args);

    }

}
