package com.base.annotation.inherited;

import java.lang.annotation.*;

/**
 * @Author YongQiang
 * @Date 2020/6/3 9:21
 * @Version 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface MyInherited {
}
