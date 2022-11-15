package com.lening.mybatisplus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lening.mybatisplus.entity.UserBean;

import java.util.List;

public interface UserService extends IService<UserBean> {
    List<UserBean>findAll();
}
