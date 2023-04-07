package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.StudentRepository;
import com.jpa.test.entities.Student;

@SpringBootApplication
public class CrudOperationsApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(CrudOperationsApplication.class, args);
		
		StudentRepository studentRepository =  context.getBean(StudentRepository.class);
		
//		Student student = new Student();
//		student.setName("Nirmit");
//		student.setRollNo(1);
//		student.setStd(4);
//		
//		Student student2= studentRepository.save(student);
//		
//		System.out.println(student2);
		
//		Create object of student
//		Student student1 = new Student();
//		student1.setName("Ganesh");
//		student1.setRollNo(2);
//		student1.setStd(5);
//		
//		Student student2 = new Student();
//		student2.setName("Ankit");
//		student2.setRollNo(3);
//		student2.setStd(4);
		
//		Saving Single User
//		Student resultStudent = studentRepository.save(student1);
		
//		save multiple object in a list
//		List<Student> students =  List.of(student1,student2);
//		these method is from java 9
//		Iterable<Student> result = studentRepository.saveAll(students);
//		
//		result.forEach(student -> {
//			System.out.println(student);
//		});
		
//		System.out.println(result);
//		System.out.println(resultStudent);
		
//		update the student by id
//		Optional<Student> optional = studentRepository.findById(52);
//		Student student = optional.get();
//		student.setName("Rudra");
//		Student results = studentRepository.save(student);
//		System.out.println(results);
	
//		Edit the data
		
		Iterable<Student> std = studentRepository.findAll();
		
//		old Steps
		
//		Iterator<Student> iterartor = std.iterator();
//		while(iterartor.hasNext()) {
//			Student students = iterartor.next();
//			System.out.println(students);
//		}
		
//		By Using Consumer Class
		
//		std.forEach(new Consumer<Student>(){
//
//			@Override
//			public void accept(Student t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//			}
//		});
		
//		By Using Lambda function
		
		std.forEach(student -> {
			System.out.println(student);
		});
		
//		Delete the student data
		
//		Delete One ID
		
//		studentRepository.deleteById(52);
//		System.out.println("Student deleted");
		
//		Delete All
		Iterable<Student> allstudents = studentRepository.findAll();
		allstudents.forEach(student ->
		System.out.println(student)
		);
		
		studentRepository.deleteAll(allstudents);
		
	}
	
	
	

}
