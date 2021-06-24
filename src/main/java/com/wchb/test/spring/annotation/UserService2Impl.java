package com.wchb.test.spring.annotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService2Impl implements UserService2 {

    @Autowired
    private UserDao dao;

    @Override
    public void save(String data)
    {
        dao.save(data);
    }
}
