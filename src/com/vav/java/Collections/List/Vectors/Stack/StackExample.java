package com.vav.java.Collections.List.Vectors.Stack;

import java.util.Stack;

/**
 * Created by Vaibhav on 4/16/2017.
 */
public class StackExample {
    public static void main(String arg[]){
        Stack<Integer> stack = new Stack<>();
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.pop()+" Size now="+stack.size());
    }
}
