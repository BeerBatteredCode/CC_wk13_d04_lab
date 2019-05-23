package com.codeclan.CourseBookingsLab.controllers;

import com.codeclan.CourseBookingsLab.models.Customer;
import com.codeclan.CourseBookingsLab.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/course/{id}")
    public List<Customer> findCustomersByCourse(@PathVariable Long id){
        return customerRepository.findCustomersByCourse(id);
    }

    @GetMapping(value = "/town/{town}/course/{id}")
    public List<Customer> findCustomersByTownAndCourse(@PathVariable String town, @PathVariable Long id){
        return  customerRepository.findCustomersByTownAndCourse(town, id);
    }

}
