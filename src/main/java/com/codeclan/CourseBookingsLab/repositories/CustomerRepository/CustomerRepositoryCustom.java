package com.codeclan.CourseBookingsLab.repositories.CustomerRepository;

import com.codeclan.CourseBookingsLab.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {

    List<Customer> findCustomersByCourse(Long id);

}
