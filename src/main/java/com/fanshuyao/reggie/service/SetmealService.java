package com.fanshuyao.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fanshuyao.reggie.dto.SetmealDto;
import com.fanshuyao.reggie.entity.Setmeal;

import java.util.List;

/**
 * fanshuyao
 * 2023/4/112021.01.20
 */
public interface SetmealService extends IService<Setmeal> {
    /**
     * 新增套餐，同时需要保存套餐和菜品的关联关系
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);
    /**
     * 删除套餐，同时需要删除套餐和菜品的关联数据
     * @param ids
     */
    public void removeWithDish(List<Long> ids);
}
