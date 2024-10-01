use elearning;

-- 1. DANG NHAP

select id, username, password from admin where username = 'admin';
SELECT id, username, password FROM teacher where username = 'mr_anderson';
SELECT id, username, password FROM admin where username = 'johndoe';


-- 2. XOA TAI KHOAN (SOFT DELETE)

update admin set status = 'inactive' where username = 'admin';
update teacher set status = 'inactive' where username = 'mr_anderson';
update admin set status = 'inactive' where username = 'johndoe';

-- 3. CAP NHAT THONG TIN GIAO VIEN

update teacher set username = 'mr_smith' where username = 'mr_anderson';

-- 4. THEM KHOA HOC

insert into course (name, description, teacher_id)
values ('Math', 'Math course', 1);

-- 5. CAP NHAT KHOA HOC

update course set name = 'Mathematics' where name = 'Math';

-- 6. XOA KHOA HOC (SOFT DELETE)

update course set status = 'inactive' where name = 'Mathematics';

-- 7. CAP NHAT THONG TIN KHOA HOC

update course set description = 'Mathematics course' where name = 'Mathematics';

-- 8. THEM CHAPTER CHO KHOA HOC

INSERT INTO chapter (name, description, status, `order`, created_date, updated_date, course_id)
VALUES ('Chapter 1', 'Introduction to Java', 'active', 1, NOW(), NULL, 1);

-- 9. CAP NHAT CHAPTER

update chapter set name = 'Chapter 2' where name = 'Chapter 1';

-- 10. XOA CHAPTER (SOFT DELETE)

update chapter set status = 'inactive' where name = 'Chapter 2';

-- 11. THEM BAI HOC

INSERT INTO lesson (name, description, status, type, url, `order`, created_date, updated_date, chapter_id)
VALUES ('Lesson 1', 'Lesson 1', 'active', 'video', 'https://www.youtube.com/watch?v=Hl-zzrqQoSE', 1, NOW(), NULL, 1);

-- 12. CAP NHAT BAI HOC

update lesson set name = 'Lesson 2' where name = 'Lesson 1';

-- 13. XOA BAI HOC (SOFT DELETE)

update lesson set status = 'inactive' where name = 'Lesson 2';

-- Hiển thị danh sách, lọc theo các tiêu chí tìm kiếm dạng paging và sorting cho các entity. (Mặc định tìm 10 bản ghi mới nhất)

/* 14. Xem và tìm kiếm user
Theo username
Theo name
status
Theo ngày tạo (from, to)*/

SELECT *
FROM student
WHERE username LIKE '%a%'
   OR name LIKE '%a%'
   OR status = 'active'
   OR created_date BETWEEN '2021-01-01' AND '2021-12-31'
ORDER BY created_date DESC
    LIMIT 10;

/* 15. Xem và tìm kiếm giáo viên
Theo username
Theo name
Theo status
Theo ngày tạo (from, to) */

SELECT *
FROM teacher
WHERE username LIKE '%mr%'
   OR name LIKE '%mr%'
   OR status = 'active'
   OR created_date BETWEEN '2021-01-01' AND '2021-12-31'
ORDER BY created_date DESC
    LIMIT 10;

/* 16. Xem và tìm kiếm khóa học
Theo tên
Theo trạng thái
Theo name giáo viên dạy
Theo ngày tạo (from, to)
Theo rating (from, to): Tính trung bình rating rồi tìm kiếm */

SELECT c.*, t.name as teacher_name
FROM course c
         JOIN teacher t ON c.teacher_id = t.id
WHERE c.name LIKE '%Math%'
   OR c.status = 'active'
   OR t.name LIKE '%mr%'
   OR c.created_date BETWEEN '2021-01-01' AND '2021-12-31'
   OR (SELECT AVG(rating) FROM student_course WHERE course_id = c.id) BETWEEN 4 AND 5
ORDER BY c.created_date DESC
    LIMIT 10;

/* 17. Xem và tìm kiếm chapter
Theo tên
Theo trạng thái
Theo khóa học
Theo ngày tạo (from, to) */

SELECT ch.*, c.name as course_name
FROM chapter ch
         JOIN course c ON ch.course_id = c.id
WHERE ch.name LIKE '%Chapter%'
   OR ch.status = 'active'
   OR c.name LIKE '%Math%'
   OR ch.created_date BETWEEN '2021-01-01' AND '2021-12-31'
ORDER BY ch.created_date DESC
    LIMIT 10;

/* 18. Xem và tìm kiếm lesson
Theo tên
Theo trạng thái
Theo khóa học
Theo chapter
Theo type
Theo ngày tạo (from, to) */

SELECT l.*, c.name as course_name, ch.name as chapter_name
FROM lesson l
         JOIN chapter ch ON l.chapter_id = ch.id
         JOIN course c ON ch.course_id = c.id
WHERE l.name LIKE '%Lesson%'
   OR l.status = 'active'
   OR c.name LIKE '%Math%'
   OR ch.name LIKE '%Chapter%'
   OR l.type = 'VIDEO'
   OR l.created_date BETWEEN '2021-01-01' AND '2021-12-31'
ORDER BY l.created_date DESC;

-- ---- Hiển thị chi tiết thông tin các entity -------
-- 19. User: Hiển thị thông tin của user, số lượng khóa học user đã đăng ký
SELECT s.id, s.username, s.name,s.status, COUNT(sc.course_id) as course_count
FROM student s
         LEFT JOIN student_course sc ON s.id = sc.student_id
