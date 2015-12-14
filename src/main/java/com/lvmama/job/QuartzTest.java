package com.lvmama.job;

import org.apache.log4j.Logger;

/**
 * Created by wangchongbei on 15-12-14.
 */
public class QuartzTest implements Runnable {

    private static final Logger LOG = Logger.getLogger(QuartzTest.class);


    public void run() {
        LOG.info("---------$$$QuartzTest Run!!!");
    }
}
