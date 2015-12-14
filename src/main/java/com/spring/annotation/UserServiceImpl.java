package com.spring.annotation;

import com.lvmama.service.BeanInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.lang.UsesJava7;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by wangchongbei on 15-12-14.
 */

@Service
//@Scope("prototype")
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private Map<String, BeanInterface> map;

    @Autowired
    private List<BeanInterface> list;

    @Qualifier("beanImplTwo")
    @Autowired
    private BeanInterface beanInterface;


    public void saveUser(User user) {
        System.out.println("-------------UserServiceImpl SaveUser()!");
        userDao.saveUser(user);
        System.out.println("application:" + applicationContext.getApplicationName());
        System.out.println(map.size() + "-------------------" + list.size());
    }
}
