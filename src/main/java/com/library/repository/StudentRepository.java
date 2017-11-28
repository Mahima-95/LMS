package com.library.repository;

import org.springframework.data.repository.CrudRepository;

import com.library.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{

	public Student findByStudentIdAndStudentAddress(Integer studentId, String studentAddress);
	
	public Student findByStudentName(String studentName);
}
