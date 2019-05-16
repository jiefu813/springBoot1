package com.jeff.service;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jeff.entity.User;
import com.jeff.mapper.UserMapper;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
