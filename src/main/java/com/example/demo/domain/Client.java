package com.example.demo.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import com.example.demo.domain.enums.UserType;

@Entity(name = "client")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Client implements Serializable  {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String registration;
	private String address;
	private int age;
	private Integer userType;
	
	public Client() {
		
	}
	
	public Client(Integer id, String name, String registration, String address, int age, UserType userType) {
		super();
		this.id = id;
		this.name = name;
		this.registration = registration;
		this.address = address;
		this.age = age;
		this.userType = (userType == null) ? null : userType.getId();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegistration() {
		return registration;
	}
	public void setRegistration(String registration) {
		this.registration = registration;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public UserType getUserType() {
		return UserType.toEnum(userType);
	}
	public void setUserType(UserType userType) {
		this.userType = userType.getId();
	}
	
	
}
