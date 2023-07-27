package com.fanshuyao.reggie.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLIntegrityConstraintViolationException;

/**
 * 全局异常处理
 */
@ControllerAdvice(annotations = {RestController.class, Controller.class})
//@ControllerAdvice注解配合@ExceptionHandler用于全局异常的处理。
@ResponseBody //@ResponseBody注解的作用是将controller的方法返回的对象 通过适当的转换器转换为指定的格式之后，
              // 可以把返回的数据变成json形式
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 异常处理方法
     * @return
     */
    //数据库表里有些字段设置成了unique,因此命名相同的时候就会抛出这个异常
    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
      //Spring的@ExceptionHandler可以用来统一处理方法抛出的异常
     //SQLIntegrityConstraintViolationException这个是新增员工的用户名相同时，controller类抛出的异常，控制台可以复制过来
    public R<String> exceptionHandler(SQLIntegrityConstraintViolationException ex){
        log.error(ex.getMessage()); //这句话会打印到idea的控制台上

        if(ex.getMessage().contains("Duplicate entry")){
            String[] split = ex.getMessage().split(" ");
            String msg = split[2] + "已存在";
            return R.error(msg);  //这句话会直接显示在页面上
        }

        return R.error("未知错误");  //说明抛出的异常没办法定位
    }

    /**
     * 异常处理方法
     * @return
     */
    @ExceptionHandler(CustomException.class)
    public R<String> exceptionHandler(CustomException ex){
        log.error(ex.getMessage());

        return R.error(ex.getMessage());
    }
}
