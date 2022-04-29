package com.tectoro.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.tectoro.Repository.Student1Repository;
import com.tectoro.model.RequestEntity;
import com.tectoro.model.Student1;
import com.tectoro.service.DepartmentServiceImpl;
import com.tectoro.service.serviceInterface;

@Controller
public class departmentController {
	
	@Autowired
	private Student1Repository sRepo;
	@Autowired
	private serviceInterface serviceInterface;
	
	@RequestMapping("/s")
	public String sjb()
	{
		return "home";
	}
	
	@RequestMapping("/set")
	public ModelAndView showStudents()
	{
		ModelAndView mv1=new ModelAndView("list-students");
		List<Student1> list=sRepo.findAll();
		System.out.println("hi");
		mv1.addObject("students", list);
		return mv1;
		
	}
	@GetMapping("/addStudents")
	public ModelAndView addStudents() {
		ModelAndView mv2=new ModelAndView("addStudent");
		Student1 student=new Student1();
		mv2.addObject("students", student);
		
		return mv2;
		
	}
	@PostMapping("/saveStudent")
	public String saveStudent(@RequestBody RequestEntity requestEntity) {
		
		serviceInterface.saveStudent(requestEntity);
		return "Student add successfully";
	}
	
	/*
	 * @PostMapping("/save") public List<Student1> addStudents(@RequestBody Student1
	 * student1) { return serviceRepo.addStudents(student1); }
	 */
}
