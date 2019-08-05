package com.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.StudentRepository;
import com.exam.model.Student;

@Service
public class StudentService {

	@Autowired
	StudentRepository repoStudent;
	
	public List<Student> getAllStu(){
		return repoStudent.findAll();
	}
	public void doSaveStu(Student student) {
		repoStudent.save(student);
	}
	public void doUpdate(Student student) {
		repoStudent.saveAndFlush(student);
	}
	public void doDelete(Student student) {
		repoStudent.delete(student);
	}
}
