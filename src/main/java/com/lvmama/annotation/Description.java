package com.lvmama.annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Description {

    String desc();

    String author();

    int age() default 18;

}
