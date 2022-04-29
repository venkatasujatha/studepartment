package com.tectoro.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.tectoro.Repository.Department1Repository;
import com.tectoro.Repository.Student1Repository;
import com.tectoro.model.Department1;
import com.tectoro.model.RequestEntity;
import com.tectoro.model.Student1;

@Service
public class DepartmentServiceImpl implements serviceInterface {

	@Autowired
	private Department1Repository department1Repository;

	@Autowired
	private Student1Repository student1Repository;

	private Department1 save;

	@Override
	public List<Student1> addStudents(Student1 student1) {

		return department1Repository.save(student1);
	}

	public List<Student1> getStudents(int id) {

		return (List<Student1>) department1Repository.getById(id);
	}
	public String saveStudent(Student1 student) {
		Department1 department1 = department1Repository.findAllBydepartment(student.getDepartment());
		List<Student1> s1=new ArrayList<Student1>();
		department1.setStudent1(s1);
		s1.add(student);
		department1Repository.save(department1);
		return "data saved";
		
	}

	@Override
	public String saveStudent(RequestEntity requestEntity) {
		// TODO Auto-generated method stub
		return null;
	}
	
		/*
		 * public String saveStudent(RequestEntity requestEntity) { Department1
		 * department1 =
		 * department1Repository.findAllBydepartment(requestEntity.getDepartment());
		 */	
		
		/*
		 * // Student1 student1 = new Student1();
		 * student1.setAge(requestEntity.getAge());
		 * student1.setName(requestEntity.getName());
		 * student1.setMarks(requestEntity.getMarks());
		 * //student1.setId(requestEntity.getId()); // student1.setDept_id(department1);
		  
		 * department1.setStudent1(addStudents(student1));
		 * department1Repository.save(department1);
		 * 
		 * return "Save Data successfully";
		 */	

}
