package com.vav.java.Junit;

import java.math.BigDecimal;

/**
 * Created by Vaibhav on 3/3/17.
 */
public class Calculator {

    private BigDecimal accumulator = BigDecimal.ZERO;

    public BigDecimal getAccumulator() {
        return accumulator;
    }

    public void setAccumulator(BigDecimal accumulator) {
        this.accumulator = accumulator;
    }
}
