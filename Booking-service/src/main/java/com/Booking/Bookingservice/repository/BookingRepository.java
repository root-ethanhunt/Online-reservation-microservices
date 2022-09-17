package com.Booking.Bookingservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Booking.Bookingservice.models.Booking;

public interface BookingRepository extends MongoRepository<Booking, Integer> {

}
