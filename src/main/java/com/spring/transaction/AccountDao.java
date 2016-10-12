package com.spring.transaction;

public interface AccountDao {

    void outMoney(String out, Double money);

    void inMoney(String in, Double money);

}
