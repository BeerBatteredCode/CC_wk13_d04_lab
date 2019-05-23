package com.codeclan.CourseBookingsLab.repositories.BookingRepository;

import com.codeclan.CourseBookingsLab.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom{
}
