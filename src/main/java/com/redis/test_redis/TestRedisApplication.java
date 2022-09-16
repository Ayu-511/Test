package com.redis.test_redis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


//@MapperScan({"com.redis"})
@SpringBootApplication
//@ComponentScan({"com.redis"})
@MapperScan(basePackages = "com.redis")
public class TestRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestRedisApplication.class, args);
    }

}
