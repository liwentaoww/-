package com.lening.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lening.mybatisplus.entity.UserBean;
import com.lening.mybatisplus.mapper.UserMapper;
import com.lening.mybatisplus.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserBean> implements UserService {
    @Override
    public List<UserBean> findAll() {
        return this.baseMapper.selectList(null);
    }
}
