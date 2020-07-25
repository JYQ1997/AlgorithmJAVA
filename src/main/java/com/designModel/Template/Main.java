package com.designModel.Template;

/**
 * @Author YongQiang
 * @Date 2020/3/18 8:39
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        AbstractDisplay c=new CharDisplay('s');
        c.display();
        AbstractDisplay s=new StringDisplay("hello");
        s.display();
        AbstractDisplay z=new StringDisplay("姬永强你好");
        z.display();

    }
}
