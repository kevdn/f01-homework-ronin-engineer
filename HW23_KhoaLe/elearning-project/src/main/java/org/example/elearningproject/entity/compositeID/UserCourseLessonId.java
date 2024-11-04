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
public class UserCourseLessonId implements Serializable {
    private int userCourseUserId;
    private int userCourseCourseId;
    private int lessonId;
}