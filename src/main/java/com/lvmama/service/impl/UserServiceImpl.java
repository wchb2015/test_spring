package com.lvmama.service.impl;

import com.lvmama.dao.UserDao;
import com.lvmama.model.User;
import com.lvmama.service.UserService;

/**
 * Created by wangchongbei on 15-12-14.
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;


    public void saveUser(User user) {
        System.out.println("-------------UserServiceImpl SaveUser()!");
        userDao.saveUser(user);
    }
}
