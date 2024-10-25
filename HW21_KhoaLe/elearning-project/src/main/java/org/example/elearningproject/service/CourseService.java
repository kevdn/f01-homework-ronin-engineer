package org.example.elearningproject.service;

import org.springframework.stereotype.Service;
import org.example.elearningproject.dto.request.CourseUpdateReq;
import org.example.elearningproject.dto.request.CourseSearchReq;
import org.example.elearningproject.dto.request.CourseAddReq;
import org.springframework.validation.BindingResult;

@Service
public interface CourseService {

        Object createCourse(CourseAddReq courseAddReq);

        Object createCourse(CourseAddReq courseAddReq, BindingResult bindingResult);

        Object updateCourse(String courseId, CourseUpdateReq courseUpdateReq);

        Object updateCourse(String courseId, CourseUpdateReq courseUpdateReq, BindingResult bindingResult);

        Object removeCourse(String courseId);

        Object searchCourse(String sort, Integer page, Integer size, CourseSearchReq courseSearchReq);

        Object getCourseDetail(String courseId);


}
