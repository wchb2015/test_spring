package com.lvmama.transaction;

/**
 * Created by wchb7 on 16-1-24.
 */
public interface AccountService {
    void transfer(String in, String out, Double money);
}
