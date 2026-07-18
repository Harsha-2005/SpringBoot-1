package com.harsha.demo3.StudentServer.Service;

import com.harsha.demo3.StudentServer.Entity.Student;
import com.harsha.demo3.StudentServer.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.lang.*;
import java.time.LocalDateTime;

@Service
public class StudentService {
    StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student studentValidate(Student student){
        int id=student.getId();
        String name=student.getName();
        int age=student.getAge();
        String department=student.getDepartment();

        if(id<0 || name==null || age<0 || department==null){
            return null;
        }
//        student.setCreatedAt(LocalDateTime.now());
//        student.setUpdatedAt(LocalDateTime.now());
        return studentRepository.save(student);
    }

    public Student studentUpdate(int id,Student student){
        Student result=studentRepository.findById(id).orElse(null);
        if(result==null){
            return null;
        }
        result.setName(student.getName());
        result.setAge(student.getAge());
        result.setDepartment(student.getDepartment());
//        result.setUpdatedAt(LocalDateTime.now());
        return studentRepository.save(result);
    }

    public Student getStudentById(int id){
        return studentRepository.findById(id).orElse(null);
    }

    public Student updateStudent(int id,Student student){
        Student result=studentRepository.findById(id).orElse(null);
        if(result==null){
            return null;
        }
        result.setName(student.getName());
        result.setAge(student.getAge());
        result.setDepartment(student.getDepartment());
//        result.setUpdatedAt(LocalDateTime.now());
        return studentRepository.save(result);
    }

    public Student deleteStudent(int id){
        return studentRepository.findById(id).orElse(null);
    }

}
