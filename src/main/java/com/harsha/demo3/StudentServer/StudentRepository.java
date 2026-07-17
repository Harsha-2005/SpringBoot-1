package com.harsha.demo3.StudentServer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
//    public Student save(Student student){
//        System.out.println("Student information saved");
//        return student;
//    }

}
