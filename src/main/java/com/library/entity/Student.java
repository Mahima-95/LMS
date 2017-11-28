package com.library.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student {

	@Id
	@Column(name = "STUDENT_ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int studentId;

	@Column(name = "STUDENT_NAME", nullable = false)
	public String studentName;

	@Column(name = "STUDENT_ADDRESS", nullable = false)
	public String studentAddress;

	@Column(name = "STUDENT_BRANCH", nullable = false)
	public String studentBranch;

	@Column(name = "STATUS", nullable = false)
	private boolean status;

	public Student() {
		super();
	}

	public Student(int studentId, String studentName, String studentAddress,
			String studentBranch, boolean status) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentBranch = studentBranch;
		this.status = status;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getStudentBranch() {
		return studentBranch;
	}

	public void setStudentBranch(String studentBranch) {
		this.studentBranch = studentBranch;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName="
				+ studentName + ", studentAddress=" + studentAddress
				+ ", studentBranch=" + studentBranch + ", status=" + status
				+ "]";
	}

}
