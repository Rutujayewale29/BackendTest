package com.example.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity//mark the class as a entity class
@Table(name="subject_list")//for table creation
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subject {
	@Id//used for mark the field as a primary key
	@GeneratedValue(strategy=GenerationType.AUTO)//auto generation value
	private int id;
private String sub_name;
}
