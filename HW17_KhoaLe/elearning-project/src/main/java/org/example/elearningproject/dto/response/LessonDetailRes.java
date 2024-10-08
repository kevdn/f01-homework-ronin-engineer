package org.example.elearningproject.dto.response;

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
public class LessonDetailRes {

    private String courseName;

    private String chapterName;

    private String lessonName;

    private String teacherName;

    private int chapterOrder;

    private int lessonOrder;

    private String lessonDescription;

    private String lessonType;

    private String lessonUrl;

    private String status;

    private int numberOfStudentsCompleted;

    private int numberOfStudentsInProgress;


}
