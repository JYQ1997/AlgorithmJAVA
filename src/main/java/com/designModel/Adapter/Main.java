package com.designModel.Adapter;

/**
 * @Author YongQiang
 * @Date 2020/3/16 20:12
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Printer pt=new BannerPrinter("hello");
        pt.printWeak();
        pt.printStrong();
        Printer2 pt2=new BannerPrint2("hellossss");
        pt.printWeak();
        pt.printStrong();
    }
}
