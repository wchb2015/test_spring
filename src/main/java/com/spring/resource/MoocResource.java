package com.spring.resource;

/**
 * Created by wangchongbei on 15-12-14.
 */

import java.io.IOException;

import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;


public class MoocResource implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }


    public void resource() throws IOException {
        Resource resource = applicationContext.getResource("classpath:log4j.properties");
        System.out.println(resource.getFilename());
        System.out.println(resource.contentLength());
    }

}