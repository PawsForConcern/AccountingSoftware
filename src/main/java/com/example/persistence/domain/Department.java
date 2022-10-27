package com.example.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long departmentId;
	@NotNull
	private String departmentName;
	@NotNull
	@Min(0)
	private float departmentExpenses;
	
	public Department(Long departmentId, @NotNull String departmentName, @NotNull float departmentExpenses) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentExpenses = departmentExpenses;
	}

	public Department() {
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

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName
				+ ", departmentExpenses=" + departmentExpenses + "]";
	}
	
	
}
