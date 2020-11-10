package com.example.demo.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "aircraft")
public class Aircraft implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String model;
	private String callSign;
	private float flewHours;
	
	public Aircraft() {
	}

	public Aircraft(Integer id, String model, String callSign, float flewHours) {
		super();
		this.id = id;
		this.model = model;
		this.callSign = callSign;
		this.flewHours = flewHours;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCallSign() {
		return callSign;
	}

	public void setCallSign(String callSign) {
		this.callSign = callSign;
	}

	public float getFlewHours() {
		return flewHours;
	}

	public void setFlewHours(float flewHours) {
		this.flewHours = flewHours;
	}
	
	
}
