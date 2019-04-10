package com.hotelapp.HotelApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotelapp.HotelApp.dao.UserDAO;
import com.hotelapp.HotelApp.entity.User;

@Service
public class UserServiceImpl implements UserService {

	
	UserDAO userDAO;
	
	
	@Autowired
	public UserServiceImpl(UserDAO userDAO) {
		this.userDAO = userDAO;
	}



	@Override
	@Transactional
	public User register(User theUser) {
			return userDAO.register(theUser);
	}

}
