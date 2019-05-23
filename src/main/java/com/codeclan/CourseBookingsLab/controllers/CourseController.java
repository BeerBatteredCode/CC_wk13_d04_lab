package com.codeclan.CourseBookingsLab.controllers;

import com.codeclan.CourseBookingsLab.models.Course;
import com.codeclan.CourseBookingsLab.repositories.CourseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/rating/{rating}")
    public List<Course> findCoursesByRating(@PathVariable int rating){
        return courseRepository.findCoursesByRating(rating);
    }

    @GetMapping(value = "/customer/{id}")
    public List<Course> findCoursesByCustomer(@PathVariable Long id){
        return courseRepository.findCoursesByCustomer(id);
    }


}
