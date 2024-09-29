package src.controller;

import org.springframework.web.bind.annotation.*;
import src.constant.UrlConstant;
import src.dto.request.UserLoginReq;
import src.dto.request.UserSearchReq;
import src.dto.response.UserSearchRes;
import src.dto.response.UserDetailRes;
import src.dto.response.UserCourseDetailRes;
import src.dto.response.UserCourseLessonRes;
import src.dto.request.UserRegisterReq;
import src.dto.request.UserCourseSearchReq;
import src.dto.response.UserCourseSearchRes;
import src.dto.response.CourseDetailRes;

import java.util.List;

@RestController
public class UserController {

    @PostMapping(UrlConstant.USER_LOGIN)
    public Object login(@RequestBody UserLoginReq userLoginReq) {
        return userLoginReq;

    }

    @DeleteMapping(UrlConstant.USER_DELETE)
    public Object removeUser(@PathVariable("user_id") String userId) {
        return userId;
    }

    @GetMapping(UrlConstant.USER_SEARCH)
    public Object searchUser(
            @RequestParam("sort") String sort,
            @RequestParam("page") Integer page,
            @RequestParam("size") Integer size,
            @RequestBody UserSearchReq userSearchReq
    ) {
        UserSearchRes res = new UserSearchRes();
        res.setPage(page);
        res.setSize(size);
        res.setSort(sort);
        res.setName(res.getName());
        res.setStatus(res.getStatus());
        res.setCreatedDateFrom(res.getCreatedDateFrom());
        res.setCreatedDateTo(res.getCreatedDateTo());
        res.setUsername(res.getUsername());
        return res;
    }

    @GetMapping(UrlConstant.USER_DETAIL)
    public Object getUserDetail(@PathVariable("user_id") String userId)
    {
        UserDetailRes res = new UserDetailRes();
        res.setUsername("username");
        res.setName("name");
        res.setStatus("status");
        res.setNumberOfCourses(0);
        return res;
    }

    @GetMapping(UrlConstant.USER_COURSES)
    public Object getUserCourses(@PathVariable("user_id") String userId,
                                 @PathVariable("course_id") String courseId)
    {
        UserCourseDetailRes res = new UserCourseDetailRes();
        res.setUserName("userName");
        res.setCourseName("courseName");
        res.setCourseDescription("courseDescription");
        res.setTeacherName("teacherName");
        res.setRating(0);
        res.setReview("review");
        res.setCreatedDate("createdDate");
        res.setUpdatedDate("updatedDate");
        res.setStatus("status");
        res.setNumberOfLessonsInProgress(0);
        res.setNumberOfLessonsCompleted(0);
        return res;
    }

    @GetMapping(UrlConstant.USER_COURSE_LESSONS)
    public Object getUserCourseLessons(@PathVariable("user_id") String userId,
                                       @PathVariable("course_id") String courseId,
                                       @PathVariable("lesson_id") String lessonId)
    {
        UserCourseLessonRes res = new UserCourseLessonRes();
        res.setUserName("userName");
        res.setCourseName("courseName");
        res.setLessonName("lessonName");
        res.setUserCourseLessonStatus("userCourseLessonStatus");
        res.setLessonDescription("lessonDescription");
        res.setLessonUrl("lessonUrl");
        return res;
    }

    @PostMapping(UrlConstant.USER_REGISTER)
    public Object register(@RequestBody UserRegisterReq userRegisterReq) {
        return userRegisterReq;
    }

    @PutMapping(UrlConstant.USER_UPDATE)
    public Object updateUser(@PathVariable("user_id") String userId,
                             @RequestBody UserRegisterReq userRegisterReq) {
        return userRegisterReq;
    }

    @GetMapping(UrlConstant.USER_COURSES_SEARCH)
    public UserCourseSearchRes searchUserCourses(
            @PathVariable("user_id") String userId,
            @RequestParam(value = "sort", defaultValue = "createdDate,desc") String sort,
            @RequestParam(value = "page", defaultValue = "0") int page,
            @RequestParam(value = "size", defaultValue = "10") int size,
            @RequestBody(required = false) UserCourseSearchReq searchReq) {

        // Logic to fetch and filter user courses based on searchReq, sort, page, and size
        List<CourseDetailRes> courses = fetchUserCourses(userId, searchReq, sort, page, size);

        return UserCourseSearchRes.builder()
                .courses(courses)
                .page(page)
                .size(size)
                .sort(sort)
                .build();
    }

    private List<CourseDetailRes> fetchUserCourses(String userId, UserCourseSearchReq searchReq, String sort, int page, int size) {
        // Implement the logic to fetch and filter courses from the database
        // This is a placeholder implementation
        return List.of(new CourseDetailRes());
    }

}
