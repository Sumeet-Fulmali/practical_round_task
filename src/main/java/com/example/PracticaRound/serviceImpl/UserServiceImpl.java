package com.example.PracticaRound.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PracticaRound.dao.UserDao;
import com.example.PracticaRound.entity.User;
import com.example.PracticaRound.service.UserService;

@Service
public class UserServiceImpl  implements UserService{
	
	@Autowired
	UserDao dao;

	@Override
	public String saveUser(User user) {
		return dao.saveUser(user);
	}


	@Override
	public List<User> getAllUser() {
		
		return dao.getAllUser();
	}

}
