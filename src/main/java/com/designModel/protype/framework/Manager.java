package com.designModel.protype.framework;

import java.util.HashMap;

/**
 * @Author YongQiang
 * @Date 2020/3/18 11:33
 * @Version 1.0
 */
public class Manager {
    private HashMap showcase=new HashMap();

    public void register(String name,Product product){
        showcase.put(name,product);
    };

    public Product create(String name){
        Product p= (Product) showcase.get(name);
        return p.createClone();
    }

}
