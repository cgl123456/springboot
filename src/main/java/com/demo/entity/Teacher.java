package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by cgl on 2018/3/20
 */
@Entity
public class Teacher {
    
    @Id
    @GeneratedValue
    private Integer id;
    
    private String name;
    
    private Date createDate;
    
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
    
    public Date getCreateDate() {
        return createDate;
    }
    
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    
    public Teacher(Integer id,String name, Date createDate) {
        this.id = id;
        this.name = name;
        this.createDate = createDate;
    }
    public Teacher(){
    
    }
}
