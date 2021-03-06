package com.lemon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ：chenyuhong
 * @date ：Created in 2020-09-11 16:16
 * @description：
 * @modified By：
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class UserMain {
    public static void main(String[] args) {
        SpringApplication.run(UserMain.class, args);
    }
}
