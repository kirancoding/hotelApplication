package com.hotelapp.HotelApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotelapp.HotelApp.dao.HotelDAO;
import com.hotelapp.HotelApp.entity.Hotel;

@Service
public class HotelServiceImpl implements HotelService {

	private HotelDAO hotelDAO;

	@Autowired
	public HotelServiceImpl(HotelDAO hotelDAO) {
		this.hotelDAO = hotelDAO;
	}

	@Override
	@Transactional
	public List<Hotel> findAll() {
		return hotelDAO.findAll();
	}

	@Override
	@Transactional
	public List<Hotel> findByCity(String hotelCity) {
		return hotelDAO.findByCity(hotelCity);
	}

}
