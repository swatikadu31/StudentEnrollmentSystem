package com.code2java.enroll.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code2java.enroll.Repository.CourseRepository;
import com.code2java.enroll.Repository.StudentRepository;
import com.code2java.enroll.models.Course;
import com.code2java.enroll.models.Student;

@Service
public class StudentServiceImpl implements StudentService {

	
	@Autowired
	private StudentRepository studentRepo;
	
	@Autowired
	private CourseRepository courserepo;
	
	
	    public Student addStudent(Student student) {
	        return studentRepo.save(student);
	    }

	    public List<Student> getAllStudents(){
	    	return studentRepo.findAll();
	    }
	   
	    public Student enrollStudentInCourse(Long studentId, Long courseId) {
	    	Student student=studentRepo.findById(studentId).orElseThrow();
	    	Course course=courserepo.findById(courseId).orElseThrow();
	    	
	    	student.getCourses().add(course);
	    	return studentRepo.save(student);
	    }
}
