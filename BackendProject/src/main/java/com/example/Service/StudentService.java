package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Entity.Student;

@Service//mark the class as a service provider or this class provide some business functionality
public interface StudentService {
public Student createStudent(Student student);
public List<Student>getAllStudent();
}
