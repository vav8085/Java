package com.vav.java.Junit;

import java.math.BigDecimal;
import java.util.Stack;

/**
 * Created by Vaibhav on 3/3/17.
 */
public class Calculator {
    //private Stack<BigDecimal> stack = new Stack<>();
    private OperandStack stack = new OperandStack();


    public BigDecimal getAccumulator() {

        return stack.peek();
    }

    public void setAccumulator(BigDecimal accumulator) {
        stack.ReplaceTop(accumulator);
    }

    public void enter() {
        stack.push(getAccumulator());
    }

    public void drop() {
        stack.pop();
    }
}
