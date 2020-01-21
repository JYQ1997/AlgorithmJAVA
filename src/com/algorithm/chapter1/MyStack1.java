package com.algorithm.chapter1;

import java.util.Stack;

/**
 * 设计一个有getMain功能的栈
 * @Author YongQiang
 * @Date 2020/1/20 16:22
 * @Version 1.0
 */
public class MyStack1 {
    private Stack<Integer> stackDate;
    private Stack<Integer> stackMin;

    public MyStack1() {
        this.stackDate=new Stack<Integer>();
        this.stackMin=new Stack<Integer>();
    }

    public static void main(String[] args) {
        MyStack1 myStack1=new MyStack1();
        myStack1.push(3);
        myStack1.push(5);
        myStack1.push(5);
        myStack1.push(9);
        myStack1.push(7);
        System.out.println("最小值是" + myStack1.getMin() );
    }

    public void push(Integer num){
        this.stackDate.push(num);
        if (this.stackMin.empty()){
            this.stackMin.push(num);
        }
        //暂不明为什么要等于
        else if (this.stackMin.peek()>=num){
            this.stackMin.push(num);
        }

    }

    public Integer pop(){
        Integer num=this.stackDate.pop();
        if (this.stackMin.peek().equals(num)){
            this.stackMin.pop();
        }
        return num;
    }

    public Integer getMin(){
        return this.stackMin.peek();
    }

}
