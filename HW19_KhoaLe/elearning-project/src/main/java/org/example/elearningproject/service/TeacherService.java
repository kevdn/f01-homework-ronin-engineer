package org.example.elearningproject.service;

import org.springframework.stereotype.Service;
import org.example.elearningproject.dto.request.TeacherUpdateReq;
import org.example.elearningproject.dto.request.TeacherSearchReq;
import org.springframework.validation.BindingResult;

@Service
public interface TeacherService {

    Object updateTeacher(String teacherId, TeacherUpdateReq teacherUpdateReq);

    Object updateTeacher(String teacherId, TeacherUpdateReq teacherUpdateReq, BindingResult bindingResult);

    Object removeTeacher(String teacherId);

    Object searchTeacher(String sort, Integer page, Integer size, TeacherSearchReq teacherSearchReq);

    Object getTeacherDetail(String teacherId);
}
