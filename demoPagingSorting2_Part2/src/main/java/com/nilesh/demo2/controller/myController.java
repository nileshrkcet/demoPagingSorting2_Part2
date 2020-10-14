package com.nilesh.demo2.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nilesh.demo2.model.Student;
import com.nilesh.demo2.repository.SaveStudentRepository;
import com.nilesh.demo2.service.IStudentService;

@Controller
public class myController {
	
	@Autowired
	private IStudentService studentService;
	
	@RequestMapping("/student/{pageNo}/{pageSize}")
	@ResponseBody
	public List<Student> getPaginated(@PathVariable int pageNo,@PathVariable int pageSize){
		return studentService.findPaginated(pageNo, pageSize);
	}
	
	@RequestMapping("home")
	public String homeFun(HttpServletRequest req) {
		HttpSession session = req.getSession();
		session.setAttribute("totalStudent", repo.count());
		return "homePage";
	}
	
	@Autowired
	SaveStudentRepository repo;
	
	@RequestMapping("addStudent")
	public String saveStudent(Student stu) {
		repo.save(stu);
		return "homePage";
	}
}
