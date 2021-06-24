package com.wchb.test.spring;

import com.wchb.test.spring.annotation.UserService2;
import org.junit.Test;

public class SpringAnnotation extends UnitTestBase {
    public SpringAnnotation()
    {
        super("classpath:spring-annotation.xml");
    }

    @Test
    public void test()
    {
        getBean(UserService2.class).save("ha");
    }
}
