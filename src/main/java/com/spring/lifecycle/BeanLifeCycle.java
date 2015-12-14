package com.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycle implements InitializingBean, DisposableBean {


    public void start() {
        System.out.println("---------BeanLifeCycle start");
    }

    public void stop() {
        System.out.println("---------BeanLifeCycle stop");
    }

    public void destroy() throws Exception {
        System.out.println("---------BeanLifeCycle destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("------------BeanLifeCycle afterPropertiesSet");
    }
}
