package org.example.elearningproject.service.impl;

import org.example.elearningproject.dto.response.CourseDetailRes;
import org.example.elearningproject.dto.response.CourseSearchRes;
import org.example.elearningproject.service.CourseService;
import org.example.elearningproject.dto.request.CourseAddReq;
import org.example.elearningproject.dto.request.CourseUpdateReq;
import org.example.elearningproject.dto.request.CourseSearchReq;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

        public Object createCourse(CourseAddReq courseAddReq) {
            return courseAddReq;
        }

        public Object updateCourse(String courseId, CourseUpdateReq courseUpdateReq) {
            return courseUpdateReq;
        }

        public Object removeCourse(String courseId) {
            return courseId;
        }

        public Object searchCourse(String sort, Integer page, Integer size, CourseSearchReq courseSearchReq) {
            CourseSearchRes res = new CourseSearchRes();
            res.setPage(page);
            res.setSize(size);
            res.setSort(sort);
            res.setName(res.getName());
            res.setStatus(res.getStatus());
            res.setTeacherId(res.getTeacherId());
            res.setCreatedDateFrom(res.getCreatedDateFrom());
            res.setCreatedDateTo(res.getCreatedDateTo());
            res.setRatingFrom(res.getRatingFrom());
            res.setRatingTo(res.getRatingTo());
            return res;
        }

        public Object getCourseDetail(String courseId) {
            CourseDetailRes res = new CourseDetailRes();
            res.setCourseName("courseName");
            res.setStatus("status");
            res.setDescription("description");
            res.setNumberOfChapters(0);
            res.setNumberOfLessons(0);
            res.setNumberOfStudents(0);
            res.setTeacherName("teacherName");
            return res;
        }


}
