package com.harsha.demo3.StudentServer;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
    public Student save(Student student){
        System.out.println("Student information saved");
        return student;
    }
}
