package com.vav.java.Junit;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Stack;

/**
 * Created by Vaibhav on 3/4/2017.
 */
public class OperandStack {

    private Stack<BigDecimal> stack = new Stack<>();
    public BigDecimal peek() {
        if(stack.isEmpty())
        return BigDecimal.ZERO;
        else return stack.peek();
    }

    public void push(BigDecimal value) {
        stack.push(value);
    }

    public void ReplaceTop(BigDecimal bigDecimal) {
       pop();
        stack.push(bigDecimal);
    }

    public void pop() {
        if(!stack.isEmpty())
        stack.pop();
    }
}
