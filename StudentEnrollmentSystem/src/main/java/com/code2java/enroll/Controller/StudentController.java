package com.code2java.enroll.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code2java.enroll.Services.StudentService;
import com.code2java.enroll.models.Student;

@RestController
@RequestMapping("/students")
@CrossOrigin("*")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	
	@GetMapping
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	 @PostMapping("/{studentId}/enroll/{courseId}")
	    public Student enroll(@PathVariable Long studentId, @PathVariable Long courseId) {
	        return studentService.enrollStudentInCourse(studentId, courseId);
	    }

}
