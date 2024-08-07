package com.example.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Entity.Subject;
import com.example.Repository.SubjectRepository;
import com.example.Service.SubjectService;

@Repository//this annotation used to indicated that the class provides the mechanism for storage,retrieval,search,update and delete operation on objects

public class SubjectImpl implements SubjectService {
@Autowired //used for dependency injection ,inject one object into our bean 
SubjectRepository subjectRepository;

@Override
public Subject createSubject(Subject subject) {
	// TODO Auto-generated method stub
	return subjectRepository.save(subject);
}

@Override
public List<Subject> getAllSubject() {
	// TODO Auto-generated method stub
	return subjectRepository.findAll();
}

}
