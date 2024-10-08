package org.example.elearningproject.service;

import org.springframework.stereotype.Service;
import org.example.elearningproject.dto.request.CourseUpdateReq;
import org.example.elearningproject.dto.request.CourseSearchReq;
import org.example.elearningproject.dto.request.CourseAddReq;

@Service
public interface CourseService {

        Object createCourse(CourseAddReq courseAddReq);

        Object updateCourse(String courseId, CourseUpdateReq courseUpdateReq);

        Object removeCourse(String courseId);

        Object searchCourse(String sort, Integer page, Integer size, CourseSearchReq courseSearchReq);

        Object getCourseDetail(String courseId);


}
