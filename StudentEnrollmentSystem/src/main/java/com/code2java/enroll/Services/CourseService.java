package com.code2java.enroll.Services;

import java.util.List;

import com.code2java.enroll.models.Course;

public interface CourseService {
	
	Course addCourse(Course course);
    List<Course> getAllCourses();
    Course findById(Long id);
}