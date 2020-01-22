package com.algorithm.chapter1;

import java.util.Stack;

/**
 * 用递归函数和栈操作逆序一个栈
 * @Author YongQiang
 * @Date 2020/1/22 15:53
 * @Version 1.0
 */
public class ReverseStack {

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(3);
        stack.push(5);
        stack.push(5);
        stack.push(9);
        stack.push(7);
        ReverseStack reverseStack=new ReverseStack();
        reverseStack.reverse(stack);
    }

    public int getAndRemoveLastElement(Stack<Integer> stack){
        int result=stack.pop();
        if (stack.isEmpty()){
            return result;
        }
        else {
            int last=getAndRemoveLastElement(stack);
            stack.push(result);
            return last;
        }
    }

    public void reverse(Stack<Integer> stack){
        if (stack.isEmpty()){
            return;
        }
        int i=getAndRemoveLastElement(stack);
        reverse(stack);
        stack.push(i);
    }
}
