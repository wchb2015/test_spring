package com.spring.aop;

import org.springframework.stereotype.Component;

@Component("arithmeticCalculator")
public class ArithmeticCalculatorImpl implements ArithmeticCalculator {

    public int add(int i, int j) {
        return i + j;
    }


    public int sub(int i, int j) {
        return i - j;
    }


    public int mul(int i, int j) {
        return i * j;
    }


    public int div(int i, int j) {
        return i / j;
    }

}
