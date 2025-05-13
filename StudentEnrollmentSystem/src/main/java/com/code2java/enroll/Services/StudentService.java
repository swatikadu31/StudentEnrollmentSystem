package com.code2java.enroll.Services;

import java.util.List;
import com.code2java.enroll.models.Student;

public interface StudentService {

	Student addStudent(Student student);
	 List<Student> getAllStudents();
	    Student enrollStudentInCourse(Long studentId, Long courseId);
}
