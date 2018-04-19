package com.demo.entity;

/**
 * Created by cgl on 2018/3/18
 */
public class Student {
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    private Integer id;
    
    private String name;
}
