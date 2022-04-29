package com.tectoro.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;



@Entity
@Table(name = "student1")
public class Student1 implements java.io.Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;
	private int marks;
	@Transient
	private String department;
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String s1) {
		this.department = s1;
	}
	/*
	 * @Transient
	 * 
	 * @Column(name = "dept_id") private Department1 dept_id;
	 * 
	 * 
	 * public Department1 getDept_id() { return dept_id; }
	 * 
	 * public void setDept_id(Department1 dept_id) { this.dept_id = dept_id; }
	 */	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
	
	public Student1(int id, String name, int age, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	

	
	
		
}
