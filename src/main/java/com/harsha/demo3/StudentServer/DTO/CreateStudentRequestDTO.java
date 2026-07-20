package com.harsha.demo3.StudentServer.DTO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateStudentRequestDTO {
    private String name;
    private int age;
    private String department;

}
