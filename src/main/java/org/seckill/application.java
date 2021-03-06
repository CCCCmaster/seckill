package org.seckill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Idea
 *
 * @author ccccmaster
 * @date: 18-7-27
 * @time: 上午10:43
 */

@SpringBootApplication
@EnableCaching
@EnableAutoConfiguration
//@ComponentScan(value = "org")
public class application {
    public static void main(String[] args) {
        SpringApplication.run(application.class, args);
    }
}
