package com.spring.aware;

import org.springframework.beans.factory.BeanNameAware;

public class MoocBeanName implements BeanNameAware {
    private String beanName;


    public void setBeanName(String name) {
        this.beanName = name;
        System.out.println("--------------MoocBeanName : " + name);
    }

}
