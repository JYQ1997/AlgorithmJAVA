package com.base.annotation.inherited;

import com.base.annotation.MyAnnotation;

/**
 * @Author YongQiang
 * @Date 2020/6/3 9:25
 * @Version 1.0
 */
public class InheritedChild extends InheritedFather {
    public InheritedChild() {
        super();
        System.out.println("InheritedChild has Annotation? " + InheritedChild.class.isAnnotationPresent(MyInherited.class));
    }

    /*public static void main(String[] args) {
        InheritedChild inheritedChild=new InheritedChild();
    }*/
}
