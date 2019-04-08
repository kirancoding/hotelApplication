package com.hotelapp.HotelApp.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.hotelapp.HotelApp.entity.Hotel;

@Repository
public class HotelDAOImpl implements HotelDAO {

	// define field for entitymanager

	private EntityManager entityManager;

	// set up constructor injection
	@Autowired
	public HotelDAOImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	public List<Hotel> findAll() {

		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);

		// create a query
		Query<Hotel> theQuery = currentSession.createQuery("from Hotel", Hotel.class);

		// execute query and get result list
		List<Hotel> hotels = theQuery.getResultList();

		System.out.println("hotels in DAO implementation :" + hotels);

		// return the results
		return hotels;
	}

	@Override
	public List<Hotel> findByCity(String hotelCity) {
		// get the current hibernate session

		Session currentSession = entityManager.unwrap(Session.class);

		// get the employee
		Query<Hotel> theQuery = currentSession.createQuery("from Hotel theHotel where theHotel.hotelCity=:hotelCity",
				Hotel.class);

		// execute query and get result list
		List<Hotel> hotels = theQuery.setParameter("hotelCity", hotelCity).getResultList();

		// return the employee
		return hotels;

	}

}
