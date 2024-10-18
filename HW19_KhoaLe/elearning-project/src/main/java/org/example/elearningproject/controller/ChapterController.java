package org.example.elearningproject.controller;

import jakarta.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.example.elearningproject.constant.UrlConstant;
import org.example.elearningproject.dto.request.ChaptersCreateReq;
import org.example.elearningproject.dto.request.ChapterSearchReq;
import org.example.elearningproject.dto.response.ChapterDetailRes;
import org.example.elearningproject.dto.request.ChaptersUpdateReq;

import org.springframework.beans.factory.annotation.Qualifier;
import org.example.elearningproject.service.ChapterService;


@RestController
@RequestMapping(UrlConstant.API_V1)
public class ChapterController {

    @Autowired
    @Qualifier("chapterServiceImpl")
    private ChapterService chapterService;

    @PostMapping(UrlConstant.CHAPTERS_CREATE)
    public Object addChapters(@PathVariable("course_id") String courseId,
                              @RequestBody ChaptersCreateReq chaptersCreateReq,
                              BindingResult bindingResult) {
        return chapterService.createChapter(courseId, chaptersCreateReq, bindingResult);
    }

    @PutMapping(UrlConstant.CHAPTERS_UPDATE)
    public Object updateChapters(@PathVariable("course_id") String courseId,
                                 @RequestBody  ChaptersUpdateReq chaptersUpdateReq,
                                 BindingResult bindingResult) {
        return chapterService.updateChapter(courseId, chaptersUpdateReq, bindingResult);
    }

    @DeleteMapping(UrlConstant.CHAPTERS_DELETE)
    public Object removeChapters(@PathVariable("course_id") @NotBlank String courseId,
                                @PathVariable("chapter_id") @NotBlank String chapterId) {
        return chapterService.removeChapter(courseId, chapterId);
    }

    @GetMapping(UrlConstant.CHAPTERS_SEARCH)
    public Object searchChapters(
            @RequestParam("sort") String sort,
            @RequestParam("page") Integer page,
            @RequestParam("size") Integer size,
            @PathVariable("course_id") String courseId,
            @RequestBody ChapterSearchReq chapterSearchReq
    ) {
        return chapterService.searchChapter(sort, page, size, courseId, chapterSearchReq);
    }

    @GetMapping(UrlConstant.CHAPTERS_DETAIL)
    public ChapterDetailRes getChapterDetail(@PathVariable("course_id") @NotBlank String courseId,
                                            @PathVariable("chapter_id") @NotBlank String chapterId) {
        return (ChapterDetailRes) chapterService.getChapterDetail(courseId, chapterId);
    }
}
