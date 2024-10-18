package org.example.elearningproject.config;

import org.example.elearningproject.service.validator.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public AdminValidatorService adminValidatorService() {
        return new AdminValidatorService();
    }

    @Bean
    public UserValidatorService userValidatorService() {
        return new UserValidatorService();
    }

    @Bean
    public CourseValidationService courseValidationService() {
        return new CourseValidationService();
    }

    @Bean
    public ChapterValidationService chapterValidationService() {
        return new ChapterValidationService();
    }

    @Bean
    public LessonValidationService lessonValidationService() {
        return new LessonValidationService();
    }

    @Bean
    public TeacherValidatorService teacherValidatorService() {
        return new TeacherValidatorService();
    }

}
