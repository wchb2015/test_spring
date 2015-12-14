package com.spring.annotation;

import com.lvmama.service.BeanInterface;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by wangchongbei on 15-12-14.
 */

@Order(1)
@Component
public class BeanImplOne implements BeanInterface {
}
