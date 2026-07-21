package com.harsha.demo3.StudentServer.Service;

import com.harsha.demo3.StudentServer.DTO.CreateStudentRequestDTO;
import com.harsha.demo3.StudentServer.DTO.CreateStudentResponseDTO;
import com.harsha.demo3.StudentServer.DTO.CreateStudentUpdateRequestDTO;
import com.harsha.demo3.StudentServer.DTO.CreateStudentUpdateResponseDTO;
import com.harsha.demo3.StudentServer.Entity.Student;
import com.harsha.demo3.StudentServer.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.lang.*;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class StudentService {
    StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public CreateStudentResponseDTO studentValidate(CreateStudentRequestDTO createStudentRequestDTO) {
        Student student=mapToStudent(createStudentRequestDTO);
        studentRepository.save(student);
        return mapToResponseDTO(student);
    }

//    public CreateStudentUpdateResponseDTO updateStudent(int id,CreateStudentUpdateRequestDTO createStudentUpdateRequestDTO){
//        Student result=studentRepository.findById(id).orElse(null);
//        if(result==null){
//            return null;
//        }
//        result.setName(createStudentUpdateRequestDTO.getName());
//        result.setAge(createStudentUpdateRequestDTO.getAge());
//        result.setDepartment(createStudentUpdateRequestDTO.getDepartment());
////        result.setUpdatedAt(LocalDateTime.now());
//        return studentRepository.save(result);
//    }

    public Student getStudentById(int id) throws Exception{
        Optional<Student> student=studentRepository.findById(id);
        return student.get();

    }

//    public CreateStudentUpdateResponseDTO(int id, CreateStudentUpdateRequestDTO createStudentUpdateRequestDTO){
//        Student result=studentRepository.findById(id).orElse(null);
//        if(result==null){
//            return null;
//        }
//        result.setName(createStudentUpdateRequestDTO.getName());
//        result.setAge(createStudentUpdateRequestDTO.getAge());
//        result.setDepartment(createStudentUpdateRequestDTO.getDepartment());
////        result.setUpdatedAt(LocalDateTime.now());
//        return studentRepository.save(result);
//    }

    public Student deleteStudent(int id){

        return studentRepository.findById(id).orElse(null);
    }

    private Student mapToStudent(CreateStudentRequestDTO createStudentRequestDTO){
        Student student=new Student();
        student.setName(createStudentRequestDTO.getName());
        student.setAge(createStudentRequestDTO.getAge());
        student.setDepartment(createStudentRequestDTO.getDepartment());
//        student.setUpdatedAt(LocalDateTime.now());
//        student.setCreatedAt(LocalDateTime.now());
        return student;
    }

    private CreateStudentResponseDTO mapToResponseDTO(Student student) {
        CreateStudentResponseDTO createStudentResponseDTO = new CreateStudentResponseDTO();
        createStudentResponseDTO.setId(student.getId());
        createStudentResponseDTO.setName(student.getName());
        createStudentResponseDTO.setAge(student.getAge());
        createStudentResponseDTO.setDepartment(student.getDepartment());
        return createStudentResponseDTO;
    }


}
