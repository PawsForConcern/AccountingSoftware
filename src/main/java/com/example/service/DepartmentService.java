package com.example.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.persistence.domain.Department;
import com.example.persistence.repository.DepartmentRepo;
import com.example.rest.dto.DepartmentDTO;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepo repo;
	
	@Autowired
	private ModelMapper mapper;

	public DepartmentService(DepartmentRepo repo) {
		super();
		this.repo = repo;
	}
	
	private DepartmentDTO mapToDTO(Department department) {
		return this.mapper.map(department, DepartmentDTO.class);
	}
	
	public DepartmentDTO createDepartment(Department department) {
		return this.mapToDTO(this.repo.save(department));
	}
	
	public List<DepartmentDTO> getAllDepartments() {
		return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
	}
	
	public DepartmentDTO getDepartmentById(Long id) {
		return this.mapToDTO(this.repo.findById(id).get());
	}
	
	public DepartmentDTO updateDepartment(Long id, Department department) {
		Department existing = this.repo.findById(id).get();
		
		existing.setDepartmentName(department.getDepartmentName());
		existing.setDepartmentExpenses(department.getDepartmentExpenses());
		return this.mapToDTO(this.repo.save(existing));
	}
	
	public boolean deleteDepartment(Long id) {
		this.repo.deleteById(id);
		return !this.repo.existsById(id);
	}
}
