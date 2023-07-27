package com.fanshuyao.reggie.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fanshuyao.reggie.entity.Dish;
import com.fanshuyao.reggie.entity.DishFlavor;
import com.fanshuyao.reggie.mapper.DishFlavorMapper;
import com.fanshuyao.reggie.mapper.DishMapper;
import com.fanshuyao.reggie.service.DishFlavorService;
import com.fanshuyao.reggie.service.DishService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
