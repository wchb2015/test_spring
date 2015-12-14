package com.spring.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by wangchongbei on 15-12-14.
 */
public class MoocBeanName implements BeanNameAware {
    private String beanName;


    public void setBeanName(String name) {
        this.beanName = name;
        System.out.println("--------------MoocBeanName : " + name);
    }

}
