package com.lemon.service.impl;

import com.lemon.service.UserServiceFeign;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：chenyuhong
 * @date ：Created in 2020-09-11 15:04
 * @description：
 * @modified By：
 */
@RestController
public class UserServiceImpl implements UserServiceFeign {

    @Override
    public String getUserName() {
        return "hello world";
    }
}
