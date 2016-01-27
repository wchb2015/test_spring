package com.spring.transaction;

/**
 * Created by wchb7 on 16-1-24.
 */
public interface AccountDao {

    void outMoney(String out, Double money);

    void inMoney(String in, Double money);

}
