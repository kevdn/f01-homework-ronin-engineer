package org.example.elearningproject.entity.compositeID;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Embeddable
public class StudentCourseLessonId implements Serializable {
    private Long userCourseUserId;
    private Long userCourseCourseId;
    private Long lessonId;
}