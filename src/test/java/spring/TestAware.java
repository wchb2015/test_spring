package spring;

import com.spring.aware.MoocApplicationContext;
import com.spring.aware.MoocBeanName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAware extends UnitTestBase {
    public TestAware() {
        super("spring-aware.xml");
    }

    @Test
    public void testAware() {
        MoocApplicationContext moocApplicationContext = super.getBean("moocApplicationContext");
        MoocBeanName beanName = super.getBean("moocBeanName");
        System.out.println(moocApplicationContext.hashCode());
    }

}
