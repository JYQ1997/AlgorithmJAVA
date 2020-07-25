package com.designModel.Proxy;

/**
 * @Author YongQiang
 * @Date 2020/4/8 13:36
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Printable p=new PrinterProxy("Alice");
        System.out.println("现在的名字是" + p.getPrinterName() + "。");
        p.setPrinterName("Bob");
        System.out.println("现在的名字是" + p.getPrinterName() + "。");
        p.print("Hello,World");
    }
}
