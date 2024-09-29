package src.constant;

public class UrlConstant {

    private UrlConstant() {}

    public static final String USER_LOGIN = "/api/v1/users/login";

    public static final String USER_REGISTER = "/api/v1/users/register";

    public static final String USER_UPDATE = "/api/v1/users/{user_id}";

    public static final String USER_DELETE = "/api/v1/users/{user_id}";

    public static final String USER_SEARCH = "/api/v1/users/search";

    public static final String USER_DETAIL = "/api/v1/users/{user_id}";

    public static final String USER_COURSES = "/api/v1/users/{user_id}/user-courses/{course_id}";

    public static final String USER_COURSES_SEARCH = "/api/v1/users/{user_id}/user-courses/search";

    public static final String USER_COURSE_LESSONS = "/api/v1/users/{user_id}/courses/{course_id}/lessons/{lesson_id}";

    public static final String USER_COURSE_LESSONS_UPDATE_STATUS = "/api/v1/users/{user_id}/courses/{course_id}/chapters/{chapter_id}/lessons/{lesson_id}";

    public static final String TEACHER_UPDATE = "/api/v1/teachers/{teacher_id}";

    public static final String TEACHER_DELETE = "/api/v1/teachers/{teacher_id}";

    public static final String TEACHER_SEARCH = "/api/v1/teachers/search";

    public static final String TEACHER_DETAIL = "/api/v1/teachers/{teacher_id}";

    public static final String COURSE_CREATE = "/api/v1/courses";

    public static final String COURSE_SEARCH = "/api/v1/courses/search";

    public static final String COURSE_UPDATE = "/api/v1/courses/{course_id}";

    public static final String COURSE_DETAIL = "/api/v1/courses/{course_id}";

    public static final String COURSE_DELETE = "/api/v1/courses/{course_id}";

    public static final String COURSE_REGISTER = "/api/v1/courses/{course_id}/register";

    public static final String COURSE_RATING = "/api/v1/courses/{course_id}/rating";

    public static final String COURSE_REVIEW = "/api/v1/courses/{course_id}/review";

    public static final String CHAPTERS_CREATE = "/api/v1/courses/{course_id}/chapters";

    public static final String CHAPTERS_SEARCH = "/api/v1/courses/{course_id}/chapters/search";

    public static final String CHAPTERS_DETAIL = "/api/v1/courses/{course_id}/chapters/{chapter_id}";

    public static final String CHAPTERS_UPDATE = "/api/v1/courses/{course_id}/chapters";

    public static final String CHAPTERS_DELETE = "/api/v1/courses/{course_id}/chapters/{chapter_id}";

    public static final String LESSONS_CREATE = "/api/v1/courses/{course_id}/chapters/{chapter_id}/lessons";

    public static final String LESSONS_SEARCH = "/api/v1/courses/{course_id}/chapters/{chapter_id}/lessons/search";

    public static final String LESSONS_DETAIL = "/api/v1/courses/{course_id}/chapters/{chapter_id}/lessons/{lesson_id}";

    public static final String LESSONS_UPDATE = "/api/v1/course/{course_id}/chapter/{chapter_id}/lessons";

    public static final String LESSONS_DELETE = "/api/v1/course/{course_id}/chapter/{chapter_id}/lessons/{lesson_id}";


}
