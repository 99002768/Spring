package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.autowired.ShapeFactory;
import com.example.jbased.Vehicle;
import com.example.shetter.Employee;

@SpringBootApplication
public class SpringDemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}
	@Autowired
	ApplicationContext context;
	@Override
	public void run(String...args)throws Exception{
//		Employee employee1=context.getBean("employee",Employee.class);
//		System.out.println(employee1);
//		
//		Employee employee2=context.getBean("employee",Employee.class);
//		System.out.println(employee2);
//		
//		employee2.setEmpName("thirru");
//		System.out.print(employee1);
//		System.out.print(employee2);
//		
//		Vehicle vehicle=context.getBean("vehicle",Vehicle.class);
//		System.out.print(vehicle);
		
//		Student student=context.getBean("student",Student.class);
//		System.out.println(student);
		ShapeFactory shapeFactory=context.getBean("getFactory",ShapeFactory.class);
		shapeFactory.printArea(10,5);
//	
//FoodPanda foodPanda=context.getBean(FoodPanda.class);	
//List<String> hello=foodPanda.showMenu("chinese");
//for(String a:hello) {
//	System.out.print(""+a);
//}
//		ShareVechile mile=context.getBean(ShareVechile.class);
//		mile.getMileage("bike");
//	
		
	
	}

}
