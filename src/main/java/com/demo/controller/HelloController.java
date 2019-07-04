package com.demo.controller;

import com.demo.entity.Student;
import com.demo.entity.Teacher;
import com.demo.propertity.TimePropertity;
import com.demo.repository.TeacherRepository;
import com.demo.service.StudentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by cgl on 2018/3/18
 */
@Controller
public class HelloController {
    
    @Autowired
    TimePropertity timePropertity;
    
    @Autowired
    StudentService studentService;
    
    @Autowired
    TeacherRepository teacherRepository;
    
    @RequestMapping("/")
    public String hi(){
        return "forward:index.html";
    }
    
    @RequestMapping(value="/hello", method = RequestMethod.GET)
    @ResponseBody
    public String sayHello() {
        Student student = new Student();
        student.setId(1);
        int a = 0;
        student.setName("chengguoliang");
        return "hello," + student.getName() + "," + timePropertity.getYear();
    }
    
    @RequestMapping(value="/selectStudentById")
    @ResponseBody
    public Student selectStudentById(@Param("id") Integer id) {
        Student student = studentService.SelectUserById(id);
        return student;
    }
    
    @RequestMapping(value="/insert")
    public Integer insertStudentById(Student student) {
        Integer count = studentService.InsertUser(student.getId(), student.getName());
        return count;
    }
    
    @RequestMapping(value="first")
    public String first(Model model){
        model.addAttribute("name", "thymeleaf");
        return "first";
    }
    
    @ResponseBody
    @RequestMapping("/hi")
    public Object getTeacher(@Param("id") Integer id, @Param("name") String name){
        teacherRepository.save(new Teacher(1, "aa", new Date()));
        return teacherRepository.queryTeacherByIdAndName(id, name);
    }
}
