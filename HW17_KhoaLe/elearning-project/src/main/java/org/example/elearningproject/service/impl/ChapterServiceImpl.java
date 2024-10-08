package org.example.elearningproject.service.impl;

import org.springframework.stereotype.Service;
import org.example.elearningproject.dto.response.ChapterDetailRes;
import org.example.elearningproject.dto.response.ChapterSearchRes;
import org.example.elearningproject.service.ChapterService;
import org.example.elearningproject.dto.request.ChaptersCreateReq;
import org.example.elearningproject.dto.request.ChaptersUpdateReq;
import org.example.elearningproject.dto.request.ChapterSearchReq;

@Service
public class ChapterServiceImpl implements ChapterService {

    public Object createChapter(String courseId, ChaptersCreateReq chaptersCreateReq) {
        return chaptersCreateReq;
    }

    public Object updateChapter(String courseId, ChaptersUpdateReq chaptersUpdateReq) {
        return chaptersUpdateReq;
    }

    public Object removeChapter(String courseId, String chapterId) {
        return chapterId;
    }

    public Object searchChapter(String sort, Integer page, Integer size, String courseId,  ChapterSearchReq chapterSearchReq) {
        ChapterSearchRes res = new ChapterSearchRes();
        res.setPage(page);
        res.setSize(size);
        res.setSort(sort);
        res.setName(res.getName());
        res.setStatus(res.getStatus());
        res.setCourseId(courseId);
        res.setCreatedDateFrom(res.getCreatedDateFrom());
        res.setCreatedDateTo(res.getCreatedDateTo());
        return res;
    }

    public Object getChapterDetail(String courseId, String chapterId) {
        ChapterDetailRes res = new ChapterDetailRes();
        res.setCourseName("courseName");
        res.setChapterName("chapterName");
        res.setChapterOrder(1);
        res.setNumberOfLessons(1);
        return res;
    }

}
