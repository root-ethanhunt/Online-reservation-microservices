package com.Booking.Bookingservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Booking.Bookingservice.models.BookingInfo;

@Repository
public interface BookingInfoRepository extends MongoRepository<BookingInfo, Integer> {

}
