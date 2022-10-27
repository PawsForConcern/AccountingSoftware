package com.example.persistence.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private String departmentName;
	@NotNull
	@Min(0)
	private float departmentExpenses;
	
	@OneToMany(mappedBy="department", fetch=FetchType.EAGER)
	@OnDelete(action=OnDeleteAction.CASCADE)
	@JsonIgnore
	private List<Employee> employees= new ArrayList<>();

	public Department(Long departmentId, @NotNull String departmentName, @NotNull @Min(0) float departmentExpenses,
			List<Employee> employees) {
		super();
		this.id = departmentId;
		this.departmentName = departmentName;
		this.departmentExpenses = departmentExpenses;
		this.employees = employees;
	}

	public Department() {
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
		return "Department [departmentId=" + id + ", departmentName=" + departmentName
				+ ", departmentExpenses=" + departmentExpenses + "]";
	}
	
	
}
