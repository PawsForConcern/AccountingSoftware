package com.example.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.persistence.domain.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

}
