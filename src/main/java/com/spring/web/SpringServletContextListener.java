package com.spring.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.Arrays;

/**
 * Created by wangchongbei on 15-12-16.
 */
public class SpringServletContextListener implements ServletContextListener {
    private static final Log LOG = LogFactory.getLog(SpringServletContextListener.class);


    public void contextInitialized(ServletContextEvent servletContextEvent) {
        //1.获取 Spring 配置文件的名称.
        ServletContext servletContext = servletContextEvent.getServletContext();
        String config = servletContext.getInitParameter("contextConfigLocation");

        //2.创建 IOC 容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);

        //3.把 IOC 容器放在 ServletContext 的一个属性中.
        servletContext.setAttribute("ApplicationContext", ctx);

        LOG.info("-----------BeanDefinitionCount:" + ctx.getBeanDefinitionCount() + "   BeanDefinitionNames" +
                "-------------" + Arrays.asList(ctx.getBeanDefinitionNames()));
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
