package org.example.elearningproject.service.impl;

import org.example.elearningproject.constant.StatusConstant;
import org.example.elearningproject.dto.response.*;
import org.example.elearningproject.entity.User;
import org.example.elearningproject.exception.AppException;
import org.example.elearningproject.repository.UserRepository;
import org.example.elearningproject.service.validator.BaseValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.elearningproject.dto.request.UserCourseSearchReq;
import org.example.elearningproject.dto.request.UserRegisterReq;
import org.example.elearningproject.dto.request.UserUpdateReq;
import org.example.elearningproject.service.UserService;
import org.example.elearningproject.dto.request.UserSearchReq;
import org.springframework.validation.BindingResult;

import java.util.Date;
import java.util.List;
import org.example.elearningproject.dto.request.UserLoginReq;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private BaseValidationService baseValidationService;

    @Autowired
    private UserRepository userRepository;

    public Object login(UserLoginReq userLoginReq) {
        return userLoginReq;
    }

    public Object login(UserLoginReq userLoginReq, BindingResult bindingResult) {
        Object errors = baseValidationService.handleFieldExcpetion(bindingResult);
        if (errors != null) {
            return errors;
        }

        User user = userRepository.findByUsername(userLoginReq.getUsername());

        if (user == null) {
            throw new AppException("User not found");
        }

        if (!user.getPassword().equals(userLoginReq.getPassword())) {
            throw new AppException("Invalid password");
        }

        LoginRes res = new LoginRes();
        res.setUsername(user.getUsername());
        res.setDate(new Date());
        res.setName(user.getName());

        return userLoginReq;
    }

    public Object registerUser(UserRegisterReq userRegisterReq) {
        return null;
    }

    public Object registerUser(UserRegisterReq userRegisterReq, BindingResult bindingResult) {
        Object errors = baseValidationService.handleFieldExcpetion(bindingResult);
        if (errors != null) {
            return errors;
        }

        User user = new User();
        user.setUsername(userRegisterReq.getUsername());
        user.setPassword(userRegisterReq.getPassword());
        user.setName(userRegisterReq.getName());
        user.setStatus(StatusConstant.ACTIVE);
        user.setCreatedDate(new Date());
        user.setUpdatedDate(new Date());

        userRepository.save(user);

        UserRegisterRes res = new UserRegisterRes();
        res.setId(user.getId());
        res.setUsername(user.getUsername());
        res.setName(user.getName());
        res.setStatus(user.getStatus());


        return res;
    }

    public Object removeUser(String userId) {
        return null;
    }

    public Object updateUser(String userId, UserUpdateReq userUpdateReq) {
        return null;
    }

    public Object updateUser(String userId, UserUpdateReq userUpdateReq, BindingResult bindingResult) {
        Object errors = baseValidationService.handleFieldExcpetion(bindingResult);
        if (errors != null) {
            return errors;
        }
        return userUpdateReq;
    }

    public Object searchUser(String sort, Integer page, Integer size, UserSearchReq userSearchReq) {
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

    public Object getUserDetail(String userId) {
        UserDetailRes res = new UserDetailRes();
        res.setUsername("username");
        res.setName("name");
        res.setStatus("status");
        res.setNumberOfCourses(0);
        return res;
    }

    public Object getUserCourses(String userId, String courseId) {
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

    public Object getUserCourseLessons(String userId, String courseId, String lessonId) {
        UserCourseLessonRes res = new UserCourseLessonRes();
        res.setUserName("userName");
        res.setCourseName("courseName");
        res.setLessonName("lessonName");
        res.setUserCourseLessonStatus("userCourseLessonStatus");
        res.setLessonDescription("lessonDescription");
        res.setLessonUrl("lessonUrl");
        return res;
    }

    private List<CourseDetailRes> fetchUserCourses(String userId, UserCourseSearchReq searchReq, String sort, int page, int size) {
        // Implement the logic to fetch and filter courses from the database
        // This is a placeholder implementation
        return List.of(new CourseDetailRes());
    }


    public Object searchUserCourses(String sort, Integer page, Integer size, String userId, UserCourseSearchReq userCourseSearchReq) {
        // Logic to fetch and filter user courses based on searchReq, sort, page, and size
        List<CourseDetailRes> courses = fetchUserCourses(userId, userCourseSearchReq, sort, page, size);

        return UserCourseSearchRes.builder()
                .courses(courses)
                .page(page)
                .size(size)
                .sort(sort)
                .build();
    }

    public String registerCourse(String userId, String courseId) {
        return null;
    }

    public String rateCourse(String userId, String courseId, Integer rating) {
        return rating.toString();
    }

    public String reviewCourse(String userId, String courseId, String review) {
        return review;
    }
}