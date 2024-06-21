package com.example.PracticaRound.service;

import java.util.List;

import com.example.PracticaRound.entity.User;

public interface UserService {
	
	public String saveUser(User user);
	public List<User> getAllUser();

}
