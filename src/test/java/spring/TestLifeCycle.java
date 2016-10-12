package spring;

import com.spring.lifecycle.BeanLifeCycle;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestLifeCycle extends UnitTestBase {
    public TestLifeCycle() {
        super("spring-lifecycle.xml");
    }


    @Test
    public void testLifeCycle() {
        BeanLifeCycle lifeCycle = super.getBean("beanLifeCycle");

    }

}
