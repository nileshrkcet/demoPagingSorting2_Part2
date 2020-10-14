package com.nilesh.demo2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nilesh.demo2.model.Student;

@Service
public interface IStudentService {
	List<Student> findPaginated(int pageNo,int pageSize);
}
