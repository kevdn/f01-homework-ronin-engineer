package org.example.elearningproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import org.example.elearningproject.constant.UrlConstant;

import org.example.elearningproject.dto.request.LessonsCreateReq;
import org.example.elearningproject.dto.request.LessonsUpdateReq;
import org.example.elearningproject.dto.request.LessonSearchReq;
import org.example.elearningproject.dto.request.UserLessonStatusUpdateReq;
import org.example.elearningproject.service.LessonService;

@RestController
public class LessonController{

        @Autowired
        @Qualifier("lessonServiceImpl")
        private LessonService lessonService;

        @PostMapping(UrlConstant.LESSONS_CREATE)
        public Object createLesson(@PathVariable("course_id") String courseId,
                                    @PathVariable("chapter_id") String chapterId,
                                    @RequestBody LessonsCreateReq lessonsCreateReq) {
            return lessonService.createLesson(courseId, chapterId, lessonsCreateReq);
        }

        @PutMapping(UrlConstant.LESSONS_UPDATE)
        public Object updateLesson(@PathVariable("course_id") String courseId,
                                    @PathVariable("chapter_id") String chapterId,
                                    @RequestBody LessonsUpdateReq lessonsUpdateReq) {
            return lessonService.updateLesson(courseId, chapterId, lessonsUpdateReq);
        }

        @DeleteMapping(UrlConstant.LESSONS_DELETE)
        public Object removeLesson(@PathVariable("course_id") String courseId,
                                    @PathVariable("chapter_id") String chapterId,
                                    @PathVariable("lesson_id") String lessonId) {
            return lessonService.removeLesson(courseId, chapterId, lessonId);
        }

        @GetMapping(UrlConstant.LESSONS_SEARCH)
        public Object searchLesson(
                @RequestParam("sort") String sort,
                @RequestParam("page") Integer page,
                @RequestParam("size") Integer size,
                @PathVariable("course_id") String courseId,
                @PathVariable("chapter_id") String chapterId,
                @RequestBody LessonSearchReq lessonSearchReq
        ) {
            return lessonService.searchLesson(sort, page, size, courseId, chapterId, lessonSearchReq);
        }

        @GetMapping(UrlConstant.LESSONS_DETAIL)
        public Object getLessonDetail(@PathVariable("course_id") String courseId,
                                      @PathVariable("chapter_id") String chapterId,
                                      @PathVariable("lesson_id") String lessonId) {
            return lessonService.getLessonDetail(courseId, chapterId, lessonId);

        }

        @PutMapping(UrlConstant.USER_COURSE_LESSONS_UPDATE_STATUS)
        public Object updateLessonStatus(@PathVariable("course_id") String courseId,
                                         @PathVariable("chapter_id") String chapterId,
                                         @PathVariable("lesson_id") String lessonId,
                                         @PathVariable("user_id") String userId,
                                         @RequestBody UserLessonStatusUpdateReq userLessonStatusUpdateReq) {
            return userLessonStatusUpdateReq;
        }


}