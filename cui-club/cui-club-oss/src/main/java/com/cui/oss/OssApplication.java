package com.cui.oss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * oss服务启动器
 * 
 * @author: cui
 * @date: 2024/7/11
 */
@SpringBootApplication
@ComponentScan("com.cui")
public class OssApplication {

    public static void main(String[] args) {
        SpringApplication.run(OssApplication.class);
    }

}
