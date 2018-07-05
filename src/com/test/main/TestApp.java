package com.test.main;

import com.test.domain.Student;

public class TestApp {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setfName("FirstName");
		student.setlName("LName");
		student.setAge(23);
		
		System.out.println(student);

	}

}
