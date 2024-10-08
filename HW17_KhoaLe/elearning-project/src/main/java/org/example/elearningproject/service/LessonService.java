package org.example.elearningproject.service;

import org.springframework.stereotype.Service;
import org.example.elearningproject.dto.request.LessonsCreateReq;
import org.example.elearningproject.dto.request.LessonsUpdateReq;
import org.example.elearningproject.dto.request.LessonSearchReq;


@Service
public interface LessonService {

        Object createLesson(String courseId, String chapterId, LessonsCreateReq lessonsCreateReq);

        Object updateLesson(String courseId, String chapterId, LessonsUpdateReq lessonsUpdateReq);

        Object removeLesson(String courseId, String chapterId, String lessonId);

        Object searchLesson(String sort, Integer page, Integer size,
                                   String courseId, String chapterId,
                                   LessonSearchReq lessonSearchReq);

        Object getLessonDetail(String courseId, String chapterId, String lessonId);

}
