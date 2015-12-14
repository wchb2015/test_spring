package com.spring.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Arrays;

/**
 * Created by wangchongbei on 15-12-14.
 */
public class MoocApplicationContext implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        System.out.println("------------MoocApplicationContext : " + applicationContext.getBean("moocApplicationContext").hashCode());
        System.out.println("------------this.applicationContext BeanDefinitionNames: " + Arrays.asList(applicationContext.getBeanDefinitionNames()));
    }
}
