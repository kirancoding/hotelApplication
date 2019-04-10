package com.hotelapp.HotelApp.service;

import com.hotelapp.HotelApp.entity.User;

public interface UserService {
	//public String register(String email,String userName,long userPhone,String userPassword);
	public User register(User theUser);
}
