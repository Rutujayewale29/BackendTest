package com.example.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Entity.Student;
import com.example.Repository.StudentRepository;
import com.example.Service.StudentService;

@Repository//this annotation used to indicated that the class provides the mechanism for storage,retrieval,search,update and delete operation on objects
public class StudentImpl implements StudentService {
@Autowired//used for dependency injection ,inject one object into our bean 
StudentRepository studentRepository;
@Override
public Student createStudent(Student student) {
	// TODO Auto-generated method stub
		return studentRepository.save(student);

}

@Override
public List<Student> getAllStudent() {
	// TODO Auto-generated method stub
	return studentRepository.findAll();
}
}
