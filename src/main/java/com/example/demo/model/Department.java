package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Department {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long id;
private String name;
@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(name="DId",referencedColumnName="id")
private List<Employee> employees;
public Department() {}
public Department(String name, List<Employee> employees) {
	super();
	this.name = name;
	this.employees = employees;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Employee> getEmployees() {
	return employees;
}
public void setEmployees(List<Employee> employees) {
	this.employees = employees;
}

}