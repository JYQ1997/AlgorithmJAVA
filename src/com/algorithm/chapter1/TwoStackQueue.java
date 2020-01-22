package com.algorithm.chapter1;

import java.util.Stack;

/**
 * 由两个栈组成队列
 * @Author YongQiang
 * @Date 2020/1/21 16:19
 * @Version 1.0
 */
public class TwoStackQueue {

    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;

    public TwoStackQueue() {
        this.stackPush=new Stack<Integer>();
        this.stackPop=new Stack<Integer>();
    }

    public void pushToPop(){
        if (stackPop.empty()){
            while (!stackPush.empty()){
                stackPop.push(stackPush.pop());
            }
        }
    }

    public void add(int pushInt){
        this.stackPush.push(pushInt);
        pushToPop();
    }

    public int poll(){
        if (this.stackPush.empty()&&this.stackPop.empty()){
            throw new RuntimeException("Queue is Empty");
        }
        pushToPop();
        return this.stackPop.pop();
    }

    public int peek(){

        if (this.stackPush.empty()&&this.stackPop.empty()){
            throw new RuntimeException("Queue is Empty");
        }
        pushToPop();
        return this.stackPop.peek();
    }

    public static void main(String[] args) {
        TwoStackQueue twoStackQueue=new TwoStackQueue();
        twoStackQueue.add(52);
        twoStackQueue.add(12);
        twoStackQueue.add(48);
        twoStackQueue.add(25);
        int num1=twoStackQueue.poll();
        int num2=twoStackQueue.poll();
        int num3=twoStackQueue.poll();
        int num4=twoStackQueue.poll();
        System.out.println("num1 = [" + num1 + "]");
    }
}
