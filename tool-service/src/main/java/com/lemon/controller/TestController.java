package com.lemon.controller;


import com.lemon.feign.UserServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @auther zzyy
 * @create 2020-02-18 10:43
 */
@RestController
@RequestMapping("index")
public class TestController
{

    @Autowired
    UserServiceFeign userServiceFeign;

    @GetMapping(value = "/helloworld")
    public String create()
    {
     return userServiceFeign.getUserName();
    }


}
