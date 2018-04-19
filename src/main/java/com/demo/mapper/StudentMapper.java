package com.demo.mapper;

import com.demo.entity.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by cgl on 2018/3/19
 */
@Mapper
public interface StudentMapper {
    
    @Select("select id,name from student where id = #{id}")
    Student findUserById(@Param("id") Integer id);
    
    @Insert("insert into student(id, name) values(#{id},#{name})")
    Integer insertUser(@Param("id") Integer id, @Param("name") String name);
}
