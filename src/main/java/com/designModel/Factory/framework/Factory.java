package com.designModel.Factory.framework;

/**
 * @Author YongQiang
 * @Date 2020/3/17 20:40
 * @Version 1.0
 */
public abstract class Factory {
    public Product create(String owner){
        Product p=createProdect(owner);
        registProdect(p);
        return p;
    };
    protected abstract Product createProdect(String owner);
    protected abstract void registProdect(Product product);
}
