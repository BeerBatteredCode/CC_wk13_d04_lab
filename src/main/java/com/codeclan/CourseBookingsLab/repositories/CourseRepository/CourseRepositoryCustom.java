package com.codeclan.CourseBookingsLab.repositories.CourseRepository;

import com.codeclan.CourseBookingsLab.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {

    List<Course> findCoursesByCustomer(Long id);

}
