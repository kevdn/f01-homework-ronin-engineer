package org.example.elearningproject.repository;

import org.example.elearningproject.entity.UserCourseLesson;
import org.example.elearningproject.entity.compositeID.UserCourseLessonId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentCourseLessonRepository extends JpaRepository<UserCourseLesson, UserCourseLessonId> {

}