WHERE s.username = 'johndoe'
GROUP BY s.id;

-- 20. UserCourse: Hiển thị chi tiết thông tin user_course (bao gồm cả thông tin user và thông tin course) và số lượng bài học đang processing và số lượng bài học đã hoàn thành trong khóa học.
SELECT sc.student_id, s.username, c.name as course_name,
       COUNT(l.id) as lesson_count,
       SUM(CASE WHEN scl.status = 'in_progress' THEN 1 ELSE 0 END) as processing_count,
       SUM(CASE WHEN scl.status = 'completed' THEN 1 ELSE 0 END) as completed_count
FROM student_course sc
         JOIN student s ON sc.student_id = s.id
         JOIN course c ON sc.course_id = c.id
         JOIN chapter ch ON c.id = ch.course_id
         JOIN lesson l ON ch.id = l.chapter_id
         JOIN student_course_lesson scl ON l.id = scl.lesson_id
GROUP BY sc.student_id, s.username, c.name ;

-- 21. UserCourseLesson: Hiển thị chi tiết bài học và trạng thái của user đó đã học (bao gồm cả thông tin user và
-- thông tin course và thông tin bài học)
SELECT scl.user_course_user_id as user_id, s.username, c.name as course_name,
       l.name as lesson_name, l.url as lesson_url, scl.status
FROM student_course_lesson scl
         JOIN student s ON scl.user_course_course_id = s.id
         JOIN lesson l ON scl.lesson_id = l.id
         JOIN chapter ch ON l.chapter_id = ch.id
         JOIN course c ON ch.course_id = c.id;


-- 22. Xem chi tiết giáo viên và số lượng khóa học giáo viên đã dạy
SELECT t.id, t.username, t.name, COUNT(c.id) as course_count
FROM teacher t
         LEFT JOIN course c ON t.id = c.teacher_id
group by t.id, t.username, t.name ;

-- 23. Xem chi tiết khóa học và số lượng chapter và số lượng bài học trong khóa học, và số lượng user đã đăng ký khóa học
SELECT c.id, c.name, COUNT(ch.id) as chapter_count,
       COUNT(l.id) as lesson_count, COUNT(sc.student_id) as student_count
FROM course c
         LEFT JOIN chapter ch ON c.id = ch.course_id
         LEFT JOIN lesson l ON ch.id = l.chapter_id
         LEFT JOIN student_course sc ON c.id = sc.course_id
GROUP BY c.id, c.name;

-- 24. Xem chi tiết chapter: Hiển thị thông tin chi tiết về khóa học và chapter và số lượng bài học trong chapter
SELECT ch.id, ch.name, c.name as course_name,
       COUNT(l.id) as lesson_count
FROM chapter ch
         JOIN course c ON ch.course_id = c.id
         JOIN lesson l ON ch.id = l.chapter_id
GROUP BY ch.id, ch.name, c.name;

-- 25 Xem chi tiết bài học: Hiển thị thông tin chi tiết về khóa học và chapter và thông tin bài học và số lượng user đã hoàn thành bài học, và số lượng user đang học bài học.
SELECT l.id, l.name, c.name as course_name, ch.name as chapter_name,
       SUM(CASE WHEN scl.status = 'completed' THEN 1 ELSE 0 END) as completed_count,
       SUM(CASE WHEN scl.status = 'in_progress' THEN 1 ELSE 0 END) as processing_count
FROM lesson l
         JOIN chapter ch ON l.chapter_id = ch.id
         JOIN course c ON ch.course_id = c.id
         JOIN student_course_lesson scl ON l.id = scl.lesson_id
GROUP BY l.id, l.name, c.name, ch.name;


-- 27. DANG KY KHOA HOC

INSERT INTO student_course (student_id, course_id, status, created_date, updated_date)
VALUES (1, 1, 'in_progress', NOW(), NULL);

-- 28. DANH GIA KHOA HOC

UPDATE student_course
SET rating = 5, review = 'Good course', updated_date = NOW()
WHERE student_id = 1 AND course_id = 1;

-- 29. VIET NHAN XET KHOA HOC

UPDATE student_course
SET review = 'Very good course', updated_date = NOW()
WHERE student_id = 1 AND course_id = 1;

-- 30. XEM KHOA HOC MA USER DANG KY, search theo:
/* Theo name
Theo ngày tháng (from, to)
Search theo giáo viên
Search theo rating (from, to) (Tính trung bình rating rồi tìm kiếm)
Search theo status
Search theo số lượng bài học của khóa */

SELECT c.*, t.name as teacher_name
FROM course c
         JOIN teacher t ON c.teacher_id = t.id
         JOIN student_course sc ON c.id = sc.course_id
WHERE c.name LIKE '%Math%'
   OR c.created_date BETWEEN '2021-01-01' AND '2021-12-31'
   OR t.name LIKE '%mr%'
   OR (SELECT AVG(rating) FROM student_course WHERE course_id = c.id) BETWEEN 4 AND 5
   OR c.status = 'active'
   OR (SELECT COUNT(id) FROM chapter WHERE course_id = c.id) BETWEEN 1 AND 10
ORDER BY c.created_date DESC
    LIMIT 10;


