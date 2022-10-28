package com.example.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<DepartmentDTO> createDepartment(@RequestBody Department department) {
		return new ResponseEntity<>(this.service.createDepartment(department),HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<DepartmentDTO>> getAllDepartments() {
		return new ResponseEntity<>(this.service.getAllDepartments(),HttpStatus.OK);
	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<DepartmentDTO> getDepartmentById(@PathVariable Long id) {
		return new ResponseEntity<>(this.service.getDepartmentById(id),HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<DepartmentDTO> updateDepartment(@PathVariable Long id, @RequestBody Department department) {
		return new ResponseEntity<>(this.service.updateDepartment(id, department),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> deleteDepartment(@PathVariable Long id) {
		return new ResponseEntity<>(this.service.deleteDepartment(id),HttpStatus.OK);
	}
}