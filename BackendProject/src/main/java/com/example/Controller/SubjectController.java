package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Subject;
import com.example.Service.SubjectService;
@RestController//this annotation allows the class to handle request made by user
public class SubjectController{
	@Autowired//this annotation for auto wired the bean into another bean
	SubjectService subjectService;
  //this annotation used for add subject
	@PostMapping("/addSubject")
	public ResponseEntity<Subject> createSubjectlist(@RequestBody Subject subject) {
		return new ResponseEntity<Subject>(subjectService.createSubject(subject),HttpStatus.CREATED);
	}
  //this annotation used for fetch all data
	@GetMapping("/getAllSubject")
	public List<Subject> getAllSubjectlist() {
		// TODO Auto-generated method stub
		return subjectService.getAllSubject();
	}


	
}
