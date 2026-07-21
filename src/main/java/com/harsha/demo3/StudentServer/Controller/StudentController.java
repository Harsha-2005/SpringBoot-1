package com.harsha.demo3.StudentServer.Controller;

import com.harsha.demo3.StudentServer.DTO.CreateStudentRequestDTO;
import com.harsha.demo3.StudentServer.DTO.CreateStudentResponseDTO;
import com.harsha.demo3.StudentServer.DTO.CreateStudentUpdateRequestDTO;
import com.harsha.demo3.StudentServer.Entity.Student;
import com.harsha.demo3.StudentServer.Service.StudentService;
import org.hibernate.boot.jaxb.SourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {

        this.studentService = studentService;
    }
    @CrossOrigin
    @PostMapping("/create")
    public ResponseEntity<?> storeStudent(@RequestBody CreateStudentRequestDTO createStudentRequestDTO) {

        CreateStudentResponseDTO result=studentService.studentValidate(createStudentRequestDTO);
//        return studentService.studentValidate(createStudentRequestDTO);
//        System.out.println(result);
        if(result==null){
            return ResponseEntity.status(400).body(result);
        }
        return ResponseEntity.status(201).body(result);
    }

    @CrossOrigin
    @GetMapping("/getStudent/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable int id) throws Exception {
        Student student=studentService.getStudentById(id);
        return ResponseEntity.ok(student);
    }

//    @CrossOrigin
//    @PutMapping("/update/{id}")
//    public ResponseEntity<?> updateStudent(@PathVariable int id, @RequestBody UpdateStudentRequestDTO updateStudentRequestDTO){
//    @PathVariable int id;
//    @RequestBody UpdateStudentRequestDTO
//        Student updatedStudent=studentService.studentUpdate(id, student);
//        return ResponseEntity.status(200).body(updatedStudent);
//        return ResponseEntity<?>(studentService.updateStudent(createStudentUpdateRequestDTO, id),HttpStatus.OK);
//    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
        return ResponseEntity.status(200).body("Student deleted successfully");
    }

}
