package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
@Service
@Transactional

public class EmployeeService {
	private EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeService(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}
	
	public Employee addEmployee(Employee employee){
		return employeeRepository.save(employee);
	}
	public List<Employee> getAllEmployee(){
		return employeeRepository.findAll();
	}
	
	public Employee getEmployeeById(Long id){
		return employeeRepository.getEmpolyeeById(id);
	}
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	public void deleteEmployee(Long id) {
		 employeeRepository.deleteEmployeeById(id);
	}

}

