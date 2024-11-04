package org.example.elearningproject.repository;

import org.example.elearningproject.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {

    Course findByName(String name);

}