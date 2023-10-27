package com.studentdb.repository;

import org.springframework.data.repository.CrudRepository;

import com.studentdb.Entity.Student;

public interface StudentRepository extends CrudRepository<Student,Long> {

}
