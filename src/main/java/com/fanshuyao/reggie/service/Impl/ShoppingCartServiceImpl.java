package com.fanshuyao.reggie.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fanshuyao.reggie.entity.ShoppingCart;
import com.fanshuyao.reggie.entity.User;
import com.fanshuyao.reggie.mapper.ShoppingCartMapper;
import com.fanshuyao.reggie.mapper.UserMapper;
import com.fanshuyao.reggie.service.ShoppingCartService;
import com.fanshuyao.reggie.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
}
