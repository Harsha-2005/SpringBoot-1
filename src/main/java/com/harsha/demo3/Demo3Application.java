package com.harsha.demo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo3Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo3Application.class, args);
		Student student=new Student("Harsha Pavan",20);
		System.out.println(student.getAge());
		System.out.println(student.getName());
	}

}
