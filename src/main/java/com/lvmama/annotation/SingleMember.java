package com.lvmama.annotation;

import java.lang.annotation.*;

/**
 * Created by wchb7 on 16-5-11.
 * 单成员注解
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface SingleMember {

    String value();
}
