package com.designModel.Factory.idcard;

import com.designModel.Factory.framework.Product;

/**
 * @Author YongQiang
 * @Date 2020/3/17 20:45
 * @Version 1.0
 */
public class IDCard extends Product {
    private String owner;

    IDCard(String owner) {
        System.out.println("制作" + owner +"的ID卡");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用"+ owner + "的ID卡");
    }


    public String getOwner(){
        return owner;
    }

}
