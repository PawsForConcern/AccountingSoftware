package com.example.rest.dto;

public class DepartmentDTO {
	private Long departmentId;
	private String departmentName;
	private float departmentExpenses;
	
	public DepartmentDTO(Long departmentId, String departmentName, float departmentExpenses) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentExpenses = departmentExpenses;
	}

	public DepartmentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
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
	
	
}
