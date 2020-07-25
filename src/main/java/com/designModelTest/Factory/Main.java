package com.designModelTest.Factory;

import com.designModelTest.Factory.framework.Factory;
import com.designModelTest.Factory.framework.Product;
import com.designModelTest.Factory.idcard.IDCardFactory;

/**
 * @Author YongQiang
 * @Date 2020/3/17 20:58
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {

        Factory factory=new IDCardFactory();
        Product product1=factory.create("小米");
        Product product2=factory.create("华为");
        Product product3=factory.create("夏驰");
        product1.use();
        product2.use();
        product3.use();

    }
}
