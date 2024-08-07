package com.example.Service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.Entity.Subject;
@Service//mark the class as a service provider or this class provide some business functionality
public interface SubjectService {
	public Subject createSubject(Subject subject);
	public List<Subject>getAllSubject();
}
