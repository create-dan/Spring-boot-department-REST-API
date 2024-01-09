package com.dailycodebuffer.Springboot.tutorial.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycodebuffer.Springboot.tutorial.entity.Department;
import com.dailycodebuffer.Springboot.tutorial.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartMentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Department saveDepartment(Department department) {

		return departmentRepository.save(department);
	}

	@Override
	public List<Department> fetchDepartmentList() {

		return departmentRepository.findAll();
	}

	@Override
	public Department fetchDepartmentId(Long departmentId) {

		return departmentRepository.findById(departmentId).get();
	}

	@Override
	public void deleteDepartmentById(Long departmentId) {
		departmentRepository.deleteById(departmentId);
	}

	@Override
	public Department updateDepartmentById(Long departmentId, Department department) {
		Department deb = departmentRepository.findById(departmentId).get();

		if (Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())) {
			deb.setDepartmentName(department.getDepartmentName());
		}

		if (Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())) {
			deb.setDepartmentCode(department.getDepartmentCode());
		}

		if (Objects.nonNull(department.getDepartmentAddress())
				&& !"".equalsIgnoreCase(department.getDepartmentAddress())) {
			deb.setDepartmentAddress(department.getDepartmentAddress());
		}

		return departmentRepository.save(deb);

	}

	@Override
	public Department fetchDepartmentId(String departmentName) {

		return departmentRepository.findByDepartmentName(departmentName);

	}

}
