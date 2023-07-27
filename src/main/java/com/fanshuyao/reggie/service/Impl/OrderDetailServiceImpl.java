package com.fanshuyao.reggie.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fanshuyao.reggie.entity.OrderDetail;
import com.fanshuyao.reggie.mapper.OrderDetailMapper;
import com.fanshuyao.reggie.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}