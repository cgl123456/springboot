package com.demo.service;

import com.demo.entity.Student;

/**
 * Created by cgl on 2018/3/19
 */
public interface StudentService {
    
    Student SelectUserById(Integer id);
    
    Integer InsertUser(Integer id, String name);
}
