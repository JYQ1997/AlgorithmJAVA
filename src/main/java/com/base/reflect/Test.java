package com.base.reflect;

/**
 * @Author YongQiang
 * @Date 2020/6/3 11:13
 * @Version 1.0
 */

public class Test {
    private int age;
    private String name;
    private int testInt;

    public Test() {
    }

    private Test(String name) {
        this.name = name;
        System.out.println("My Name is " + name);
    }

    public Test(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("hello " + name + " i am " + age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTestInt() {
        return testInt;
    }

    public void setTestInt(int testInt) {
        this.testInt = testInt;
    }

    private void welcome(String out){
        System.out.println("输出内容："+out);
    }
}
