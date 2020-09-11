package com.lemon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ：chenyuhong
 * @date ：Created in 2020-09-11 16:16
 * @description：
 * @modified By：
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ToolMain {
    public static void main(String[] args) {
        SpringApplication.run(ToolMain.class, args);
    }
}
