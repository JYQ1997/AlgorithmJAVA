package com.designModel.Template;

/**
 * @Author YongQiang
 * @Date 2020/3/18 8:30
 * @Version 1.0
 */
public abstract class AbstractDisplay {

    public abstract void open();
    public abstract void print();
    public abstract void close();
    public void display(){
        open();
        for (int i=0;i<5;i++){
            print();
        }
        close();
    }
}
