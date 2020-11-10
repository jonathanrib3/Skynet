package com.example.demo.domain.enums;

public enum UserType {
	INSTRUCTOR(1, "Class Instructor"),
	PILOT(2, "Pilot"),
	STUDENT(3, "Class Student");
	
	private int id;
	private String description;
	
	private UserType(int id, String description) {
		this.id = id;
		this.description = description;
	}
	
	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public static UserType toEnum(Integer id) {
		if(id == null) {
			return null;
		}
		
		for(UserType x : UserType.values()) {
			if(id.equals(x.getId())) {
				return x;
			}	
		}
		throw new IllegalArgumentException("Id inválido: " + id);
	}
}
