package com.fanshuyao.reggie.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fanshuyao.reggie.entity.Employee;
import com.fanshuyao.reggie.mapper.EmployeeMapper;
import com.fanshuyao.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl  extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
