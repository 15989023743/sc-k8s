package com.lemon.service.impl;

import com.lemon.feign.UserServiceFeign;
import com.lemon.service.IToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：chenyuhong
 * @date ：Created in 2020-09-11 17:47
 * @description：
 * @modified By：
 */
@Service
public class ToolService implements IToolService {

    @Autowired
    UserServiceFeign userServiceFeign;

    @Override
    public String getName() {
        return userServiceFeign.getUserName();
    }
}
