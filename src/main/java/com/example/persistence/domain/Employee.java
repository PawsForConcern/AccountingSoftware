package com.example.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long employeeID;
	@NotNull
	private String employeeName;
	@NotNull
	@Min(0)
	private float employeeSalary;
	@NotNull
	@Min(0)
	private float employeeBenefits;
	@NotNull
	@Min(0)
	private float employeeBonuses;
	@NotNull
	private Long departmentID;
	
	public Employee(Long employeeID, @NotNull String employeeName, @NotNull @Min(0) float employeeSalary,
			@NotNull @Min(0) float employeeBenefits, @NotNull @Min(0) float employeeBonuses,
			@NotNull Long departmentID) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeBenefits = employeeBenefits;
		this.employeeBonuses = employeeBonuses;
		this.departmentID = departmentID;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(Long employeeID) {
		this.employeeID = employeeID;
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

	public Long getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(Long departmentID) {
		this.departmentID = departmentID;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", employeeBenefits=" + employeeBenefits + ", employeeBonuses=" + employeeBonuses
				+ ", departmentID=" + departmentID + "]";
	}
	
	
}
