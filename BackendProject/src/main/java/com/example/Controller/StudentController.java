package com.example.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.Entity.Student;
import com.example.Service.StudentService;

@RestController //this annotation allows the class to handle request made by user
public class StudentController {
	@Autowired//this annotation for auto wired the bean into another bean
	StudentService studentService;
    //for add student
	@PostMapping("/addStudent")
	public ResponseEntity<Student> createStudentlist(@RequestBody Student student){
		return new ResponseEntity<Student>(studentService.createStudent(student),HttpStatus.CREATED);
	}
    //this annotation used for fetch all students
	@GetMapping("/getAllStudent")
	public List<Student> getAllStudentlist() {
		// TODO Auto-generated method stub
		return studentService.getAllStudent();
	}
}
