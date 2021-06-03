package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;


@RestController
@RequestMapping("/employee")
public class EmployeeContoller {
private EmployeeService employeeService;

public EmployeeContoller(EmployeeService employeeService) {
	super();
	this.employeeService = employeeService;
}
@GetMapping("/all")
public List <Employee> findAllEmployees(){
	return employeeService.getAllEmployee();
}
@PostMapping("/add")
public Employee addEmployee(@RequestBody Employee employee) {
	return employeeService.addEmployee(employee);
}
@GetMapping("/get/{id}")
public Employee getEmployeeById(@PathVariable Long id) {
	return employeeService.getEmployeeById(id);
}

@PatchMapping("/update")
public Employee updateEmployee(@RequestBody Employee employee) {
	return employeeService.updateEmployee(employee);
}
@DeleteMapping("/delete/{id}")
public void deleteEmployee(@PathVariable Long id) {
	 employeeService.deleteEmployee(id);
}
}
