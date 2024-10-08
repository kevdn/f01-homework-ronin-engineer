package org.example.elearningproject.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.example.elearningproject.service.TeacherService;
import org.example.elearningproject.service.validator.TeacherValidatorService;
import org.example.elearningproject.dto.request.TeacherUpdateReq;
import org.example.elearningproject.dto.request.TeacherSearchReq;
import org.example.elearningproject.dto.response.TeacherSearchRes;
import org.example.elearningproject.dto.response.TeacherDetailRes;



@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherValidatorService teacherValidatorService;

    public Object updateTeacher(String teacherId, TeacherUpdateReq teacherUpdateReq) {
        return teacherUpdateReq;
    }

    public Object removeTeacher(String teacherId) {
        return teacherId;
    }

    public Object searchTeacher(String sort, Integer page, Integer size, TeacherSearchReq teacherSearchReq) {
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

    public Object getTeacherDetail(String teacherId) {
        TeacherDetailRes res = new TeacherDetailRes();
        res.setTeacherName("teacherName");
        res.setStatus("status");
        res.setNumberOfCoursesTeaching(0);
        return res;
    }

}
