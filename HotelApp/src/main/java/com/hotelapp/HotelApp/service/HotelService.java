package com.hotelapp.HotelApp.service;

import java.util.List;

import com.hotelapp.HotelApp.entity.Hotel;

public interface HotelService {
	
	public List<Hotel> findAll();
	public List<Hotel> findByCity(String hotelCity);
}
