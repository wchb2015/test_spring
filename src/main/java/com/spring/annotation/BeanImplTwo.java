package com.spring.annotation;

import com.lvmama.service.BeanInterface;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
public class BeanImplTwo implements BeanInterface {
}
