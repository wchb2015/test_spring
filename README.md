### spring的学习例子.

* User 注解配置　Log  xml配置

* Bean的配置项
* Bean的作用域
    singleton(Default)/prototype...
* Bean的生命周期
   1. 定义
   2. 初始化
   3. 使用
   4. 销毁
* Bean的自动装配
* Resources&&ResourcesLoader

* Bean管理的注解实现
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

* Spring事务管理
```sql
CREATE TABLE  account_t (
 id INT(11) NOT NULL AUTO_INCREMENT,
 name VARCHAR(20) NOT NULL,
 money DOUBLE DEFAULT NULL,
 PRIMARY KEY(id)
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
INSERT INTO account_t(name,money) VALUE('aaa','1000');
INSERT INTO account_t(name,money) VALUE('bbb','1000');
INSERT INTO account_t(name,money) VALUE('ccc','1000');
```

* 注解学习(案例:注解反射生成SQL语句)