package org.example.elearningproject.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
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
public class UserSearchReq {

    @Size(min = 1, max = 50, message = "Username length must be between 1 and 50")
    private String username;

    @Size(min = 1, max = 255, message = "Name length must be between 1 and 255")
    private String name;

    private String status;

    @PastOrPresent
    private String createdDateFrom;

    @PastOrPresent
    private String createdDateTo;

}
