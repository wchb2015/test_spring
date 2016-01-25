package com.lvmama.transaction;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by wchb7 on 16-1-24.
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

    public void outMoney(String out, Double money) {
        String sql = "update account_t set money=money-? where name=?";
        this.getJdbcTemplate().update(sql, money, out);
    }

    public void inMoney(String in, Double money) {
        String sql = "update account_t set money=money+? where name=?";
        this.getJdbcTemplate().update(sql, money, in);
    }
}
