package src.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UserCourseDetailRes {
    private String userName;

    private String courseName;

    private String courseDescription;

    private String teacherName;

    private int rating;

    private String review;

    private String createdDate;

    private String updatedDate;

    private String status;

    private int numberOfLessonsInProgress;

    private int numberOfLessonsCompleted;

}
