package com.demo.testProxy;

/**
 * Created by cgl on 2018/3/22
 */
public class UserDaoImpl implements UserDao{
    
    @Override
    public void hello() {
        System.out.println("\"hello()\" = " + "thsi is hello");
    }
}
