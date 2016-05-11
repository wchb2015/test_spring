package com.lvmama.annotation;

import com.sun.org.glassfish.gmbal.*;

/**
 * Created by wchb7 on 16-5-11.
 */
@Description(desc = "desc1", author = "author1")
public class Person {

    @Description(desc = "desc2", author = "author2")
    private String eyeColor;

    private String name;


    @Description(author = "author3", desc = "desc3")
    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    @Description(author = "author4", desc = "desc4")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
