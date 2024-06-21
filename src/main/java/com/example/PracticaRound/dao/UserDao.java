package com.example.PracticaRound.dao;

import java.util.List;

import com.example.PracticaRound.entity.User;

public interface UserDao {
	
	public String saveUser(User user);
	public List<User> getAllUser();

}
