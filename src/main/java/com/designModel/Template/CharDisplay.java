package com.designModel.Template;

/**
 * @Author YongQiang
 * @Date 2020/3/18 8:32
 * @Version 1.0
 */
public class CharDisplay extends AbstractDisplay {
    private char cc;

    public CharDisplay(char cc) {
        this.cc = cc;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(cc);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
