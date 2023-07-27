package com.fanshuyao.reggie.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fanshuyao.reggie.entity.Setmeal;
import com.fanshuyao.reggie.entity.SetmealDish;
import com.fanshuyao.reggie.mapper.SetmealDishMapper;
import com.fanshuyao.reggie.mapper.SetmealMapper;
import com.fanshuyao.reggie.service.SetmealDishService;
import com.fanshuyao.reggie.service.SetmealService;
import org.springframework.stereotype.Service;

@Service
public class SetmealDishServiceImpl extends ServiceImpl<SetmealDishMapper, SetmealDish> implements SetmealDishService {
}
