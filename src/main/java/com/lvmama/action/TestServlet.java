package com.lvmama.action;

import com.lvmama.job.QuartzJob1;
import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TestServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 从 application 域对象中得到 IOC 容器的引用
        ServletContext servletContext = getServletContext();
//        ApplicationContext ctx = (ApplicationContext) servletContext.getAttribute("ApplicationContext");
        ApplicationContext ctx = (ApplicationContext) servletContext.getAttribute("org.springframework.web.context.WebApplicationContext.ROOT");

        //2. 从 IOC 容器中得到需要的 bean
        QuartzJob1 job1 = ctx.getBean(QuartzJob1.class);
        job1.run();
    }
}
