package com.lvmama.transaction;

import org.springframework.transaction.annotation.Transactional;

/**
 * Created by wchb7 on 16-1-24.
 */

@Transactional()
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    public void transfer(String in, String out, Double money) {

        accountDao.outMoney(out, money);

        int i = 1 / 0;

        accountDao.inMoney(in, money);

    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

}
