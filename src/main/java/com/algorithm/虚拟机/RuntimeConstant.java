package com.algorithm.虚拟机;

/**
 * @Author YongQiang
 * @Date 2020/3/10 9:03
 * @Version 1.0
 */
public class RuntimeConstant {
    public static void main(String[] args) {
        String str1=new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern()==str1);
        str1 = "22222";
        System.out.println(str1.intern()==str1);

        String strs=new StringBuilder("in").append("t").toString();
        System.out.println(strs.intern()==strs);
    }
}
