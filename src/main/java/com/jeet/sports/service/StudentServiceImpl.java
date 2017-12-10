package com.jeet.sports.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeet.sports.dao.StudentDao;
import com.jeet.sports.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDao dao;

	public String saveStudent(Student student) {
		return (String) dao.saveStudent(student);
	}

	public void deleteStudent(String studentId) {
		dao.deleteStudent(studentId);
	}

	public void updateStudent(Student student) {
		dao.updateStudent(student);
	}

	public Student getStudentById(String studentId) {
		return dao.getStudentById(studentId);
	}

	public List<Student> getAllStudents() {
		return dao.getAllStudents();
	}

}
