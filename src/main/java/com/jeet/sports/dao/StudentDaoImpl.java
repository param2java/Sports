package com.jeet.sports.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.jeet.sports.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	HibernateTemplate ht;
	public String saveStudent(Student student) {
		return (String) ht.save(student);
	}

	public void deleteStudent(String studentId) {
			ht.delete(new Student(studentId));
	}

	public void updateStudent(Student student) {
		 ht.update(student);
	}

	public Student getStudentById(String studentId) {
		return ht.get(Student.class, studentId);
	}

	public List<Student> getAllStudents() {
		return ht.loadAll(Student.class);
	}

}
