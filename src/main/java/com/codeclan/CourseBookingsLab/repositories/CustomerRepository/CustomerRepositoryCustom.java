package com.codeclan.CourseBookingsLab.repositories.CustomerRepository;

import com.codeclan.CourseBookingsLab.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {

    List<Customer> findCustomersByCourse(Long id);

    List<Customer> findCustomersByTownAndCourse(String town, Long id);

    List<Customer> findCustomersByTownAndCourseAndAge(String town, Long id, int age);

}
