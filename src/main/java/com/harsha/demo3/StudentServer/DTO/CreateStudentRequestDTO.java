package com.harsha.demo3.StudentServer.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateStudentRequestDTO {
    private String name;
    private int age;
    private String department;

    @NotBlank(message="Email is Required")
    @Email(message="Please Provide a valid Email Address")
    private String email;

}
