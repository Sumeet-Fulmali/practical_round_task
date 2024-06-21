package com.example.PracticaRound.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PracticaRound.entity.User;
import com.example.PracticaRound.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService service;
	
	@PostMapping("/save-user")
	public String saveUser(@RequestBody User user) {
		return service.saveUser(user);
		
	}
	
	@GetMapping("/get-all-user")
	public List<User> getAllUser(){
		return service.getAllUser();
		
	}

}
