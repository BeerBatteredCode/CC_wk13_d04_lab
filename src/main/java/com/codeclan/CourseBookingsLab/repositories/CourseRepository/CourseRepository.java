package com.codeclan.CourseBookingsLab.repositories.CourseRepository;

import com.codeclan.CourseBookingsLab.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {

    List<Course> findCoursesByRating(int rating);

    List<Course> findCoursesByCustomer(Long id);

}
