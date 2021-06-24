package com.wchb.test.spring.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Car {

    private String brand;
    private Long price;

    public Car(String brand, Long price)
    {
        this.brand = brand;
        this.price = price;
        System.out.println("Init car with parameter");
    }

    public Car()
    {
        System.out.println("Init car without parameter");
    }
}
