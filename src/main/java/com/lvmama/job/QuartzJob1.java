package com.lvmama.job;

import org.apache.log4j.Logger;

/**
 * Created by wangchongbei on 15-12-14.
 */
public class QuartzJob1 implements Runnable {

    private static final Logger LOG = Logger.getLogger(QuartzJob1.class);


    public void run() {
        LOG.info("---------$$$QuartzJob1    Run!!!");
    }
}
