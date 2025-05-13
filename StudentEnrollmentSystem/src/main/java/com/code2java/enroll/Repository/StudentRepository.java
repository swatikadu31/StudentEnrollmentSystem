package com.code2java.enroll.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.code2java.enroll.models.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
