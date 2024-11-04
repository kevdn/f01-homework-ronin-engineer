package org.example.elearningproject.repository;

import org.example.elearningproject.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Integer> {
    Lesson findByName(String name);
}
