package com.fanshuyao.reggie.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fanshuyao.reggie.entity.Dish;
import com.fanshuyao.reggie.entity.User;
import com.fanshuyao.reggie.mapper.DishMapper;
import com.fanshuyao.reggie.mapper.UserMapper;
import com.fanshuyao.reggie.service.DishService;
import com.fanshuyao.reggie.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
