package com.test.domain;

import java.io.Serializable;

public class Student implements Serializable {

	private String fName;
	private String lName;
	private Integer age;
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [fName=" + fName + ", lName=" + lName + ", age=" + age + "]";
	}	
}
