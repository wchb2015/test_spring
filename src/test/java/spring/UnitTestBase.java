package spring;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.After;
import org.junit.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

import java.util.Arrays;

public class UnitTestBase {

    private static final Log LOG = LogFactory.getLog(UnitTestBase.class);

    private ClassPathXmlApplicationContext context;

    private String springXmlPath;

    private String lineSeparator = System.getProperty("line.separator");

    public UnitTestBase() {
    }

    public UnitTestBase(String springXmlPath) {
        this.springXmlPath = springXmlPath;
    }

    @Before
    public void before() {
        if (StringUtils.isEmpty(springXmlPath)) {
            springXmlPath = "application-context.xml";
        }
        try {
            context = new ClassPathXmlApplicationContext(springXmlPath.split("[,\\s]+"));
            context.start();
            LOG.error(lineSeparator + "######  BeanDefinitionCount:" + context.getBeanDefinitionCount() +
                    lineSeparator + "######  BeanDefinitionNames:" + Arrays.asList(context.getBeanDefinitionNames()));

        } catch (BeansException e) {
            e.printStackTrace();
        }
    }

    @After
    public void after() {
        context.destroy();
    }

    protected <T extends Object> T getBean(String beanId) {
        try {
            return (T) context.getBean(beanId);
        } catch (BeansException e) {
            e.printStackTrace();
            return null;
        }
    }

    protected <T extends Object> T getBean(Class<T> clazz) {
        try {
            return context.getBean(clazz);
        } catch (BeansException e) {
            e.printStackTrace();
            return null;
        }
    }

}
