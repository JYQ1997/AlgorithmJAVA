package com.designModel.protype.framework;

/**
 * @Author YongQiang
 * @Date 2020/3/18 11:32
 * @Version 1.0
 */
public interface Product extends Cloneable {
    public abstract void use(String s);
    public abstract Product createClone();
}
