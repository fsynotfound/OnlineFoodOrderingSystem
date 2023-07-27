package com.fanshuyao.reggie.dto;

import com.fanshuyao.reggie.entity.Setmeal;
import com.fanshuyao.reggie.entity.Setmeal;
import com.fanshuyao.reggie.entity.SetmealDish;
import com.fanshuyao.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
