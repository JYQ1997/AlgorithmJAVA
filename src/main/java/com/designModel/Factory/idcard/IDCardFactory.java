package com.designModel.Factory.idcard;

import com.designModel.Factory.framework.Factory;
import com.designModel.Factory.framework.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author YongQiang
 * @Date 2020/3/17 20:51
 * @Version 1.0
 */
public class IDCardFactory extends Factory {

    private List owners=new ArrayList();

    @Override
    protected Product createProdect(String owner) {
        IDCard idCard=new IDCard(owner);
        return idCard;
    }

    @Override
    protected void registProdect(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
