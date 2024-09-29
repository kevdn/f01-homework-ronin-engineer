package src.controller;

import org.springframework.web.bind.annotation.*;
import src.constant.UrlConstant;
import src.dto.request.ChaptersCreateReq;
import src.dto.request.ChapterSearchReq;
import src.dto.response.ChapterSearchRes;
import src.dto.response.ChapterDetailRes;

@RestController
public class ChapterController {

    @PostMapping(UrlConstant.CHAPTERS_CREATE)
    public String addChapters(@PathVariable("course_id") String courseId,
                                @RequestBody ChaptersCreateReq chaptersCreateReq) {
            return courseId;

    }

    @PutMapping(UrlConstant.CHAPTERS_UPDATE)
    public String updateChapters(@PathVariable("course_id") String courseId,
                                @RequestBody ChaptersCreateReq chaptersCreateReq) {
            return courseId;
    }

    @DeleteMapping(UrlConstant.CHAPTERS_DELETE)
    public String removeChapters(@PathVariable("course_id") String courseId,
                                @PathVariable("chapter_id") String chapterId) {
            return courseId + chapterId;
    }

    @GetMapping(UrlConstant.CHAPTERS_SEARCH)
    public Object searchChapters(
            @RequestParam("sort") String sort,
            @RequestParam("page") Integer page,
            @RequestParam("size") Integer size,
            @RequestBody ChapterSearchReq chapterSearchReq
    ) {
        ChapterSearchRes res = new ChapterSearchRes();
        res.setPage(page);
        res.setSize(size);
        res.setSort(sort);
        res.setName(res.getName());
        res.setStatus(res.getStatus());
        res.setCourseId(res.getCourseId());
        res.setCreatedDateFrom(res.getCreatedDateFrom());
        res.setCreatedDateTo(res.getCreatedDateTo());
        return res;
    }

    @GetMapping(UrlConstant.CHAPTERS_DETAIL)
    public ChapterDetailRes getChapterDetail(@PathVariable("course_id") String courseId,
                                            @PathVariable("chapter_id") String chapterId) {
        ChapterDetailRes res = new ChapterDetailRes();
        res.setCourseName("courseName");
        res.setChapterName("chapterName");
        res.setChapterOrder(1);
        res.setNumberOfLessons(1);
        return res;
    }
}
