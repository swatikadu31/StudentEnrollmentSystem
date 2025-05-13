package com.code2java.enroll.models;

import java.util.HashSet;
import java.util.Set;

import com.code2java.enroll.Controller.CourseController;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Data
@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "course_id")
	 private Long id;

	@Column(name="title")
	    private String title;
	
	@Column(name="description")
	    private String description;
	
	 @ManyToMany(mappedBy = "courses")
	    private Set<Student> students = new HashSet<>();
}
