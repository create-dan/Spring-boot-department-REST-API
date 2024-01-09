package com.dailycodebuffer.Springboot.tutorial.service;

import java.util.List;

import com.dailycodebuffer.Springboot.tutorial.entity.Department;

public interface DepartMentService {

	 public Department saveDepartment(Department department);

	public List<Department> fetchDepartmentList();

	public Department fetchDepartmentId(Long departmentId);

	public void deleteDepartmentById(Long departmentId);

	public Department updateDepartmentById(Long departmentId, Department department);

	public Department fetchDepartmentId(String departmentName);

}
