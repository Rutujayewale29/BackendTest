package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Subject;
//repository for perform database related operations like create,insert..etc
//JpaRepository used for managing data in spring boot application

public interface SubjectRepository extends JpaRepository<Subject,Integer>{

}
