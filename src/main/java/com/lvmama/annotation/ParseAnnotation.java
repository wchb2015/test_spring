package com.lvmama.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by wchb7 on 16-5-11.
 */
public class ParseAnnotation {

    public static void main(String[] args) throws Exception {
        Class c = Class.forName("com.lvmama.annotation.Person");

//      1.解析类上的注解
        boolean isExist = c.isAnnotationPresent(Description.class);

        if (isExist) {
            Description d = (Description) c.getAnnotation(Description.class);
            System.out.println(d.author());
        }
//　　　　2.解析方法上的注解
        System.out.println("___________解析方法上的注解______________");
        Method[] ms = c.getMethods();
       /* for (Method m : ms) {
            System.out.println(m.getName());

            boolean isMExist = m.isAnnotationPresent(Description.class);

            if (isExist) {
                Description d2 = (Description) m.getAnnotation(Description.class);
                if (d2 != null) {
                    System.out.println(d2.author());
                }
            }
        }*/

        for (Method m : ms) {
            Annotation[] as = m.getAnnotations();
            for (Annotation a : as) {
                if (a instanceof Description) {
                    Description d = (Description) a;
                    System.out.println(d.author());
                }
            }
        }

    }
}
