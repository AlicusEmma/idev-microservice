package com.idev.biz.admin.service.impl;

import com.idev.biz.admin.entity.UserEntity;
import com.idev.biz.admin.mapper.UserMapper;
import com.idev.biz.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserEntity> getAll() {
        return userMapper.getAll();
    }
}
