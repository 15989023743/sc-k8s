package com.lemon.service;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "user-service")
public interface UserServiceFeign {

    /**
     * 获取用户名称
     *
     * @return
     */
    String getUserName();

}
