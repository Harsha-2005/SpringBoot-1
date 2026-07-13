package com.harsha.demo3;

import com.harsha.demo3.DependencyInjection.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
//import com.harsha.demo3.Notification.CreditCard;

@SpringBootApplication
public class Demo3Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Demo3Application.class, args);
//		Student student=context.getBean(Student.class);
//		student.setName("Harsha Pavan");
//		student.setAge(20);
//		System.out.println(student.getName());
//		System.out.println(student.getAge());
//
//		OrderService orderService=context.getBean(OrderService.class);
//		orderService.placeOrder();
	}
}
