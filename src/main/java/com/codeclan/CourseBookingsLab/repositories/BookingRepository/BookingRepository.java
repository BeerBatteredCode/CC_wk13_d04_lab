package com.codeclan.CourseBookingsLab.repositories.BookingRepository;

import com.codeclan.CourseBookingsLab.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom{

    List<Booking> findBookingsByDate(String date);

}
