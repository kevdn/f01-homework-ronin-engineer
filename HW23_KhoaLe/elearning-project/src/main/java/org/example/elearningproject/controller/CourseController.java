package org.example.elearningproject.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.example.elearningproject.constant.UrlConstant;
import org.example.elearningproject.dto.request.CourseAddReq;
import org.example.elearningproject.dto.request.CourseUpdateReq;
import org.example.elearningproject.dto.request.CourseSearchReq;
import org.example.elearningproject.service.CourseService;
import org.springframework.beans.factory.annotation.Qualifier;



@RestController
@RequestMapping(UrlConstant.API_V1)
public class CourseController {

        @Autowired
        @Qualifier("courseServiceImpl")
        private CourseService courseService;

        @PostMapping(UrlConstant.COURSE_CREATE)
        public Object createCourse(@RequestBody CourseAddReq courseAddReq, BindingResult bindingResult) {
            return courseService.createCourse(courseAddReq, bindingResult);
        }

        @PutMapping(UrlConstant.COURSE_UPDATE)
        public Object updateCourse(@PathVariable("course_id") String courseId,
                                   @RequestBody CourseUpdateReq courseUpdateReq) {
            return courseService.updateCourse(courseId, courseUpdateReq);
        }

        @DeleteMapping(UrlConstant.COURSE_DELETE)
        public Object deleteCourse(@PathVariable("course_id") String courseId) {
            return courseService.removeCourse(courseId);
        }

        @GetMapping(UrlConstant.COURSE_SEARCH)
        public Object searchCourse(
                @RequestParam("sort") String sort,
                @RequestParam("page") Integer page,
                @RequestParam("size") Integer size,
                @Valid @RequestBody CourseSearchReq courseSearchReq
        ) {
            return courseService.searchCourse(sort, page, size, courseSearchReq);
        }

        @GetMapping(UrlConstant.COURSE_DETAIL)
        public Object getCourseDetail(@PathVariable("course_id") String courseId)
        {
            return courseService.getCourseDetail(courseId);
        }




}
