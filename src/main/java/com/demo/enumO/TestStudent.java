package com.demo.enumO;


import java.util.Objects;

/**
 * Created by cgl on 2018/3/26
 */
public class TestStudent {
    
    private int age;
    
    private String name;
    
    public boolean equals(Object another){
        if(this == another){
            return true;
        }
        if(!(another instanceof TestStudent)){
            return false;
        }
        TestStudent student = (TestStudent)another;
        return student.name.equals(name)
            && student.age==age;
    }

    public int hashCode(){
//        int result = 17;
//        result = 31 * result + name.hashCode();
//        result = 31 * result + age;
//        return result;
        return Objects.hash(age,name);
    }
    
    public TestStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public static void main(String[] args) {
        TestStudent stu1 = new TestStudent("xiaoming", 19);
        TestStudent stu2 = new TestStudent("xiaoming", 19);
        System.out.println(stu1.equals(stu2));
    }
}
