package com.dubbo.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import service.UserService;

/**
 * @author tanzhenhong
 */
@Service(timeout = 3000)
public class UserServiceImpl implements UserService {

    @Override
    public String getUser() {
        return "service user";
    }
}
