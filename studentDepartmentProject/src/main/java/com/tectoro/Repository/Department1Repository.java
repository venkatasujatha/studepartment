package com.tectoro.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tectoro.model.Department1;
import com.tectoro.model.Student1;
@Repository
public interface Department1Repository extends JpaRepository<Department1, Integer>{

	public List<Student1> save(Student1 student1);
	
	public Department1 findAllBydepartment(String dept_name);

}
