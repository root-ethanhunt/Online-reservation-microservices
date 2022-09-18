package com.Booking.Bookingservice.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Booking")
public class Booking {
	@Id
	private String bookingId;
	private List<BookingDetails>passengerList;
	private  BookingInfo bookingDetails;
	private User user;
	private String price;
	
	
    private String status;


	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Booking(List<BookingDetails> passengerList, BookingInfo bookingDetails, User user, String price,
			String status) {
		super();
		this.passengerList = passengerList;
		this.bookingDetails = bookingDetails;
		this.user = user;
		this.price = price;
		this.status = status;
	}


	public String getBookingId() {
		return bookingId;
	}


	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}


	public List<BookingDetails> getPassengerList() {
		return passengerList;
	}


	public void setPassengerList(List<BookingDetails> passengerList) {
		this.passengerList = passengerList;
	}


	public BookingInfo getBookingDetails() {
		return bookingDetails;
	}


	public void setBookingDetails(BookingInfo bookingDetails) {
		this.bookingDetails = bookingDetails;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	

	
}
