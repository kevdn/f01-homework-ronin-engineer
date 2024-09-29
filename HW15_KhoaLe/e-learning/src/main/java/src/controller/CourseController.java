package src.controller;

import org.springframework.web.bind.annotation.*;
import src.constant.UrlConstant;
import src.dto.request.CourseAddReq;
import src.dto.request.CourseUpdateReq;
import src.dto.request.CourseSearchReq;
import src.dto.request.CourseRatingReq;
import src.dto.request.CourseRegisterReq;
import src.dto.request.CourseReviewReq;
import src.dto.response.CourseSearchRes;
import src.dto.response.CourseDetailRes;


@RestController
public class CourseController {

        @PostMapping(UrlConstant.COURSE_CREATE)
        public Object createCourse(@RequestBody CourseAddReq courseAddReq) {
            return courseAddReq;
        }

        @PutMapping(UrlConstant.COURSE_UPDATE)
        public Object updateCourse(@PathVariable("course_id") String courseId,
                                   @RequestBody CourseUpdateReq courseUpdateReq) {
            return courseId;
        }

        @DeleteMapping(UrlConstant.COURSE_DELETE)
        public Object deleteCourse(@PathVariable("course_id") String courseId) {
            return courseId;
        }

        @GetMapping(UrlConstant.COURSE_SEARCH)
        public Object searchCourse(
                @RequestParam("sort") String sort,
                @RequestParam("page") Integer page,
                @RequestParam("size") Integer size,
                @RequestBody CourseSearchReq courseSearchReq
        ) {
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

        @GetMapping(UrlConstant.COURSE_DETAIL)
        public Object getCourseDetail(@PathVariable("course_id") String courseId)
        {
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

        @PostMapping(UrlConstant.COURSE_REGISTER)
        public Object registerCourse(@PathVariable("course_id") String courseId,
                                     @RequestBody CourseRegisterReq courseRegisterReq) {
            return courseId;
        }

        @PostMapping(UrlConstant.COURSE_RATING)
        public Object rateCourse(@PathVariable("course_id") String courseId,
                                 @RequestBody CourseRatingReq courseRatingReq) {
            return courseId;
        }

        @PostMapping(UrlConstant.COURSE_REVIEW)
        public Object reviewCourse(@PathVariable("course_id") String courseId,
                                   @RequestBody CourseReviewReq courseReviewReq) {
            return courseId;
        }


}
