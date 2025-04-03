package com.itzhuo.springpicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@MapperScan("com.itzhuo.springpicturebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class SpringPictureBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringPictureBackendApplication.class, args);
        System.out.println("云图库启动成功！");
    }
}
