package spring;

import com.spring.annotation.UserService;
import com.spring.annotation.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by wangchongbei on 15-12-14.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanAnnotation extends UnitTestBase {

    public TestBeanAnnotation() {
        super("classpath*:spring-beanAnnotation.xml");
    }

    @Test
    public void testBeanAnnotation() {
        UserService service = super.getBean("userServiceImpl");
        service.saveUser(null);
    }

    @Test
    public void testScope() {
        UserService service = super.getBean("userServiceImpl");

        System.out.println("-------------" + service.hashCode());

        UserService service2 = super.getBean("userServiceImpl");

        System.out.println("-------------" + service2.hashCode());
        System.out.println("$$$$$$$$$-------------" + UserServiceImpl.class.hashCode());
    }

}
