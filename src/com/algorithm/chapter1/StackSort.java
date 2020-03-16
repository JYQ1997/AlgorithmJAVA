package com.algorithm.chapter1;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 用一个栈实现另一个栈的排序
 * @Author YongQiang
 * @Date 2020/1/23 9:46
 * @Version 1.0
 */
public class StackSort {

    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add("s");
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(5);
        stack.push(48);
        stack.push(12);
        stack.push(25);
        stack.push(8);
        StackSort stackSort=new StackSort();
        stackSort.SortStackByStack(stack);
        System.out.println("args = [" + 123 + "]");
    }

    public void SortStackByStack(Stack<Integer> stack){
        Stack<Integer> helpStack=new Stack<Integer>();

        while (!stack.isEmpty()){
            int curl=stack.pop();
            while (!helpStack.isEmpty()&&helpStack.peek()>curl){
                stack.push(helpStack.pop());
            }
            helpStack.push(curl);
        }
        while (!helpStack.isEmpty()){
            stack.push(helpStack.pop());
        }

    }
}
