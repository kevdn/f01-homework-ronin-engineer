package org.example.elearningproject.service;

import org.example.elearningproject.dto.request.*;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

@Service
public interface UserService {

    Object login(UserLoginReq userLoginReq);

    Object login(UserLoginReq userLoginReq, BindingResult result);

    Object registerUser(UserRegisterReq userRegisterReq);

    Object registerUser(UserRegisterReq userRegisterReq, BindingResult bindingResult);

    Object updateUser(String userId, UserUpdateReq userUpdateReq);

    Object updateUser(String userId, UserUpdateReq userUpdateReq, BindingResult bindingResult);

    Object removeUser(String userId);

    Object searchUser(String sort, Integer page, Integer size, UserSearchReq userSearchReq);

    Object getUserDetail(String userId);

    Object getUserCourses(String userId, String courseId);

    Object getUserCourseLessons(String userId, String courseId, String lessonId);

    Object searchUserCourses(String sort, Integer page, Integer size,
                             String userId,
                             UserCourseSearchReq userCourseSearchReq);

    String registerCourse(String userId, String courseId);

    String rateCourse(String userId, String courseId, Integer rating);

    String reviewCourse(String userId, String courseId, String review);

}
