package com.lvmama.job;

import org.apache.log4j.Logger;

/**
 * Created by wangchongbei on 15-12-15.
 */
public class QuartzJob2 implements Runnable {
    private static final Logger LOG = Logger.getLogger(QuartzJob2.class);


    public void run() {
        LOG.info("---------$$$QuartzJob2    Run!!!");
    }
}
