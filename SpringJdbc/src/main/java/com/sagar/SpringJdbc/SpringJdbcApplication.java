package com.sagar.SpringJdbc;

import com.sagar.SpringJdbc.model.Student;
import com.sagar.SpringJdbc.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringJdbcApplication.class, args);
		Student student = applicationContext.getBean(Student.class);
		student.setName("Sagar");
		student.setMarks(233);
		student.setRollNo(122);
		//System.out.println(student);

		StudentService service = applicationContext.getBean(StudentService.class);
		service.addStudent(student);
		service.save(student);
		List<Student> studentList = service.findAll();
		System.out.println(studentList);
	}

}
