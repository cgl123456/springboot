package com.demo.repository;

import com.demo.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


/**
 * Created by cgl on 2018/3/20
 */
public interface TeacherRepository extends JpaRepository<Teacher, Integer>{
    
    @Query("select t from Teacher t where t.id = ?1 and t.name = ?2")
    Teacher queryTeacherByIdAndName(Integer id, String name);
    
}
