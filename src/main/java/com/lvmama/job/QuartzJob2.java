package com.lvmama.job;

import org.apache.log4j.Logger;

public class QuartzJob2 implements Runnable {
    private static final Logger LOG = Logger.getLogger(QuartzJob2.class);


    public void run() {
        LOG.info("---------$$$QuartzJob2    Run!!!");
    }
}
