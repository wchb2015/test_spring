# test_Spring
This is my Spring test project.


> * User 注解
> * Log  xml

* bean的配置项
* bean的作用域
    singleton(Default)/prototype...
* bean的生命周期
   1. 定义
   2. 初始化
   3. 使用
   4. 销毁
* bean的自动装配
* Resources&&ResourcesLoader


* bean管理的注解实现
```java
@Component@Repository@Controller@Service
@Autowired
@Qualifier("beanImplTwo")
```

* QuartzTest

* WEB环境中如何使用Spring？
   1. 需要额外的jar包：spring-web-4.0.0.RELEASE.jar 
   2. spring的配置文件是一样的
   3. 如何创建IOC容器？  
   ①. 非 WEB 应用在 main 方法中直接创建  
   ②. WEB 应用应该应用被服务器加载时就创建IOC 容器:在ServletContextListener#contextInitialized(ServletContextEvent sce) 方法中创建 IOC 容器.  
   ③. 在 WEB 应用的其他组件中如何来访问 IOC 容器呢 ?  
   在 ServletContextListener#contextInitialized(ServletContextEvent sce) 方法中创建 IOC 容器后, 可以把其放在ServletContext(即 application 域)的一个属性中.   
   ④. 实际上, Spring 配置文件的名字和位置应该也是可配置的! 将其配置到当前 WEB 应用的初始化参数中较为合适. 
   ```xml
    <listener>
        <listener-class>org.springframework.web.context.ContextLoaderListener
        </listener-class>
    </listener>
    <context-param>
        <param-name>contextConfigLocation</param-name>
        <param-value>classpath:spring-quartz.xml</param-value>
    </context-param>
   ```
