package org.example.elearningproject.constant;

public class UrlConstant {

    private UrlConstant() {}

    public static final String API_V1 = "/api/v1";

    public static final String ADMIN_LOGIN = "/admins/login";

    public static final String ADMIN_USER_DELETE = "/admins/users/{user_id}";

    public static final String USER_LOGIN = "/users/login";

    public static final String USER_LOGOUT = "/users/logout";

    public static final String USER_REGISTER = "/users/register";

    public static final String USER_UPDATE = "/users/{user_id}";

    public static final String USER_DELETE = "/users/{user_id}";

    public static final String USER_SEARCH = "/users/search";

    public static final String USER_DETAIL = "/users/{user_id}"; //user info and number of courses

    public static final String USER_COURSES = "/admins/users/{user_id}/user-courses/{course_id}";

    //search courses user registered
    public static final String USER_COURSES_SEARCH = "/users/{user_id}/user-courses/search";

    public static final String USER_COURSE_LESSONS = "/admins/users/{user_id}/courses/{course_id}/lessons/{lesson_id}";

    public static final String USER_COURSE_LESSONS_UPDATE_STATUS = "/users/{user_id}/courses/{course_id}/chapters/{chapter_id}/lessons/{lesson_id}";

    public static final String TEACHER_UPDATE = "/teachers/{teacher_id}";

    public static final String TEACHER_DELETE = "/teachers/{teacher_id}";

    public static final String TEACHER_SEARCH = "/teachers/search";

    public static final String TEACHER_DETAIL = "/teachers/{teacher_id}"; //teacher info and number of courses teaching

    public static final String COURSE_CREATE = "/courses";

    public static final String COURSE_SEARCH = "/courses/search";

    public static final String COURSE_UPDATE = "/courses/{course_id}";

    //admin checkin course detail
    public static final String COURSE_DETAIL = "/courses/{course_id}";

    public static final String COURSE_DELETE = "/courses/{course_id}";

    public static final String COURSE_REGISTER = "/users/{user_id}/courses/{course_id}/register";

    public static final String COURSE_RATING = "/users/{user_id}/courses/{course_id}/rating";

    public static final String COURSE_REVIEW = "/users/{user_id}/courses/{course_id}/review";

    public static final String CHAPTERS_CREATE = "/courses/{course_id}/chapters";

    public static final String CHAPTERS_SEARCH = "/courses/{course_id}/chapters/search";

    public static final String CHAPTERS_DETAIL = "/courses/{course_id}/chapters/{chapter_id}";

    public static final String CHAPTERS_UPDATE = "/courses/{course_id}/chapters";

    public static final String CHAPTERS_DELETE = "/courses/{course_id}/chapters/{chapter_id}";

    public static final String LESSONS_CREATE = "/courses/{course_id}/chapters/{chapter_id}/lessons";

    public static final String LESSONS_SEARCH = "/courses/{course_id}/chapters/{chapter_id}/lessons/search";

    public static final String LESSONS_DETAIL = "/courses/{course_id}/chapters/{chapter_id}/lessons/{lesson_id}";

    public static final String LESSONS_UPDATE = "/courses/{course_id}/chapters/{chapter_id}/lessons";

    public static final String LESSONS_DELETE = "/courses/{course_id}/chapters/{chapter_id}/lessons/{lesson_id}";


}
