package com.harsha.demo3.StudentServer.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity
public class Student {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank
    private int id;
    @Size(min=10,max=26)
    @NotBlank(message = "Name cannot be blank")
    private String name;
    @Min(value=18,message = "You are not eligible")
    @Positive
    private int age;
    @Size(min=5,max=26)
    private String department;
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;

    public Student(){

    }

    public Student(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
