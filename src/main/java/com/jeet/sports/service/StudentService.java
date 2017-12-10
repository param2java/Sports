package com.jeet.sports.service;

import java.util.List;

import com.jeet.sports.model.Student;

public interface StudentService {
	
	String saveStudent(Student student);
	void deleteStudent(String studentId);
	void updateStudent(Student student);
	Student getStudentById (String studentId);
	List<Student> getAllStudents();

}
