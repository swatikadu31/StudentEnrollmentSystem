package com.code2java.enroll.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code2java.enroll.Repository.CourseRepository;
import com.code2java.enroll.models.Course;

@Service
public class CourseServiceImpl implements CourseService {

	 @Autowired
	    private CourseRepository courseRepo;

	    
	    public Course addCourse(Course course) {
	        return courseRepo.save(course);
	    }

	   
	    public List<Course> getAllCourses() {
	        return courseRepo.findAll();
	    }
	    public Course findById(Long id) {
	        return courseRepo.findById(id).orElseThrow();
	    }
}
