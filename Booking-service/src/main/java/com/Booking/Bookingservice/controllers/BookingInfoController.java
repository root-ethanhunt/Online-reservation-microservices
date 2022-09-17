package com.Booking.Bookingservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Booking.Bookingservice.models.BookingInfo;
import com.Booking.Bookingservice.repository.BookingInfoRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("Booking-info")

public class BookingInfoController {
	
	@Autowired
	private BookingInfoRepository repository;
	
	@PostMapping("/addBooking-info/")
	public String saveBooking(@RequestBody BookingInfo book) {
	   
		repository.save(book);
		return "Added booking info";
	}


}
