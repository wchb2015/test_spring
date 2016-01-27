package com.spring.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wangchongbei on 16-1-27.
 */
public class Main {

    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculatorImpl();

        System.out.println(arithmeticCalculator.getClass().getName());//com.spring.aop.ArithmeticCalculatorImpl

        arithmeticCalculator = new AriCalLogProxy(arithmeticCalculator).getLogProxy();//com.sun.proxy.$Proxy0

        System.out.println(arithmeticCalculator.getClass().getName());

        arithmeticCalculator.add(11, 12);

        arithmeticCalculator.div(21, 3);

    }

    @Test
    public void aopTest(){

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-aop.xml");

        ArithmeticCalculator arithmeticCalculator = (ArithmeticCalculator) ctx.getBean("arithmeticCalculator");

        System.out.println(arithmeticCalculator.getClass().getName());

        arithmeticCalculator.add(11, 12);

        arithmeticCalculator.div(21, 3);
    }
}
