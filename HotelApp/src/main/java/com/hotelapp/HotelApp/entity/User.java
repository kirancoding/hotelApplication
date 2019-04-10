package com.hotelapp.HotelApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

//	USER_EMAIL varchar(50), 
//	USER_NAME varchar(50),
//	USER_PHONE bigint(20), 
//	USER_PASSWORD varchar(50)
	
	@Column(name="USER_EMAIL")
	private String userEmail;
	
	@Id
	@Column(name="USER_NAME")
	private String userName;
	
	@Column(name="USER_PHONE")
	private long userPhone;
	
	@Column(name="USER_PASSWORD")
	private String userPassword;

	public User(){
		
	}
	
	
	public User(String userEmail, String userName, long userPhone, String userPassword) {
		this.userEmail = userEmail;
		this.userName = userName;
		this.userPhone = userPhone;
		this.userPassword = userPassword;
	}


	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(long userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}


	@Override
	public String toString() {
		return "User [userEmail=" + userEmail + ", userName=" + userName + ", userPhone=" + userPhone
				+ ", userPassword=" + userPassword + "]";
	}
	
	
	
	
	
}
