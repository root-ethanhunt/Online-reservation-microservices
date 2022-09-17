package com.Booking.Bookingservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Booking.Bookingservice.models.BookingInfo;

public interface BookingInfoRepository extends MongoRepository<BookingInfo, Integer> {

}
