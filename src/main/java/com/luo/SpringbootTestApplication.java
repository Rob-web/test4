package com.luo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 搭建基本环节
 * 1. 导入数据库文件
 */
@MapperScan("com.luo.*.mapper")
@SpringBootApplication(scanBasePackages = { "com.luo" })
public class SpringbootTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTestApplication.class, args);
    }

}
