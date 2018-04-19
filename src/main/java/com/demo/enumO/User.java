package com.demo.enumO;

/**
 * Created by cgl on 2018/3/22
 */
public enum User {
    STUDENT("小明"),
    
    TEACHER("1"),
    
    WORK("2");
    
    private String name;
    
    User(){}
    
    User(String name){
        this.name = name;
    }
}
