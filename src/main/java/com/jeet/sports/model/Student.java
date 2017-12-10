package com.jeet.sports.model;

public class Student {
	private String sutdentId;
	private String studentName;
	private String studentClass;
	private String studentSection;
	
	public Student() {
	}

	public Student(String sutdentId) {
		this.sutdentId = sutdentId;
	}

	public String getSutdentId() {
		return sutdentId;
	}

	public void setSutdentId(String sutdentId) {
		this.sutdentId = sutdentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public String getStudentSection() {
		return studentSection;
	}

	public void setStudentSection(String studentSection) {
		this.studentSection = studentSection;
	}

	@Override
	public String toString() {
		return "Student [sutdentId=" + sutdentId + ", studentName="
				+ studentName + ", studentClass=" + studentClass
				+ ", studentSection=" + studentSection + "]";
	}
	
	
	
}
