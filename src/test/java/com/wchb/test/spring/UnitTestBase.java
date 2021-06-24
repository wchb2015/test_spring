package com.wchb.test.spring;

import org.apache.commons.lang3.StringUtils;
import org.junit.After;
import org.junit.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UnitTestBase {

    private ClassPathXmlApplicationContext context;

    private String springXmlpath;

    public UnitTestBase()
    {
    }

    public UnitTestBase(String springXmlpath)
    {
        this.springXmlpath = springXmlpath;
    }

    @Before
    public void before()
    {
        if (StringUtils.isEmpty(springXmlpath))
        {
            springXmlpath = "classpath*:spring-*.xml";
        }
        try
        {
            context = new ClassPathXmlApplicationContext(springXmlpath);
            context.start();
        } catch (BeansException e)
        {
            e.printStackTrace();
        }
    }

    @After
    public void after()
    {
        context.close();
    }

    @SuppressWarnings("unchecked")
    protected <T extends Object> T getBean(String beanId)
    {
        try
        {
            return (T) context.getBean(beanId);
        } catch (BeansException e)
        {
            e.printStackTrace();
            return null;
        }
    }

    protected <T extends Object> T getBean(Class<T> clazz)
    {
        try
        {
            return context.getBean(clazz);
        } catch (BeansException e)
        {
            e.printStackTrace();
            return null;
        }
    }

}