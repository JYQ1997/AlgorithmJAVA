package com.designModel.protype;

import com.designModel.protype.framework.Product;

/**
 * @Author YongQiang
 * @Date 2020/3/18 13:53
 * @Version 1.0
 */
public class UnderLinePen implements Product {
    private char ulchar;

    public UnderLinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int length=s.getBytes().length;
        System.out.println("\"" + s + "\"");
        System.out.println(" ");
        for (int i=0;i<length+4;i++){
            System.out.print(ulchar);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() {
        Product p=null;
        try {
            p= (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
