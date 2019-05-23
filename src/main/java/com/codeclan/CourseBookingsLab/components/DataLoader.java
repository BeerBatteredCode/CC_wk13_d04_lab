package com.codeclan.CourseBookingsLab.components;


import com.codeclan.CourseBookingsLab.models.Booking;
import com.codeclan.CourseBookingsLab.models.Course;
import com.codeclan.CourseBookingsLab.models.Customer;
import com.codeclan.CourseBookingsLab.repositories.BookingRepository.BookingRepository;
import com.codeclan.CourseBookingsLab.repositories.CourseRepository.CourseRepository;
import com.codeclan.CourseBookingsLab.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component

public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        Customer customer1 = new Customer("Eric", "Ottawa", 25);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Annabel", "Plymouth", 18);
        customerRepository.save(customer2);

        Customer customer3 = new Customer("Grant", "Rutherford", 31);
        customerRepository.save(customer3);

        Course course1 = new Course("CodeClan", "edinburgh", 5);
        courseRepository.save(course1);

        Course course2 = new Course("Trapeze Arts", "Glasgow", 2);
        courseRepository.save(course2);

        Course course3 = new Course("Eric's Rock Climbing", "Ottawa", 5);
        courseRepository.save(course3);

        Booking booking1 = new Booking("23-05-19", customer1, course1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("23-05-19", customer2, course1);
        bookingRepository.save(booking2);
    }
}
