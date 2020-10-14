package com.nilesh.demo2.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.nilesh.demo2.model.Student;

public interface StudentRepository extends PagingAndSortingRepository<Student, Integer> {

}
