package com.designModel.protype;

import com.designModel.protype.framework.Manager;
import com.designModel.protype.framework.Product;

/**
 * @Author YongQiang
 * @Date 2020/3/18 13:58
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
        Manager manager=new Manager();
        UnderLinePen upen=new UnderLinePen('~');
        MessageBox mbox=new MessageBox('*');
        MessageBox sbox=new MessageBox('/');
        manager.register("UnderLinePen",upen);
        manager.register("MessageBox",mbox);
        manager.register("messageBox",sbox);

        Product p1=manager.create("UnderLinePen");
        p1.use("hello");
        Product p2=manager.create("MessageBox");
        p2.use("hello");
        Product p3=manager.create("messageBox");
        p3.use("hello");
    }
}
