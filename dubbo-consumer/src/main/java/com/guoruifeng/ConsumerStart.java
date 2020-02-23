package com.guoruifeng;

public class ConsumerStart {
	private static ClassPathXmlApplicationContext context;
	private static StudentService studentService;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("classpath:ApplicantionContext.xml");
		
		
		studentService = context.getBean(StudentService.class);
		
		Student student = studentService.getById(20);
		System.out.println("stuent is "  + student);
		
		Student addAge = studentService.addAge(student, 3);
		
		System.out.println("加岁数以后的数据 "  + addAge);
		
		
		
		
	}
}
