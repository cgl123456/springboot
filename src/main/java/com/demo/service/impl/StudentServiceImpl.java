package com.demo.service.impl;

import com.demo.entity.Student;
import com.demo.mapper.StudentMapper;
import com.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by cgl on 2018/3/19
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService{
    
    @Autowired
    StudentMapper studentMapper;
    
    @Override
    public Student SelectUserById(Integer id) {
        return studentMapper.findUserById(id);
    }
    
    @Transactional
    @Override
    public Integer InsertUser(Integer id, String name) {
        studentMapper.insertUser(1, "ceshi");
        studentMapper.insertUser(2, "ceshi2");
        return studentMapper.insertUser(id, name);
    }
    
    public static void main(String[] args) {
    
    }
}
