package com.spring.annotation;

import com.lvmama.dao.BaseDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends BaseDao {
    public void saveUser(User user) {
        System.out.println("------------UserDao SaveUser()!!!");
    }
}
