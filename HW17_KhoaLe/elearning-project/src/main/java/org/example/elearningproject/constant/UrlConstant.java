package org.example.elearningproject.constant;

public class UrlConstant {

    private UrlConstant() {}

    public static final String ADMIN_LOGIN = "/admin-service/api/v1/login";

    public static final String ADMIN_USER_DELETE = "/admin-service/api/v1/users/{user_id}";

    public static final String USER_LOGIN = "/user-service/api/v1/users/login";

    public static final String USER_LOGOUT = "/user-service/api/v1/users/logout";

    public static final String USER_REGISTER = "/user-service/api/v1/users/register";

    public static final String USER_UPDATE = "/user-service/api/v1/users/{user_id}";

    public static final String USER_DELETE = "/user-service/api/v1/users/{user_id}";

    public static final String USER_SEARCH = "/user-service/api/v1/users/search";

    public static final String USER_DETAIL = "/user-service/api/v1/users/{user_id}"; //user info and number of courses

    public static final String USER_COURSES = "/admin-service/api/v1/users/{user_id}/user-courses/{course_id}";

    //search courses user registered
    public static final String USER_COURSES_SEARCH = "/user-service/api/v1/users/{user_id}/user-courses/search";

    public static final String USER_COURSE_LESSONS = "/admin-service/api/v1/users/{user_id}/courses/{course_id}/lessons/{lesson_id}";

    public static final String USER_COURSE_LESSONS_UPDATE_STATUS = "/user-service/api/v1/users/{user_id}/courses/{course_id}/chapters/{chapter_id}/lessons/{lesson_id}";

    public static final String TEACHER_UPDATE = "/teacher-service/api/v1/teachers/{teacher_id}";

    public static final String TEACHER_DELETE = "/teacher-service/api/v1/teachers/{teacher_id}";

    public static final String TEACHER_SEARCH = "/teacher-service/api/v1/teachers/search";

    public static final String TEACHER_DETAIL = "/teacher-service/api/v1/teachers/{teacher_id}"; //teacher info and number of courses teaching

    public static final String COURSE_CREATE = "/course-service/api/v1/courses";

    public static final String COURSE_SEARCH = "/course-service/api/v1/courses/search";

    public static final String COURSE_UPDATE = "/course-service/api/v1/courses/{course_id}";

    //admin checkin course detail
    public static final String COURSE_DETAIL = "/course-service/api/v1/courses/{course_id}";

    public static final String COURSE_DELETE = "/course-service/api/v1/courses/{course_id}";

    public static final String COURSE_REGISTER = "/user-service/api/v1/users/{user_id}/courses/{course_id}/register";

    public static final String COURSE_RATING = "/user-service/api/v1/users/{user_id}/courses/{course_id}/rating";

    public static final String COURSE_REVIEW = "/user-service/api/v1/users/{user_id}/courses/{course_id}/review";

    public static final String CHAPTERS_CREATE = "/chapter-service/api/v1/courses/{course_id}/chapters";

    public static final String CHAPTERS_SEARCH = "/chapter-service/api/v1/courses/{course_id}/chapters/search";

    public static final String CHAPTERS_DETAIL = "/chapter-service/api/v1/courses/{course_id}/chapters/{chapter_id}";

    public static final String CHAPTERS_UPDATE = "/chapter-service/api/v1/courses/{course_id}/chapters";

    public static final String CHAPTERS_DELETE = "/chapter-service/api/v1/courses/{course_id}/chapters/{chapter_id}";

    public static final String LESSONS_CREATE = "/lesson-service/api/v1/courses/{course_id}/chapters/{chapter_id}/lessons";

    public static final String LESSONS_SEARCH = "/lesson-service/api/v1/courses/{course_id}/chapters/{chapter_id}/lessons/search";

    public static final String LESSONS_DETAIL = "/lesson-service/api/v1/courses/{course_id}/chapters/{chapter_id}/lessons/{lesson_id}";

    public static final String LESSONS_UPDATE = "/lesson-service/api/v1/courses/{course_id}/chapters/{chapter_id}/lessons";

    public static final String LESSONS_DELETE = "/lesson-service/api/v1/courses/{course_id}/chapters/{chapter_id}/lessons/{lesson_id}";


}
