package com.spring.transaction;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by wangchongbei on 16-1-25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-transaction-3.xml")
public class Test {

    @Resource(name = "accountService")
    private AccountService accountService;

    @org.junit.Test
    public void demo1() {

        accountService.transfer("aaa", "bbb", 200d);

    }
}
