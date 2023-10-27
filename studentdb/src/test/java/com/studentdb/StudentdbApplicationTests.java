package com.studentdb;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.studentdb.Entity.Student;
import com.studentdb.repository.StudentRepository;

@SpringBootTest
class StudentdbApplicationTests {
	@Autowired
	private StudentRepository studentRepo;
//create
	@Test
	void saveOneStudent() {
		Student s1 = new Student ();
		s1.setName("fahim");
		s1.setCourse("police");
		s1.setFee(30000);
		System.out.println(studentRepo);
		studentRepo.save(s1);
	}
	//delete
	@Test
	void deleteOneStudent() {
		studentRepo.deleteById(3l);
	}
	//read record
	@Test
	void getOneStudent() {
		Optional<Student> findById = studentRepo.findById(1l);
		Student s = findById.get();
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getCourse());
		System.out.println(s.getFee());
	}
	//update
	@Test
	void updateOneStudent() {
		Optional<Student> findById = studentRepo.findById(1l);
		Student s = findById.get();
		s.setCourse("police");
		s.setFee(50000);
		studentRepo.save(s);
	}
	

}
