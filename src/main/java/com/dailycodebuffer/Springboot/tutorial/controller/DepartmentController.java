package com.dailycodebuffer.Springboot.tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dailycodebuffer.Springboot.tutorial.entity.Department;
import com.dailycodebuffer.Springboot.tutorial.service.DepartMentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartMentService departmentService;

	// save department
	@PostMapping("/departments")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentService.saveDepartment(department);

	}

	// get list of all department
	@GetMapping("/departments")
	public List<Department> fetchDepartmentList() {
		return departmentService.fetchDepartmentList();

	}

	// get department by id
	@GetMapping("/departments/{id}")
	public Department fetchDepartmentById(@PathVariable("id") Long departmentId) {
		return departmentService.fetchDepartmentId(departmentId);
	}

	// delete department by id
	@DeleteMapping("/departments/{id}")
	public String deleteDepartmentById(@PathVariable("id") Long departmentId) {

		departmentService.deleteDepartmentById(departmentId);
		return "Successfully deleted the department";
	}

	// update department by id
	@PutMapping("/departments/{id}")
	public Department updateDepartmentById(@PathVariable("id") Long departmentId, @RequestBody Department department) {
		return departmentService.updateDepartmentById(departmentId, department);

	}

	// fetch department by name
	@GetMapping("/departments/name/{name}")
	public Department fetchDepartmentByName( @PathVariable("name")  String departmentName){
		return departmentService.fetchDepartmentId(departmentName);
	}
	
	
	
	
	
	
	
	
	
	

}
