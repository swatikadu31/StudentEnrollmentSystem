package com.code2java.enroll.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code2java.enroll.Services.CourseService;
import com.code2java.enroll.models.Course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@RestController
@RequestMapping("/courses")
@CrossOrigin("*")
public class CourseController {
	 @Autowired
	    private CourseService courseService;

	    @PostMapping("/add")
	    public Course addCourse(@RequestBody Course course) {
	        return courseService.addCourse(course);
	    }

	    @GetMapping
	    public List<Course> getAllCourses() {
	        return courseService.getAllCourses();
	    }
	
}
