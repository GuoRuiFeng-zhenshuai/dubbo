package com.guoruifeng.service.impl;

import com.guoruifeng.pojo.Student;
import com.guoruifeng.service.StudentService;

public class StudentServiceImpl implements StudentService {

	public Student getById(int id) {
		// TODO Auto-generated method stub
		Student student=new Student();
		student.setAge(20);
		student.setId(id);
		student.setName("张三"+id);
		return student;
	}

	public Student add(Student stu,int n) {
		// TODO Auto-generated method stub
		stu.setAge(stu.getAge()+n);
		return stu;
	}

}
