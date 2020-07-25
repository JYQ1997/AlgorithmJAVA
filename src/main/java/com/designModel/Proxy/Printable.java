package com.designModel.Proxy;

/**
 * @Author YongQiang
 * @Date 2020/4/8 13:19
 * @Version 1.0
 */
public interface Printable {

    public abstract void setPrinterName(String name);
    public abstract String getPrinterName();
    public abstract void print(String string);

}
