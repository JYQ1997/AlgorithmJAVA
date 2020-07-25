package com.base.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @Author YongQiang
 * @Date 2020/6/3 11:09
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        /*String str="sfdg";
        System.out.println(str.getClass());
        String name="java.lang.String";
        try {
            System.out.println(Class.forName(name));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        /*Test test = new Test();
        Class c4 = test.getClass();
        Constructor[] constructors ;
        constructors = c4.getDeclaredConstructors();
        for (int i = 0; i < constructors.length; i++) {
            System.out.print(Modifier.toString(constructors[i].getModifiers()) + " 参数：");
            Class[] parameterTypes = constructors[i].getParameterTypes();
            for (int j = 0; j < parameterTypes.length; j++) {
                System.out.print(parameterTypes[j].getName() + " ");
            }
            System.out.println(" ");
        }*/

        /*Test test=new Test();
        Class c4=test.getClass();
        Class[] p={int.class,String.class};
        try {
            Constructor constructor=c4.getDeclaredConstructor(p);
            constructor.newInstance(24,"jyq");
            //constructor.newInstance();
            Class p2=String.class;
            constructor=c4.getDeclaredConstructor(p2);

            //constructor.setAccessible(true)；可以获取私有方法
            constructor.setAccessible(true);
            constructor.newInstance("mmmm");

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }*/

        Test test=new Test();
        Class c4=test.getClass();
        Class[] p4 = {String.class};
        Method method= null;
        try {
            method = c4.getDeclaredMethod("welcome", p4);
            method.setAccessible(true);
            method.invoke(test,"我是参数");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
