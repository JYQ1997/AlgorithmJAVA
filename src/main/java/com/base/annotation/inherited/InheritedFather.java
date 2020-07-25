package com.base.annotation.inherited;

import com.base.annotation.MyAnnotation;

/**
 * @Author YongQiang
 * @Date 2020/6/3 9:23
 * @Version 1.0
 */
@MyInherited
public class InheritedFather {
    public InheritedFather() {
        System.out.println("InheritedFather has Annotation? " + InheritedFather.class.isAnnotationPresent(MyInherited.class));
    }
}
