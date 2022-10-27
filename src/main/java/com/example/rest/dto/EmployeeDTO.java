package com.example.rest.dto;

public class EmployeeDTO {
	private Long employeeID;
	private String employeeName;
	private float employeeSalary;
	private float employeeBenefits;
	private float employeeBonuses;
	private Long departmentID;
	
	public EmployeeDTO(Long employeeID, String employeeName, float employeeSalary, float employeeBenefits,
			float employeeBonuses, Long departmentID) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeBenefits = employeeBenefits;
		this.employeeBonuses = employeeBonuses;
		this.departmentID = departmentID;
	}

	public EmployeeDTO() {
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
		return "EmployeeDTO [employeeID=" + employeeID + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", employeeBenefits=" + employeeBenefits + ", employeeBonuses=" + employeeBonuses
				+ ", departmentID=" + departmentID + "]";
	}
	
	
}
