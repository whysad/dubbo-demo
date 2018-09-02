package com.duboo.demo.Controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

/**
 * @author tanzhenhong
 */
@RestController
public class UserController {

    @Reference
    private UserService userService;

    @GetMapping("/api/user")
    public Object getUser() {
        return userService.getUser();
    }
}
