package org.example.elearningproject.repository;


import org.example.elearningproject.entity.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChapterRepository extends JpaRepository<Chapter, Integer> {
    Chapter findByName(String name);
}
