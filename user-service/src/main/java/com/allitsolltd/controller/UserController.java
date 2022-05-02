package com.allitsolltd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allitsolltd.VO.ResponseTemplateVO;
import com.allitsolltd.entity.User;
import com.allitsolltd.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
	
	@Autowired
	private UserService deptService;
	
	@PostMapping
	public User saveUser(@RequestBody User user) {
		
		log.info("Inside saveUser of UserController");
		
		return deptService.saveUser(user);
		
	}
	
	@GetMapping("/{id}")
	public ResponseTemplateVO getUserWithDepartment(@PathVariable("id")Long userId) {
		
		log.info("Inside getUserWithDepartment of UserController");

		return deptService.getUserWithDepartment(userId);
		
	}

}
