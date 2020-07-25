package com.designModelTest.Factory.idcard;

import com.designModelTest.Factory.framework.Product;

/**
 * @Author YongQiang
 * @Date 2020/3/17 20:45
 * @Version 1.0
 */
public class IDCard extends Product {
    private String owner;
    private int ID;

    IDCard(String owner,int id) {
        System.out.println("制作" + owner + "(" + id + ")" + "的ID卡");
        this.owner = owner;
        this.ID=id;
    }

    @Override
    public void use() {
        System.out.println("使用"+ owner + "(" + ID + ")" + "的ID卡");
    }

    public int getID() {
        return ID;
    }

    public String getOwner(){
        return owner;
    }

}
