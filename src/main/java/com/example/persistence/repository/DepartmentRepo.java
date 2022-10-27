package com.example.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.persistence.domain.Department;

public interface DepartmentRepo extends JpaRepository<Department, Long> {
	
}
