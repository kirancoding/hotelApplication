package com.hotelapp.HotelApp.dao;

import java.util.List;

import com.hotelapp.HotelApp.entity.Hotel;

public interface HotelDAO {
	public List<Hotel> findAll();

	public List<Hotel> findByCity(String hotelCity);
}
