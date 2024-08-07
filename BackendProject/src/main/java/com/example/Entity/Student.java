package com.example.Entity;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity//mark the class as a entity class
@Table(name="student_list")//for create table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student 
{
	@Id//mark the field as a primary key
	@GeneratedValue(strategy = GenerationType.AUTO)//for auto generated value
	private int id;
private String name;
private String address;
@OneToMany(fetch=FetchType.EAGER,cascade = CascadeType.ALL)//for one to many mapping ,one student and many subjects 
private List<Subject>subjectlist=new ArrayList<>();
}
