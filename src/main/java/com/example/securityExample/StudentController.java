package com.example.securityExample;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;


@RestController
public class StudentController {
	
	private List<Student> students = new ArrayList<>(List.of(
            new Student(1, "abhi"),
            new Student(2, "sandy")
    ));
    
	@GetMapping("/Student")
	public List<Student> getstudents(){
		return students;
	}
	
	
	
	@GetMapping("/csrf-token")
	public CsrfToken gettoken(HttpServletRequest request) {
		return (CsrfToken) request.getAttribute("_csrf");
	}
	@PostMapping("/Student")
	public Student addstudent(@RequestBody Student student) {
		students.add(student);
		return student;
	}
	
	
	
	
	
	

}
