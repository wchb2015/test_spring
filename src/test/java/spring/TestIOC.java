package spring;

import com.lvmama.service.SysLogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by wangchongbei on 15-12-14.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestIOC extends UnitTestBase {
    public TestIOC() {
        super("spring-ioc.xml");
    }


    @Test
    public void testIOC() {
        SysLogService sysLogService = super.getBean("sysLogService");
        sysLogService.saveSysLog(null);
    }

}