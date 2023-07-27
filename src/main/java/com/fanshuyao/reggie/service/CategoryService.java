package com.fanshuyao.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fanshuyao.reggie.entity.Category;

/**
 * fanshuyao
 * 2023/4/92021.01.20
 */
public interface CategoryService extends IService<Category>{
    public void remove(Long id);
}
