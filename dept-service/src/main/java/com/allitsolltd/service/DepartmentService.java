package com.allitsolltd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allitsolltd.entity.Department;
import com.allitsolltd.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DepartmentService {
	
	@Autowired
	DepartmentRepository repository;

	public Department saveDepartment(Department department) {
		
		log.info("Inside saveDepartment of DepartmentService");


		return repository.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		log.info("Inside findDepartmentById of DepartmentService");

		return repository.findByDepartmentId(departmentId);
	}

}
