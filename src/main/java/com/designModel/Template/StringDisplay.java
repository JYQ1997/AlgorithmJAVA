package com.designModel.Template;

/**
 * @Author YongQiang
 * @Date 2020/3/18 8:34
 * @Version 1.0
 */
public class StringDisplay extends AbstractDisplay {
    private String ss;

    public StringDisplay(String ss) {
        this.ss = ss;
    }

    @Override
    public void open() {
        println();
    }

    @Override
    public void print() {
        System.out.println("|"+ss+"|");
    }

    @Override
    public void close() {
        println();
    }
    public void println(){
        System.out.print("+");
        for (int i=0;i<ss.length();i++){
            System.out.print("-");
        }
        System.out.println("+");
    }
}
