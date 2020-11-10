package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.domain.Course;
import com.example.demo.domain.Instructor;
import com.example.demo.domain.Pilot;
import com.example.demo.domain.Student;
import com.example.demo.domain.enums.UserType;
import com.example.demo.repository.ClientRepository;
import com.example.demo.repository.CourseRepository;

@SpringBootApplication
public class SkynetApiApplication implements CommandLineRunner {
	@Autowired
	ClientRepository clientRepo;
	@Autowired
	CourseRepository courseRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(SkynetApiApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Pilot cli1 = new Pilot(null, "Joao da Silva", "R. Padre JoseMaría Escrivá de Balaguer", "Aviador", 35, "Aviação Civil", UserType.PILOT);
		Pilot cli2 = new Pilot(null, "Renata Soares", "R. dos Palmares", "Aviador", 38, "Aviação Civil", UserType.PILOT);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		Instructor inst1 = new Instructor(null,"Nayane Silveira ","Aviador","Av. Paulista 542 apto 2", 45,UserType.INSTRUCTOR,
					"Aviação Civil", sdf.parse("10/01/2000 16:30") ,"Universidade Anhembi Morumbi");
		Student stu1 = new Student(null,"Nelson Jacas", "R George Soros","Nenhuma ",18, "nENHUMA", UserType.STUDENT);
		
		Course class1 = new Course(null, "Pousos emergenciais", 
					6.5, false, sdf.parse("11/07/2020 16:30"), sdf.parse("11/07/2020 10:00"), inst1, cli1);
		inst1.getReportsList().addAll(Arrays.asList(class1));
		
		
		clientRepo.saveAll(Arrays.asList(cli1,cli2,inst1,stu1));
		courseRepo.saveAll(Arrays.asList(class1));
	}

}
