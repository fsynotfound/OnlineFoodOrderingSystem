package com.fanshuyao.reggie.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fanshuyao.reggie.entity.AddressBook;
import com.fanshuyao.reggie.entity.Category;
import com.fanshuyao.reggie.mapper.AddressBookMapper;
import com.fanshuyao.reggie.mapper.CategoryMapper;
import com.fanshuyao.reggie.service.AddressBookService;
import com.fanshuyao.reggie.service.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {
}
