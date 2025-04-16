package com.codewithteja.spring_data_jpa_ex;

import com.codewithteja.spring_data_jpa_ex.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);

//		Student s1 = context.getBean(Student.class);
//		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);
//
//		s1.setRollNo(1);
//		s1.setName("Teja");
//		s1.setMarks(90);
//
//		s2.setRollNo(2);
//		s2.setName("Sarah");
//		s2.setMarks(85);
//
		s3.setRollNo(3);
		s3.setName("Jack");
		s3.setMarks(92);

		StudentRepo repo = context.getBean(StudentRepo.class);

//		repo.save(s2);
//		repo.save(s3);
//		repo.findAll().forEach(System.out::println);
//		Optional<Student> student = repo.findById(5);
//		System.out.println(student.orElse(new Student()));

//		System.out.println(repo.findByName("Teja"));

//		System.out.println(repo.findByMarksGreaterThanEqual(90));

//		repo.save(s3);
//
//		repo.delete(s3);
//
//		repo.save(s3);
	}

}
