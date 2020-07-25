package com.base.annotation.inherited;

import com.base.annotation.MyAnnotation;

/**
 * @Author YongQiang
 * @Date 2020/6/3 9:25
 * @Version 1.0
 */
public class InheritedTest {
    public static void main(String[] args) {

        System.out.println("InheritedFather has Annotation? " + InheritedFather.class.isAnnotationPresent(MyInherited.class));
        System.out.println("InheritedChild has Annotation? " + InheritedChild.class.isAnnotationPresent(MyInherited.class));
    }
}
