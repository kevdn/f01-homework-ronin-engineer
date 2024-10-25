package org.example.elearningproject.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;
import org.example.elearningproject.entity.compositeID.StudentCourseLessonId;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Entity
@Table(name = "student_course_lesson")
public class StudentCourseLesson {

    @EmbeddedId
    private StudentCourseLessonId id;

    @Column(name = "status", nullable = false, length = 50)
    private String status;

    @Column(name = "created_date", nullable = false, updatable = false)
    private Date createdDate;

    @Column(name = "updated_date")
    private Date updatedDate;

    @ManyToOne
    @MapsId("userCourseUserId")
    @JoinColumns({
            @JoinColumn(name = "user_course_user_id", referencedColumnName = "student_id"),
            @JoinColumn(name = "user_course_course_id", referencedColumnName = "course_id")
    })
    private StudentCourse studentCourse;

    @ManyToOne
    @MapsId("lessonId")
    @JoinColumn(name = "lesson_id")
    private Lesson lesson;
}