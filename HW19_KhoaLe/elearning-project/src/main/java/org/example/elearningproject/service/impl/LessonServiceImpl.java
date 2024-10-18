package org.example.elearningproject.service.impl;

import org.example.elearningproject.service.validator.BaseValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.elearningproject.dto.response.LessonDetailRes;
import org.example.elearningproject.dto.response.LessonSearchRes;
import org.example.elearningproject.service.LessonService;
import org.example.elearningproject.dto.request.LessonsCreateReq;
import org.example.elearningproject.dto.request.LessonsUpdateReq;
import org.example.elearningproject.dto.request.LessonSearchReq;
import org.springframework.validation.BindingResult;

@Service
public class LessonServiceImpl implements LessonService {

    @Autowired
    private BaseValidationService baseValidationService;

    public Object createLesson(String courseId, String chapterId, LessonsCreateReq lessonsCreateReq) {
        return lessonsCreateReq;
    }

    public Object createLesson(String courseId, String chapterId,
                               LessonsCreateReq lessonsCreateReq,
                               BindingResult bindingResult) {
        Object errors = baseValidationService.handleFieldExcpetion(bindingResult);
        if (errors != null) {
            return errors;
        }
        return lessonsCreateReq;
    }

    public Object updateLesson(String courseId, String chapterId, LessonsUpdateReq lessonsUpdateReq) {
        return lessonsUpdateReq;
    }

    public Object removeLesson(String courseId, String chapterId, String lessonId) {
        return lessonId;
    }

    public Object searchLesson(String sort, Integer page, Integer size,
                                 String courseId, String chapterId,
                               LessonSearchReq lessonSearchReq) {
        LessonSearchRes res = new LessonSearchRes();
        res.setPage(page);
        res.setSize(size);
        res.setSort(sort);
        res.setName(res.getName());
        res.setStatus(res.getStatus());
        res.setCourseId(courseId);
        res.setChapterId(chapterId);
        res.setCreatedDateFrom(res.getCreatedDateFrom());
        res.setCreatedDateTo(res.getCreatedDateTo());
        res.setType(res.getType());
        return res;
    }

    public Object getLessonDetail(String courseId, String chapterId, String lessonId) {
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





}