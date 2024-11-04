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
public class UserCourseId implements Serializable {
    private int userId;
    private int courseId;
}
