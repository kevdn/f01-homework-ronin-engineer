package org.example.elearningproject.repository;

import org.example.elearningproject.entity.StudentCourseLesson;
import org.example.elearningproject.entity.compositeID.StudentCourseLessonId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentCourseLessonRepository extends JpaRepository<StudentCourseLesson, StudentCourseLessonId> {

}
