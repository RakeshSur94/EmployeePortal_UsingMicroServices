package com.nt.service;

import java.util.List;

import com.eal.entity.Department;

public interface IDepartmentService {
	public String registerDepartment(Department department);
	public List<Department> getAllDepartment();
	public Department fetchDepartmentById(int id);

}
