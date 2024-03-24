package com.restapi.practice.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.practice.model.Student;

@RestController
public class StudentController {

	@GetMapping("student")
	public Student getStudent() {
		Student s = new Student(1, "Sai Ganesh", 26);
		return s;
	}

	@GetMapping("students")
	public ArrayList<Student> getallStudents() {
		ArrayList<Student> s = new ArrayList<Student>();
		s.add(new Student(2, "Ramesh", 25));
		s.add(new Student(3, "Ravi", 26));
		s.add(new Student(4, "raghu", 25));
		return s;
	}

	@GetMapping("students/{id}/{name}/{age}")
	public Student pathVar(@PathVariable("id") int id, @PathVariable("name") String name,
			@PathVariable("age") int age) {
		Student s = new Student(id, name, age);
		return s;
	}

	@GetMapping("students/query")
	public Student reqparam(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("age") int age) {
		Student s = new Student(id, name, age);
		return s;

	}
	
	public String name() {
		return "Sai ganesh";
	}
	
}
