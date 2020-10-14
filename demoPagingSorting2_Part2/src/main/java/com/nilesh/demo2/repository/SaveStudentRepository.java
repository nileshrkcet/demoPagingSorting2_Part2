package com.nilesh.demo2.repository;

import org.springframework.data.repository.CrudRepository;

import com.nilesh.demo2.model.Student;

public interface SaveStudentRepository extends CrudRepository<Student, Integer> {

}
