package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Department;
import com.example.demo.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
private DepartmentService departmentService;

public DepartmentController(DepartmentService departmentService) {
	super();
	this.departmentService = departmentService;
}
@GetMapping("/all")
public List<Department> getAllDepartment(){
	return departmentService.getAllDepartment();
}
@GetMapping("/all/{name}")
public Department getDepartmentByName(@PathVariable("name") String name){
	return departmentService.getDepartmentByName(name);
}
}
