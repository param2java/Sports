package com.jeet.sports.dao;

import java.util.List;

import com.jeet.sports.model.Student;

public interface StudentDao {
	String saveStudent(Student student);
	void deleteStudent(String studentId);
	void updateStudent(Student student);
	Student getStudentById (String studentId);
	List<Student> getAllStudents();
}
