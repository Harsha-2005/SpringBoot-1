package com.harsha.demo3.StudentServer;

//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentServer {
    //1. store the student --> post

    @PostMapping("/create")
    public String storeStudent(){
        return """
                id : 1
                name : Harsha Pavan
                Department : CSE
                age : 20
                
                
                id : 2
                name : Harsha
                Department : CSE
                age:21
                """;
    }
    //2. Read the Student with id --> get


    //3. Update the student information  --> put/patch
    //4. delete the student information --> delete




}
