package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentRepository;

@Service
@Transactional
public class DepartmentService {
	private DepartmentRepository departmentRepository;

	@Autowired
	public DepartmentService(DepartmentRepository departmentRepository) {
		super();
		this.departmentRepository = departmentRepository;
	}
	public List<Department> getAllDepartment(){
		return departmentRepository.findAll();
	}
	public Department getDepartmentByName(String name) {
		return departmentRepository.findByName(name);
	}

}
