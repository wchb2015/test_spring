import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import spring.UnitTestBase;

/**
 * Created by wangchongbei on 15-12-14.
 */

@RunWith(BlockJUnit4ClassRunner.class)
public class TestQuartz extends UnitTestBase {
    public TestQuartz() {
        super("spring-quartz.xml");
    }


    @Test
    public void testQuartz() {

    }

}
