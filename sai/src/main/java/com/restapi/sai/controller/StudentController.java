package com.restapi.sai.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.sai.model.Student;

@RestController
public class StudentController {

	@GetMapping("student")
	public ResponseEntity<Student> getStudent() {
		Student s = new Student(1, "Sai Ganesh", 26);
		//<Student> re =new ResponseEntity<Student>(s,HttpStatus.OK);
		//return  ResponseEntity.ok(s);
		return ResponseEntity.ok().header("header", "sai").body(s);
	}

	@GetMapping("students")
	public ResponseEntity<ArrayList<Student>> getallStudents() {
		ArrayList<Student> s = new ArrayList<Student>();
		s.add(new Student(2, "Ramesh", 25));
		s.add(new Student(3, "Ravi", 26));
		s.add(new Student(4, "raghu", 25));
		ResponseEntity<ArrayList<Student>> es = new ResponseEntity<ArrayList<Student>>(s,HttpStatus.OK);
		return es;
	}

	@GetMapping("students/{id}/{name}/{age}")
	public ResponseEntity<Student> pathVar(@PathVariable("id") int id, @PathVariable("name") String name,
			@PathVariable("age") int age) {
		Student s = new Student(id, name, age);
		ResponseEntity<Student> re = new ResponseEntity<Student>(s,HttpStatus.OK);
		return re;
	}

	@GetMapping("students/query")
	public ResponseEntity<Student> reqparam(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("age") int age) {
		Student s = new Student(id, name, age);
		//ResponseEntity<Student> re = new ResponseEntity<Student>(s,HttpStatus.OK);
		return ResponseEntity.ok(s);

	}

	@PostMapping("students/create")
	public ResponseEntity<Student> createStudent(@RequestBody Student s) {
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getAge());
		ResponseEntity<Student> re = new ResponseEntity<Student>(s,HttpStatus.CREATED);
		return re;
	}

	@PutMapping("students/{id}/update")
	public ResponseEntity<Student> updateStudent(@RequestBody Student s, @PathVariable("id") int id) {
		System.out.println(s.getAge());
		System.out.println(s.getName());
		ResponseEntity<Student> re = new ResponseEntity<Student>(s,HttpStatus.OK);
		return re;

	}

	@DeleteMapping("students/{id}/delete")
	public ResponseEntity<String> deleteStudent(@PathVariable("id") int id) {
		System.out.println(id);
		ResponseEntity<String> re = new ResponseEntity<String>("Deleted",HttpStatus.OK);
		return re;
	}

}
