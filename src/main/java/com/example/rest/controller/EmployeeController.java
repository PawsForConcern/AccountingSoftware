package com.example.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.persistence.domain.Employee;
import com.example.rest.dto.EmployeeDTO;
import com.example.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/create")
	public EmployeeDTO createEmployee(@RequestBody Employee employee) {
		return this.service.createEmployee(employee);
	}
	
	@GetMapping("/getAll")
	public List<EmployeeDTO> getAllEmployees() {
		return this.service.getAllEmployees();
	}
	
	@GetMapping("/getById/{id}")
	public EmployeeDTO getEmployeeById(@PathVariable Long id) {
		return this.service.getEmployeeById(id);
	}
	
	@PutMapping("/update/{id}")
	public EmployeeDTO updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
		return this.service.updateEmployee(id, employee);
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean deleteDepartment(@PathVariable Long id) {
		return this.service.deleteEmployee(id);
	}
}
