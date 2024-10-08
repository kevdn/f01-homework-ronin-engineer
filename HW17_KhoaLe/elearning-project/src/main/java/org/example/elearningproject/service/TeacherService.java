package org.example.elearningproject.service;

import org.springframework.stereotype.Service;
import org.example.elearningproject.dto.request.TeacherUpdateReq;
import org.example.elearningproject.dto.request.TeacherSearchReq;

@Service
public interface TeacherService {

    Object updateTeacher(String teacherId, TeacherUpdateReq teacherUpdateReq);

    Object removeTeacher(String teacherId);

    Object searchTeacher(String sort, Integer page, Integer size, TeacherSearchReq teacherSearchReq);

    Object getTeacherDetail(String teacherId);
}
