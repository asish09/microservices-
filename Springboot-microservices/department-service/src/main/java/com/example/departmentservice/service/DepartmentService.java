package com.example.departmentservice.service;

import org.springframework.stereotype.Service;

import com.example.departmentservice.Dto.DepartmentDto;

@Service
public interface DepartmentService {

	DepartmentDto saveDepartment(DepartmentDto departmentDto);
	
	DepartmentDto getDepartmentByCode(String departmentCode);
}
