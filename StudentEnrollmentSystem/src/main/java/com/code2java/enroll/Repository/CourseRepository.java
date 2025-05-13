package com.code2java.enroll.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code2java.enroll.models.Course;

public interface CourseRepository extends JpaRepository<Course, Long> { 

}
