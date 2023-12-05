package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity		//Mandatory.Used to represent our class as entity class
@Table(name = "STDNT_DTLS") /*Optional. Used only when our table name and class name are not same.
 							Here,our table name is STDNT_DTLS but class name is StudentsEntity.
 							If we don't use @Table then our class name is considered as table name*/
public class StudentsEntity {
	@Id //Mandatory. Used to represent that this variable is linked to PK column in our table
	@Column(name = "STUDENT_ID")//Optional. Used to represent column name mapped with variable name
	private Integer studentId;
	
	@Column(name = "STUDENT_NAME")
	private String studentName;
	
	@Column(name = "STUDENT_EMAIL")
	private String studentEmail;
	
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	@Override
	public String toString() {
		return "StudentsEntity [studentId=" + studentId + ", studentName=" + studentName + ", studentEmail="
				+ studentEmail + "]";
	}
	
	
}
