package com.wchb.test.spring;

import org.junit.Test;

public class SpringTest extends UnitTestBase {

    public SpringTest()
    {
        super("classpath:spring-config.xml");
    }

    @Test
    public void test()
    {
        System.out.println(getBean("user").toString());
    }
}
