package org.example.elearningproject.repository;

import org.example.elearningproject.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

    Teacher findByUsername(String username);

    Teacher findByUsernameAndStatus(String username, String status);
}
