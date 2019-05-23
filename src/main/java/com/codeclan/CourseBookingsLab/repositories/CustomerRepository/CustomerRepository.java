package com.codeclan.CourseBookingsLab.repositories.CustomerRepository;

import com.codeclan.CourseBookingsLab.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
}
