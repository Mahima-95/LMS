package com.library.repository;

import org.springframework.data.repository.CrudRepository;

import com.library.entity.Teacher;

public interface TeacherRepository extends CrudRepository<Teacher, Integer> {

	public Teacher findByTeacherName(String teacherName);
}
