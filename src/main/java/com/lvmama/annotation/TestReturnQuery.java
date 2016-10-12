package com.lvmama.annotation;


public class TestReturnQuery {

    public static void main(String[] args) {
        User u1 = new User();

        u1.setCity("shanghai");

        u1.setId(1);

        User u2 = new User();
        u2.setEmail("123@163.com,123@qq.com");

        System.out.println(ReturnQuery.query(u1));
        System.out.println(ReturnQuery.query(u2));

    }

}
