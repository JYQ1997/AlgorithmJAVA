package com.designModelTest.Factory.idcard;

import com.designModelTest.Factory.framework.Factory;
import com.designModelTest.Factory.framework.Product;

import java.util.HashMap;

/**
 * @Author YongQiang
 * @Date 2020/3/17 20:51
 * @Version 1.0
 */
public class IDCardFactory extends Factory {

    private HashMap database=new HashMap();
    private int serial=100;

    @Override
    protected synchronized Product createProdect(String owner) {
        return new IDCard(owner,serial++);
    }

    @Override
    protected void registProdect(Product product) {
        IDCard card= (IDCard) product;
        database.put(new Integer(card.getID()),card.getOwner());
    }

    public HashMap getDatabase() {
        return database;
    }
}
