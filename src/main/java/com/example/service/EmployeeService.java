package com.example.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.EmployeeNotFoundException;
import com.example.persistence.domain.Employee;
import com.example.persistence.repository.EmployeeRepo;
import com.example.rest.dto.EmployeeDTO;


@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo repo;
	
	@Autowired
	private ModelMapper mapper;

	public EmployeeService(EmployeeRepo repo, ModelMapper mapper) {
		super();
		this.repo = repo;
		this.mapper = mapper;
	}

	private EmployeeDTO mapToDTO(Employee employee) {
		return this.mapper.map(employee, EmployeeDTO.class);
	}
	
	public EmployeeDTO createEmployee(Employee employee) {
		return this.mapToDTO(this.repo.save(employee));
	}
	
	public List<EmployeeDTO> getAllEmployees() {
		return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
	}
	
	public EmployeeDTO getEmployeeById(Long id) {
		return this.mapToDTO(this.repo.findById(id).orElseThrow(EmployeeNotFoundException::new));
	}
	
	public EmployeeDTO updateEmployee(Long id, Employee employee) {
		Employee existing = this.repo.findById(id).orElseThrow(EmployeeNotFoundException::new);
		
		existing.setEmployeeBenefits(employee.getEmployeeBenefits());
		existing.setEmployeeBonuses(employee.getEmployeeBenefits());
		existing.setDepartment(employee.getDepartment());
		existing.setEmployeeName(employee.getEmployeeName());
		existing.setEmployeeSalary(employee.getEmployeeSalary());
		return this.mapToDTO(this.repo.save(existing));
	}
	
	public boolean deleteEmployee(Long id) {
		this.repo.deleteById(id);
		return !this.repo.existsById(id);
	}
}
