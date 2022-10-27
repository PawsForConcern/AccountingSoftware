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

import com.example.persistence.domain.Department;
import com.example.rest.dto.DepartmentDTO;
import com.example.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	@Autowired
	private DepartmentService service;
	
	@PostMapping("/create")
	public DepartmentDTO createDepartment(@RequestBody Department department) {
		return this.service.createDepartment(department);
	}
	
	@GetMapping("/getAll")
	public List<DepartmentDTO> getAllDepartments() {
		return this.service.getAllDepartments();
	}
	
	@GetMapping("/getById/{id}")
	public DepartmentDTO getDepartmentById(@PathVariable Long id) {
		return this.service.getDepartmentById(id);
	}
	
	@PutMapping("/update/{id}")
	public DepartmentDTO updateDepartment(@PathVariable Long id, @RequestBody Department department) {
		return this.service.updateDepartment(id, department);
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean deleteDepartment(@PathVariable Long id) {
		return this.service.deleteDepartment(id);
	}
}
