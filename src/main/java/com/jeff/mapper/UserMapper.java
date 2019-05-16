package com.jeff.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jeff.entity.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
