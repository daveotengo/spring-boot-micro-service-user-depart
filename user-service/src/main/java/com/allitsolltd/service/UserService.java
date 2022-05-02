package com.allitsolltd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.allitsolltd.VO.Department;
import com.allitsolltd.VO.ResponseTemplateVO;
import com.allitsolltd.entity.User;
import com.allitsolltd.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		
		log.info("Inside saveUser of UserService");

		return userRepository.save(user);
	}

	public User findUserById(Long userId) {
		log.info("Inside findUserById of UserService");

		return userRepository.findByUserId(userId);
	}

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		
		ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
		User user = userRepository.findByUserId(userId);
		responseTemplateVO.setUser(user);
		
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentId(),
				Department.class);
		
		responseTemplateVO.setDepartment(department);
		
		return responseTemplateVO;
		
	}

	

}
