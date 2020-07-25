package com.designModel.Adapter;

/**
 * @Author YongQiang
 * @Date 2020/3/16 20:14
 * @Version 1.0
 */
public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen(){
        System.out.println("("+string+")");
    }
    public void showWithAster(){
        System.out.println("*"+string+"*");
    }
}
