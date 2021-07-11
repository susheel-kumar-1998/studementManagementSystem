package com.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.student.entity.Student;
import com.student.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
//		Student std1=new Student("susheel", "kumar","susheel@gmail.com");
//		studentRepository.save(std1);
//		Student std2=new Student("suresh", "kumar","suresh@gmail.com");
//		studentRepository.save(std2);
//		Student std3=new Student("sujay", "patil","sujay@gmail.com");
//		studentRepository.save(std3);
		
	}

}
