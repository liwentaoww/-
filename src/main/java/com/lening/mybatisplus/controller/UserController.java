package com.lening.mybatisplus.controller;

import com.lening.mybatisplus.entity.UserBean;
import com.lening.mybatisplus.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/findAll")
    public List<UserBean> findAll(){
        return userService.findAll();
    }
}
