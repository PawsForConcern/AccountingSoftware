package com.example.department;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.persistence.domain.Department;
import com.example.persistence.repository.DepartmentRepo;
import com.example.rest.dto.DepartmentDTO;
import com.example.service.DepartmentService;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class DepartmentServiceUnitTest {
	
	@MockBean
	private DepartmentRepo repo;
	
	@MockBean
	private ModelMapper mapper;

	@InjectMocks
	private DepartmentService service;
	
	private Department departmentI;
	private Department departmentO;
	private DepartmentDTO departmentDTO;
	
	@BeforeEach
	void setDepartment() {
		this.departmentI=new Department();
		this.departmentI.setDepartmentName("Test Department");
		this.departmentI.setDepartmentExpenses(20.0f);
		this.departmentO=this.departmentI;
		this.departmentO.setDepartmentId(1L);
		this.departmentDTO= new DepartmentDTO();
		this.departmentDTO.setDepartmentId(1L);
		this.departmentDTO.setDepartmentName("Test Department");
		this.departmentDTO.setDepartmentExpenses(20.0f);
	}
	
	@Test
	void testCreate() {
		when(this.repo.save(this.departmentI)).thenReturn(this.departmentO);
		when(this.mapper.map(this.departmentO, DepartmentDTO.class)).thenReturn(this.departmentDTO);
		assertEquals(this.departmentDTO,service.createDepartment(this.departmentI));
	}
	
	@Test 
	void testGetAll() {
		ArrayList<Department> temp1 = new ArrayList<>();
		temp1.add(departmentO);
		ArrayList<DepartmentDTO> temp2 = new ArrayList<>();
		temp2.add(departmentDTO);
		when(this.repo.findAll()).thenReturn(temp1);
		when(this.mapper.map(this.departmentO, DepartmentDTO.class)).thenReturn(this.departmentDTO);
		assertEquals(temp2,service.getAllDepartments());
	}
	
	@Test 
	void testGetOne() {
		Long id = 1L;
		Optional<Department> temp = Optional.of(this.departmentO);
		when(this.repo.findById(id)).thenReturn(temp);
		when(this.mapper.map(this.departmentO, DepartmentDTO.class)).thenReturn(this.departmentDTO);
		assertEquals(this.departmentDTO,service.getDepartmentById(id));
	}
	
	@Test 
	void testUpdate() {
		Long id = 1L;
		Optional<Department> temp = Optional.of(this.departmentO);
		when(this.repo.findById(id)).thenReturn(temp);
		when(this.repo.save(this.departmentI)).thenReturn(this.departmentO);
		when(this.mapper.map(this.departmentO, DepartmentDTO.class)).thenReturn(this.departmentDTO);
		assertEquals(this.departmentDTO,service.updateDepartment(id,departmentI));
	}
	
	@Test 
	void testDelete() {
		Long id = 1L;
		when(this.repo.existsById(id)).thenReturn(false);
		assertEquals(true,service.deleteDepartment(id));
	}
}
