package com.example.demo.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.example.demo.domain.enums.UserType;

@Entity(name = "student")
@EntityScan()
public class Student extends Client implements Serializable  {
	private static final long serialVersionUID = 1L;
	
	
	public Student() {
	}
	
	public Student(Integer id, String name, String address, String registration,int age, String license, UserType userType ) {
		super(id, name, registration, address, age, userType);
		
	}


	
}
	