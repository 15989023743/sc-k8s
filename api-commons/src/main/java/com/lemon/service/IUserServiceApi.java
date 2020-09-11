package com.lemon.service;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/user")
public interface IUserServiceApi {

    /**
     * 获取用户名称
     *
     * @return
     */
    @GetMapping(value = "/getUserName")
    String getUserName();

}
