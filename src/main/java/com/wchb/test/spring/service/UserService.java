package com.wchb.test.spring.service;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    public UserService()
    {
        System.out.println("Init UserService without parameter");
    }
}
