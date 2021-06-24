package com.wchb.test.spring.annotation;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    public void save(String data)
    {
        System.out.println("Save data with Dao");
    }
}
