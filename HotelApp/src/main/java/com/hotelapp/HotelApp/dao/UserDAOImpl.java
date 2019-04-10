package com.hotelapp.HotelApp.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hotelapp.HotelApp.entity.User;
import org.hibernate.Session;

@Repository
public class UserDAOImpl implements UserDAO {

	private EntityManager entityManager;

	// set up constructor injection
	@Autowired
	public UserDAOImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	
	@Override
	public User register(User user) {
		Session currentSession = entityManager.unwrap(Session.class);
		
		currentSession.save(user);
		
		return user;
	}

}
