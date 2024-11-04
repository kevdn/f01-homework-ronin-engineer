package org.example.elearningproject.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.example.elearningproject.constant.UrlConstant;
import org.example.elearningproject.dto.request.TeacherUpdateReq;
import org.example.elearningproject.dto.request.TeacherSearchReq;
import org.example.elearningproject.service.TeacherService;

@RestController
@RequestMapping(UrlConstant.API_V1)
public class TeacherController {

        @Autowired
        @Qualifier("teacherServiceImpl")
        private TeacherService teacherService;


        @PutMapping(UrlConstant.TEACHER_UPDATE)
        public Object updateTeacher(@PathVariable("teacher_id") String teacherId,
                                    @RequestBody TeacherUpdateReq teacherUpdateReq) {
            return teacherService.updateTeacher(teacherId, teacherUpdateReq);
        }

        @DeleteMapping(UrlConstant.TEACHER_DELETE)
        public Object removeTeacher(@PathVariable("teacher_id") String teacherId) {
            return teacherService.removeTeacher(teacherId);
        }

        @GetMapping(UrlConstant.TEACHER_SEARCH)
        public Object searchTeacher(
                @RequestParam("sort") String sort,
                @RequestParam("page") Integer page,
                @RequestParam("size") Integer size,
                @Valid @RequestBody TeacherSearchReq teacherSearchReq
        ) {
            return teacherService.searchTeacher(sort, page, size, teacherSearchReq);
        }

        @GetMapping(UrlConstant.TEACHER_DETAIL)
        public Object getTeacherDetail(@PathVariable("teacher_id") String teacherId)
        {
            return teacherService.getTeacherDetail(teacherId);
        }
}
