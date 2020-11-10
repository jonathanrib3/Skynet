package com.example.demo.domain;

import java.io.Serializable;

import javax.persistence.Entity;

import com.example.demo.domain.enums.UserType;

@Entity(name = "pilot")
public class Pilot extends Client  implements Serializable  {
	private static final long serialVersionUID = 1L;
	private String license;
	public Pilot() {
		
	}
	public Pilot(Integer id, String name, String address, String registration,int age, String license, UserType userType ) {
		super(id, name, registration, address, age, userType);
		this.license = license;
	}
	
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	
	
}
