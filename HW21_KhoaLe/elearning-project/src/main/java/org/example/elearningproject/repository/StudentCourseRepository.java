package org.example.elearningproject.repository;

import org.example.elearningproject.entity.StudentCourse;
import org.example.elearningproject.entity.compositeID.StudentCourseId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentCourseRepository extends JpaRepository<StudentCourse, StudentCourseId> {

}
