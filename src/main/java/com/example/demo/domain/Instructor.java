package com.example.demo.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.example.demo.domain.enums.UserType;

@Entity(name = "instructor")
public class Instructor extends Client implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String courseName;
	private Date graduateDate;
	private String instituteName;
	@OneToMany(mappedBy = "instructor")
	private List<Course> reportsList = new ArrayList<>();

	
	public Instructor() {
		
	}

	public Instructor(Integer id, String name, String registration, String address, int age, UserType userType, 
		String courseName, Date graduateDate, String instituteName) {
			super(id,name,registration,address,age,userType);
			this.courseName = courseName;
			this.graduateDate = graduateDate;
			this.instituteName = instituteName;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public Date getGraduateDate() {
		return graduateDate;
	}
	
	public void setGraduateDate(Date graduateDate) {
		this.graduateDate = graduateDate;
	}
	
	public String getInstituteName() {
		return instituteName;
	}
	
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public List<Course> getReportsList() {
		return reportsList;
	}

	public void setReportsList(ArrayList<Course> reportsList) {
		this.reportsList = reportsList;
	}
	
	
}
