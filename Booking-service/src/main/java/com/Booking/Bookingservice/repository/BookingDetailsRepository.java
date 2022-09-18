package com.Booking.Bookingservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Booking.Bookingservice.models.BookingDetails;
@Repository
public interface BookingDetailsRepository extends MongoRepository<BookingDetails, Integer> {

}
