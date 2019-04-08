package com.hotelapp.HotelApp.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hotel")
public class Hotel {

	
//			HOTEL_ID int(11),
//			HOTEL_NAME varchar(50), 
//			HOTEL_EMAIL varchar(50), 
//			HOTEL_PHONE bigint(20),
//			HOTEL_ADDRESS varchar(250),
//			HOTEL_CITY varchar(250), 
//			HOTEL_IMAGE varchar(250), 
//			HOTEL_ROOM_IMAGE  varchar(250),
//			HOTEL_AMENITIES      varchar(250),
//			HOTEL_STARS    int(11), 
//			HOTEL_RATINGS_AVG decimal(2,1),
//			HOTEL_PCOMMENTS    TEXT,
//			HOTEL_NCOMMENTS    TEXT,
//			HOTEL_DESCRIPTION TEXT
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="HOTEL_ID")
	private int hotelId;
	
	@Column(name="HOTEL_NAME")
	private String hotelName;
	
	@Column(name="HOTEL_EMAIL")
	private String hotelEmail;
	
	@Column(name="HOTEL_PHONE")
	private long hotelPhone;
	
	@Column(name="HOTEL_ADDRESS")
	private String hotelAddress;
	
	@Column(name="HOTEL_CITY")
	private String hotelCity;
	
	@Column(name="HOTEL_IMAGE")
	private String hotelImage;
	
	@Column(name="HOTEL_ROOM_IMAGE")
	private String hotelRoomImage;
	
	@Column(name="HOTEL_AMENITIES")
	private String hotelAmenities;
	
	@Column(name="HOTEL_STARS")
	private int hotelStars;
	
	@Column(name="HOTEL_RATINGS_AVG")
	private java.math.BigDecimal hotelRatingsAvg;
	
	@Column(name="HOTEL_PCOMMENTS")
	private String hotelPComments;
	
	@Column(name="HOTEL_NCOMMENTS")
	private String hotelNComments;
	
	@Column(name="HOTEL_DESCRIPTION")
	private String hotelDescription;
	
	
	
	public Hotel(){
		
	}
	
	
	public Hotel(String hotelName, String hotelEmail, long hotelPhone, String hotelAddress, String hotelCity,
			String hotelImage, String hotelRoomImage, String hotelAmenities, int hotelStars, BigDecimal hotelRatingsAvg,
			String hotelPComments, String hotelNComments, String hotelDescription) {		
		this.hotelName = hotelName;
		this.hotelEmail = hotelEmail;
		this.hotelPhone = hotelPhone;
		this.hotelAddress = hotelAddress;
		this.hotelCity = hotelCity;
		this.hotelImage = hotelImage;
		this.hotelRoomImage = hotelRoomImage;
		this.hotelAmenities = hotelAmenities;
		this.hotelStars = hotelStars;
		this.hotelRatingsAvg = hotelRatingsAvg;
		this.hotelPComments = hotelPComments;
		this.hotelNComments = hotelNComments;
		this.hotelDescription = hotelDescription;
	}

	
	
	public int getHotelId() {
		return hotelId;
	}


	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}


	public String getHotelName() {
		return hotelName;
	}


	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}


	public String getHotelEmail() {
		return hotelEmail;
	}


	public void setHotelEmail(String hotelEmail) {
		this.hotelEmail = hotelEmail;
	}


	public long getHotelPhone() {
		return hotelPhone;
	}


	public void setHotelPhone(long hotelPhone) {
		this.hotelPhone = hotelPhone;
	}


	public String getHotelAddress() {
		return hotelAddress;
	}


	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}


	public String getHotelCity() {
		return hotelCity;
	}


	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}


	public String getHotelImage() {
		return hotelImage;
	}


	public void setHotelImage(String hotelImage) {
		this.hotelImage = hotelImage;
	}


	public String getHotelRoomImage() {
		return hotelRoomImage;
	}


	public void setHotelRoomImage(String hotelRoomImage) {
		this.hotelRoomImage = hotelRoomImage;
	}


	public String getHotelAmenities() {
		return hotelAmenities;
	}


	public void setHotelAmenities(String hotelAmenities) {
		this.hotelAmenities = hotelAmenities;
	}


	public int getHotelStars() {
		return hotelStars;
	}


	public void setHotelStars(int hotelStars) {
		this.hotelStars = hotelStars;
	}


	public java.math.BigDecimal getHotelRatingsAvg() {
		return hotelRatingsAvg;
	}


	public void setHotelRatingsAvg(java.math.BigDecimal hotelRatingsAvg) {
		this.hotelRatingsAvg = hotelRatingsAvg;
	}


	public String getHotelPComments() {
		return hotelPComments;
	}


	public void setHotelPComments(String hotelPComments) {
		this.hotelPComments = hotelPComments;
	}


	public String getHotelNComments() {
		return hotelNComments;
	}


	public void setHotelNComments(String hotelNComments) {
		this.hotelNComments = hotelNComments;
	}


	public String getHotelDescription() {
		return hotelDescription;
	}


	public void setHotelDescription(String hotelDescription) {
		this.hotelDescription = hotelDescription;
	}


	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelEmail=" + hotelEmail + ", hotelPhone="
				+ hotelPhone + ", hotelAddress=" + hotelAddress + ", hotelCity=" + hotelCity + ", hotelImage="
				+ hotelImage + ", hotelRoomImage=" + hotelRoomImage + ", hotelAmenities=" + hotelAmenities
				+ ", hotelStars=" + hotelStars + ", hotelRatingsAvg=" + hotelRatingsAvg + ", hotelPComments="
				+ hotelPComments + ", hotelNComments=" + hotelNComments + ", hotelDescription=" + hotelDescription
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
