package com.library.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TEACHER")
public class Teacher {

	@Id
	@Column(name = "TEACHER_ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int teacherId;

	@Column(name = "TEACHER_NAME", nullable = false)
	public String teacherName;

	@Column(name = "TEACHER_ADDRESS", nullable = false)
	public String teacherAddress;

	@Column(name = "STATUS", nullable = false)
	public boolean status;

	public Teacher() {
		super();
	}

	public Teacher(int teacherId, String teacherName, String teacherAddress,
			boolean status) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.teacherAddress = teacherAddress;
		this.status = status;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherAddress() {
		return teacherAddress;
	}

	public void setTeacherAddress(String teacherAddress) {
		this.teacherAddress = teacherAddress;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName="
				+ teacherName + ", teacherAddress=" + teacherAddress
				+ ", status=" + status + "]";
	}

}
