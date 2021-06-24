package com.wchb.test.spring.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

    private String name;
    private Long id;
    private Car car;

    public User(String name, Long id, Car car)
    {
        this.name = name;
        this.id = id;
        this.car = car;
        System.out.println("Init User with parameter");

    }

    public User()
    {
        System.out.println("Init User without parameter");
    }
}
