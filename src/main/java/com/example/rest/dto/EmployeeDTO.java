package com.example.rest.dto;

import com.example.persistence.domain.Department;

public class EmployeeDTO {
	private Long id;
	private String employeeName;
	private float employeeSalary;
	private float employeeBenefits;
	private float employeeBonuses;
	private Department department;

	public EmployeeDTO(Long employeeID, String employeeName, float employeeSalary, float employeeBenefits,
			float employeeBonuses, Department department) {
		super();
		this.id = employeeID;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeBenefits = employeeBenefits;
		this.employeeBonuses = employeeBonuses;
		this.department = department;
	}

	public EmployeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getEmployeeID() {
		return id;
	}

	public void setEmployeeID(Long employeeID) {
		this.id = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public float getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public float getEmployeeBenefits() {
		return employeeBenefits;
	}

	public void setEmployeeBenefits(float employeeBenefits) {
		this.employeeBenefits = employeeBenefits;
	}

	public float getEmployeeBonuses() {
		return employeeBonuses;
	}

	public void setEmployeeBonuses(float employeeBonuses) {
		this.employeeBonuses = employeeBonuses;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [employeeID=" + id + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", employeeBenefits=" + employeeBenefits + ", employeeBonuses=" + employeeBonuses
				+ ", department=" + department + "]";
	}
	
}
