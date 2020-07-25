package com.base.annotation;


import java.lang.annotation.*;

/**
 * @Author YongQiang
 * @Date 2020/6/3 9:14
 * @Version 1.0
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface MyAnnotation {
}
