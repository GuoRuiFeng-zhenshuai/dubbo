package com.guoruifeng.service;

import com.guoruifeng.pojo.Student;

public interface StudentService {
	Student getById(int id);
	
	Student add(Student stu,int n);
}
