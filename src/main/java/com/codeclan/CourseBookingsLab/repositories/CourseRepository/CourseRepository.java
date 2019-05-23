package com.codeclan.CourseBookingsLab.repositories.CourseRepository;

import com.codeclan.CourseBookingsLab.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {
}
