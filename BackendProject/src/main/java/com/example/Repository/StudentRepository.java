package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Student;
//repository for perform database related operations like create,insert..etc
//JpaRepository used for managing data in spring boot application
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
