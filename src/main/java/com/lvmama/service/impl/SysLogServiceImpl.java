package com.lvmama.service.impl;

import com.lvmama.dao.SysLogDao;
import com.lvmama.model.SysLog;
import com.lvmama.service.SysLogService;

public class SysLogServiceImpl implements SysLogService {

    private SysLogDao sysLogDao;

    public void saveSysLog(SysLog log) {
        System.out.println("###### SysLogServiceImpl saveSysLog()!!!!");
        sysLogDao.saveSysLogDao(log);
    }

    public void setSysLogDao(SysLogDao sysLogDao) {
        this.sysLogDao = sysLogDao;
    }
}
