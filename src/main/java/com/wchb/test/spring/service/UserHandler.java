package com.wchb.test.spring.service;

import com.wchb.test.spring.model.User;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class UserHandler {

    private User user;

    @Autowired
    public void setUser(User user)
    {
        this.user = user;
    }


    public UserHandler()
    {
        System.out.println("Init UserHandler without parameter " + user);
    }
}
