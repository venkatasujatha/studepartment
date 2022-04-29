package com.tectoro.service;

import org.springframework.web.bind.annotation.PathVariable;

import com.tectoro.model.RequestEntity;
import com.tectoro.model.Student1;

public interface serviceInterface {
	
	public Object addStudents(Student1 student1);
	public String saveStudent(RequestEntity requestEntity);

}
