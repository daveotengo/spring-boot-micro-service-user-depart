package com.allitsolltd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allitsolltd.entity.Department;
import com.allitsolltd.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
	
	@Autowired
	private DepartmentService deptService;
	
	@PostMapping
	public Department saveDepartment(@RequestBody Department department) {
		
		log.info("Inside saveDepartment of DepartmentController");
		
		return deptService.saveDepartment(department);
	}
	
	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable("id")Long departmentId) {
		
		log.info("Inside findDepartmentById of DepartmentController");

		return deptService.findDepartmentById(departmentId);
		
	}

}
