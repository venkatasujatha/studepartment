package com.tectoro.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name ="department1" )
public class Department1 
{
	@Id
	private int id;
	@Column(name = "dept_name")
	private String department;
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "dept_id", referencedColumnName = "id", nullable = false)
	private List<Student1> student1;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public List<Student1> getStudent1() {
		return student1;
	}
	public void setStudent1(List<Student1> student1) {
		this.student1 = student1;
	}
	
	
	
}
