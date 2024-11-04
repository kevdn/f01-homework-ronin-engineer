package org.example.elearningproject.repository;

import org.example.elearningproject.entity.UserCourse;
import org.example.elearningproject.entity.compositeID.UserCourseId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentCourseRepository extends JpaRepository<UserCourse, UserCourseId> {

}
