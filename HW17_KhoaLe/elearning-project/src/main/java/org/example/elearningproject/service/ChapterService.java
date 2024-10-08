package org.example.elearningproject.service;

import org.springframework.stereotype.Service;
import org.example.elearningproject.dto.request.ChaptersCreateReq;
import org.example.elearningproject.dto.request.ChaptersUpdateReq;
import org.example.elearningproject.dto.request.ChapterSearchReq;

@Service
public interface ChapterService {

        Object createChapter(String courseId, ChaptersCreateReq chaptersCreateReq);

        Object updateChapter(String courseId, ChaptersUpdateReq chaptersUpdateReq);

        Object removeChapter(String courseId, String chapterId);

        Object searchChapter(String sort, Integer page, Integer size, String courseId, ChapterSearchReq chapterSearchReq);

        Object getChapterDetail(String courseId, String chapterId);
}
