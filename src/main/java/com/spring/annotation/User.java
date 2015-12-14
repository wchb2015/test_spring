package com.spring.annotation;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by wangchongbei on 15-12-14.
 */

@Component
public class User {
    private String name;
    private Date birthDate;
    private String email;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
