<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="org.springframework.context.ApplicationContext" %>
<%@ page import="java.util.Arrays" %><%--
  Created by IntelliJ IDEA.
  User: wangchongbei
  Date: 15-12-14
  Time: 上午11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test_Spring</title>
</head>
<body>
哈哈！<br/>
<a href="TestServlet">TestServlet</a><br/>

<%
    //1. 从 application 域对象中得到 IOC 容器的实例
    ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(application);

    System.out.println("----------" + Arrays.asList(ctx.getBeanDefinitionNames()));
%>
</body>
</html>
