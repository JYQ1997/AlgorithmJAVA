package com.designModelTest.Adapter;

import java.io.*;
import java.util.Properties;

/**
 * @Author YongQiang
 * @Date 2020/3/16 20:35
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        properties.load(new FileInputStream(new File("D:\\a.txt")));
        properties.setProperty("d","400");
        properties.setProperty("e","500");
        properties.setProperty("f","600");
        OutputStream out=new FileOutputStream("D:\\b.txt");
        properties.store(out,"String");
        System.out.println(properties.stringPropertyNames());
    }
}
