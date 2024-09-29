package src.controller;

import org.springframework.web.bind.annotation.*;
import src.constant.UrlConstant;

import src.dto.request.LessonsCreateReq;
import src.dto.request.LessonsUpdateReq;
import src.dto.request.LessonSearchReq;
import src.dto.response.LessonSearchRes;
import src.dto.response.LessonDetailRes;
import src.dto.request.UserLessonStatusUpdateReq;

@RestController
public class LessonController{

        @PostMapping(UrlConstant.LESSONS_CREATE)
        public Object createLesson(@PathVariable("course_id") String courseId,
                                    @PathVariable("chapter_id") String chapterId,
                                    @RequestBody LessonsCreateReq lessonsCreateReq) {
            return lessonsCreateReq;
        }

        @PutMapping(UrlConstant.LESSONS_UPDATE)
        public Object updateLesson(@PathVariable("course_id") String courseId,
                                    @PathVariable("chapter_id") String chapterId,
                                    @RequestBody LessonsUpdateReq lessonsUpdateReq) {
            return lessonsUpdateReq;
        }

        @DeleteMapping(UrlConstant.LESSONS_DELETE)
        public Object removeLesson(@PathVariable("course_id") String courseId,
                                    @PathVariable("chapter_id") String chapterId,
                                    @PathVariable("lesson_id") String lessonId) {
            return lessonId;
        }

        @GetMapping(UrlConstant.LESSONS_SEARCH)
        public Object searchLesson(
                @RequestParam("sort") String sort,
                @RequestParam("page") Integer page,
                @RequestParam("size") Integer size,
                @RequestBody LessonSearchReq lessonSearchReq
        ) {
            LessonSearchRes res = new LessonSearchRes();
            res.setPage(page);
            res.setSize(size);
            res.setSort(sort);
            res.setName(res.getName());
            res.setStatus(res.getStatus());
            res.setCourseId(res.getCourseId());
            res.setChapterId(res.getChapterId());
            res.setCreatedDateFrom(res.getCreatedDateFrom());
            res.setCreatedDateTo(res.getCreatedDateTo());
            res.setType(res.getType());
            return res;
        }

        @GetMapping(UrlConstant.LESSONS_DETAIL)
        public Object getLessonDetail(@PathVariable("course_id") String courseId,
                                      @PathVariable("chapter_id") String chapterId,
                                      @PathVariable("lesson_id") String lessonId) {
            LessonDetailRes res = new LessonDetailRes();
            res.setCourseName(res.getCourseName());
            res.setChapterName(res.getChapterName());
            res.setLessonName(res.getLessonName());
            res.setTeacherName(res.getTeacherName());
            res.setChapterOrder(res.getChapterOrder());
            res.setLessonOrder(res.getLessonOrder());
            res.setLessonDescription(res.getLessonDescription());
            res.setLessonType(res.getLessonType());
            res.setLessonUrl(res.getLessonUrl());
            res.setStatus(res.getStatus());
            res.setNumberOfStudentsCompleted(res.getNumberOfStudentsCompleted());
            res.setNumberOfStudentsInProgress(res.getNumberOfStudentsInProgress());
            return res;
        }

        @PutMapping(UrlConstant.USER_COURSE_LESSONS_UPDATE_STATUS)
        public Object updateLessonStatus(@PathVariable("course_id") String courseId,
                                         @PathVariable("chapter_id") String chapterId,
                                         @PathVariable("lesson_id") String lessonId,
                                         @RequestBody UserLessonStatusUpdateReq userLessonStatusUpdateReq) {
            return userLessonStatusUpdateReq;
        }


}