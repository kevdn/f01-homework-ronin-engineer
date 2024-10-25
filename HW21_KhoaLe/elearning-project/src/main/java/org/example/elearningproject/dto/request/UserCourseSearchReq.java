package org.example.elearningproject.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UserCourseSearchReq {

    @Size(min = 1, max = 50, message = "Name length must be between 1 and 50")
    private String name;

    @PastOrPresent
    private LocalDate createdDateFrom;

    @PastOrPresent
    private LocalDate createdDateTo;

    @Size(min = 1, max = 50, message = "Teacher name length must be between 1 and 50")
    private String teacherName;

    @Min(0)
    @Max(10)
    private Double ratingFrom;

    @Min(0)
    @Max(10)
    private Double ratingTo;

    private String status;

    @PositiveOrZero
    private Integer lessonCount;
}