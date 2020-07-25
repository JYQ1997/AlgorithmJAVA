package com.designModel.Proxy;

/**
 * @Author YongQiang
 * @Date 2020/4/8 13:20
 * @Version 1.0
 */
public class Printer implements Printable {

    private String name;

    public Printer() {

        heavyJob("Printer的实例生成中");
    }

    public Printer(String name) {
        this.name = name;
        heavyJob("Printer的实例生成中（"+name+")");
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public void print(String string){
        System.out.println("=== " + name + " ===");
        System.out.println(string);
    }

    private void heavyJob(String msg){
        System.out.println(msg);
        for (int i = 0; i < 5; i++) {
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
            }
            System.out.print(".");
        }
        System.out.println("结束");
    }
}