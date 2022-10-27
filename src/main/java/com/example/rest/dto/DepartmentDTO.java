package com.example.rest.dto;

import java.util.ArrayList;
import java.util.List;

import com.example.persistence.domain.Employee;

public class DepartmentDTO {
	private Long id;
	private String departmentName;
	private float departmentExpenses;
	private List<Employee> employees= new ArrayList<>();

	public DepartmentDTO(Long departmentId, String departmentName, float departmentExpenses, List<Employee> employees) {
		super();
		this.id = departmentId;
		this.departmentName = departmentName;
		this.departmentExpenses = departmentExpenses;
		this.employees = employees;
	}

	public DepartmentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getDepartmentId() {
		return id;
	}

	public void setDepartmentId(Long departmentId) {
		this.id = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public float getDepartmentExpenses() {
		return departmentExpenses;
	}

	public void setDepartmentExpenses(float departmentExpenses) {
		this.departmentExpenses = departmentExpenses;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "DepartmentDTO [departmentId=" + id + ", departmentName=" + departmentName
				+ ", departmentExpenses=" + departmentExpenses + "]";
	}
}
