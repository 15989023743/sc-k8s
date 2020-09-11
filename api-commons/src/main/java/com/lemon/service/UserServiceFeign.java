package com.lemon.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "user-service")
public interface UserServiceFeign {

    /**
     * 获取用户名称
     *
     * @return
     */
    @GetMapping(value = "/user/getUserName")
    String getUserName();

}
