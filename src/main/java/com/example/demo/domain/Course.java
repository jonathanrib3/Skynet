package com.example.demo.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity(name = "course")
@EntityScan()
public class Course implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String description;
	private Double flewHours;
	private boolean isSolo;
	private Date endTime;
	private Date startTime;
	@ManyToOne
	@JoinColumn(name = "instructor_id")
	private Instructor instructor;
	@JoinColumn(name = "pilot_id")
	private Pilot pilot;
	
	
	
	
	public Course() {
	}

					
	public Course(Integer id, String description, Double flewHours, boolean isSolo, Date endTime, Date startTime,
			Instructor instructor, Pilot pilot) {
		super();
		this.id = id;
		this.description = description;
		this.flewHours = flewHours;
		this.isSolo = isSolo;
		this.endTime = endTime;
		this.startTime = startTime;
		this.instructor = instructor;
		this.pilot = pilot;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Double getFlewHours() {
		return flewHours;
	}


	public void setFlewHours(Double flewHours) {
		this.flewHours = flewHours;
	}


	public boolean isSolo() {
		return isSolo;
	}


	public void setSolo(boolean isSolo) {
		this.isSolo = isSolo;
	}


	public Date getEndTime() {
		return endTime;
	}


	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}


	public Date getStartTime() {
		return startTime;
	}


	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}


	public Instructor getInstructor() {
		return instructor;
	}


	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}


	public Pilot getPilot() {
		return pilot;
	}


	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}



	
	
}
