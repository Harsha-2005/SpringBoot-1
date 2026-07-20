package com.harsha.demo3.StudentServer.DTO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateStudentUpdateRequestDTO {
    private String name;
    private int id;
    private int age;
    private String Department;

}
