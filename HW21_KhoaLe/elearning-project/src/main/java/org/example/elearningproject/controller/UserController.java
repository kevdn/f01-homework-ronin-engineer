package org.example.elearningproject.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import org.example.elearningproject.dto.request.*;
import org.example.elearningproject.exception.AppException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import org.example.elearningproject.constant.UrlConstant;
import org.example.elearningproject.service.UserService;
import org.springframework.validation.BindingResult;


@RestController
@RequestMapping(UrlConstant.API_V1)
public class UserController {

    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    @PostMapping(UrlConstant.USER_LOGIN)
    public Object login(@RequestBody UserLoginReq userLoginReq, BindingResult result) {
        //throw new AppException("User login failed");
        return userService.login(userLoginReq, result);
    }


    @DeleteMapping(UrlConstant.USER_DELETE)
    public Object removeUser(@PathVariable("user_id") @NotBlank String userId) {
        return userService.removeUser(userId);
    }


    @GetMapping(UrlConstant.USER_SEARCH)
    public Object searchUser(
            @RequestParam("sort") String sort,
            @RequestParam("page") Integer page,
            @RequestParam("size") Integer size,
            @RequestBody UserSearchReq userSearchReq
    ) {
        return userService.searchUser(sort, page, size, userSearchReq);
    }

    @GetMapping(UrlConstant.USER_DETAIL)
    public Object getUserDetail(@PathVariable("user_id") @NotBlank String userId)
    {
        return userService.getUserDetail(userId);
    }

    @GetMapping(UrlConstant.USER_COURSES)
    public Object getUserCourses(@PathVariable("user_id") @NotBlank  String userId,
                                 @PathVariable("course_id") @NotBlank  String courseId)
    {
        return userService.getUserCourses(userId, courseId);
    }

    @GetMapping(UrlConstant.USER_COURSE_LESSONS)
    public Object getUserCourseLessons(@PathVariable("user_id") @NotBlank  String userId,
                                       @PathVariable("course_id") @NotBlank  String courseId,
                                       @PathVariable("lesson_id") @NotBlank  String lessonId)
    {
        return userService.getUserCourseLessons(userId, courseId, lessonId);
    }

    @PostMapping(UrlConstant.USER_REGISTER)
    public Object register(@RequestBody UserRegisterReq userRegisterReq,
                           BindingResult bindingResult) {
        return userService.registerUser(userRegisterReq, bindingResult);
    }

    @PutMapping(UrlConstant.USER_UPDATE)
    public Object updateUser(@PathVariable("user_id") String userId,
                             @RequestBody UserUpdateReq userUpdateReq,
                             BindingResult bindingResult) {
        return userService.updateUser(userId, userUpdateReq, bindingResult);
    }

    @GetMapping(UrlConstant.USER_COURSES_SEARCH)
    public Object searchUserCourses(
            @RequestParam(value = "sort", defaultValue = "createdDate,desc") String sort,
            @RequestParam(value = "page", defaultValue = "0") int page,
            @RequestParam(value = "size", defaultValue = "10") int size,
            @PathVariable("user_id") String userId,
            @Valid @RequestBody UserCourseSearchReq searchReq) {
        return userService.searchUserCourses(sort, page, size, userId, searchReq);

    }


    @PostMapping(UrlConstant.COURSE_REGISTER)
    public Object registerCourse(@PathVariable("user_id") @NotBlank  String userId,
                                 @PathVariable("course_id") @NotBlank  String courseId)
    {
        return userService.registerCourse(userId, courseId);
    }

    @PostMapping(UrlConstant.COURSE_RATING)
    public Object rateCourse(@PathVariable("user_id") @NotBlank String userId,
                             @PathVariable("course_id") @NotBlank String courseId,
                             @RequestBody int rating) {
        return userService.rateCourse(userId, courseId, rating);
    }

    @PostMapping(UrlConstant.COURSE_REVIEW)
    public Object reviewCourse(@PathVariable("user_id") @NotBlank String userId,
                               @PathVariable("course_id") @NotBlank String courseId,
                               @RequestBody String review) {
        return userService.reviewCourse(userId, courseId, review);
    }

}
