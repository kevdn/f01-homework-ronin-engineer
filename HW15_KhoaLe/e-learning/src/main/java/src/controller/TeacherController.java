package src.controller;

import org.springframework.web.bind.annotation.*;
import src.constant.UrlConstant;
import src.dto.request.TeacherUpdateReq;
import src.dto.request.TeacherSearchReq;
import src.dto.response.TeacherSearchRes;
import src.dto.response.TeacherDetailRes;

@RestController
public class TeacherController {

        @PutMapping(UrlConstant.TEACHER_UPDATE)
        public Object updateTeacher(@PathVariable("teacher_id") String teacherId,
                                    @RequestBody TeacherUpdateReq teacherUpdateReq) {
            return teacherUpdateReq;
        }

        @DeleteMapping(UrlConstant.TEACHER_DELETE)
        public Object removeTeacher(@PathVariable("teacher_id") String teacherId) {
            return teacherId;
        }

        @GetMapping(UrlConstant.TEACHER_SEARCH)
        public Object searchTeacher(
                @RequestParam("sort") String sort,
                @RequestParam("page") Integer page,
                @RequestParam("size") Integer size,
                @RequestBody TeacherSearchReq teacherSearchReq
        ) {
            TeacherSearchRes res = new TeacherSearchRes();
            res.setPage(page);
            res.setSize(size);
            res.setSort(sort);
            res.setName(res.getName());
            res.setStatus(res.getStatus());
            res.setCreatedDateFrom(res.getCreatedDateFrom());
            res.setCreatedDateTo(res.getCreatedDateTo());
            res.setUsername(res.getUsername());
            return res;
        }

        @GetMapping(UrlConstant.TEACHER_DETAIL)
        public Object getTeacherDetail(@PathVariable("teacher_id") String teacherId)
        {
            TeacherDetailRes res = new TeacherDetailRes();
            res.setTeacherName("teacherName");
            res.setStatus("status");
            res.setNumberOfCoursesTeaching(0);
            return res;
        }
}
