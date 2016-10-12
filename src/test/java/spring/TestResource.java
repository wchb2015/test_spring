package spring;

import com.spring.resource.MoocResource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.io.IOException;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestResource extends UnitTestBase {

    public TestResource() {
        super("classpath:spring-resource.xml");
    }

    @Test
    public void testResource() {
        MoocResource resource = super.getBean("moocResource");
        try {
            resource.resource();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

