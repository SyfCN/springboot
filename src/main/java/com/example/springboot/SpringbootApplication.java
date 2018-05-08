package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 该注解指定项目为springboot,由此类当做程序入口自动装配 web 所依赖的环境
 *
 * @SpringBootApplication 开启了 Spring 的组件扫描和 springboot 的自动配置功能,相当于将以下三个注解组合在了一起
 * (1) @Configuration           ：表明该类使用基于java的配置，将此类作为配置类
 * (2) @ComponentScan           ：启用注解扫描
 * (3) @EnableAutoConfiguration ：开启 springboot 的自动配置功能
 */
@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }
}
