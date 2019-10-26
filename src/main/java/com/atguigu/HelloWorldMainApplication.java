package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
 *@SpringBootApplication标注一个主程序类。说明这是一个spring boot应用
 */
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {
        //启动spring应用
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
