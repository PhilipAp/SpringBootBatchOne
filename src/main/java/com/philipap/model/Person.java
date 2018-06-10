package com.philipap.model;

import java.io.Serializable;

public class Person implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String firtName;
	private String lastName;
	private String email;
	private Integer age;
	
	public Person() {
		
	}

	public Person(String firtName, String lastName, String email, Integer age) {
		super();
		this.firtName = firtName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
	}

	public String getFirtName() {
		return firtName;
	}

	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [firtName=" + firtName + ", lastName=" + lastName + ", email=" + email + ", age=" + age + "]";
	}
	
	
}
