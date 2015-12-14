package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by wangchongbei on 15-12-14.
 */

@Controller
public class UserAction {


    @Autowired
    private UserService userService;
}
