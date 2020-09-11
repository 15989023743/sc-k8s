package com.lemon.service.impl;

import com.lemon.service.IUserServiceApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：chenyuhong
 * @date ：Created in 2020-09-11 15:04
 * @description：
 * @modified By：
 */
@RestController
public class IUserServiceImpl implements IUserServiceApi {

    @Override
    public String getUserName() {
        return "hello world";
    }
}
