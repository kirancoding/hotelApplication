package com.hotelapp.HotelApp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotelapp.HotelApp.dao.HotelDAO;
import com.hotelapp.HotelApp.entity.Hotel;
import com.hotelapp.HotelApp.service.HotelService;

@RestController
@RequestMapping("/api")
public class HotelRestController {

	private HotelService hotelService;;

	public HotelRestController() {

	}

	@Autowired
	public HotelRestController(HotelService hotelService) {
		this.hotelService = hotelService;
	}

	// expose "/hotels" and return list of hotels
	@GetMapping("/hotels")
	public List<Hotel> findAll() {
		System.out.println("hotels ******* in restcontroller :" + hotelService.findAll());
		return hotelService.findAll();

	}

	// expose "/hotels" and return list of hotels from selected city
	@GetMapping("/hotels/{hotelCity}")
	public List<Hotel> findByCity(@PathVariable String hotelCity) {

		System.out.println("cityname : " + hotelCity);

		List<Hotel> theHotel = hotelService.findByCity(hotelCity);
		if (hotelCity == null) {
			throw new RuntimeException("Selected City not found - " + hotelCity);
		}

		return theHotel;
	}

}
