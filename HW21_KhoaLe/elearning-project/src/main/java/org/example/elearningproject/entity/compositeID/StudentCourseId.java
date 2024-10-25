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
public class StudentCourseId implements Serializable {
    private int studentId;
    private int courseId;
}
