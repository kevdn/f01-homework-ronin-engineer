use ronin;
-- --------------------------------------------------------
-- 1. Truy vấn thông tin của sinh viên và số lượng khóa học sinh viên đã đăng ký
select s.id, s.name, count(sc.course_id) as 'Number of courses'
from students s
         left join student_course sc on s.id = sc.student_id
group by s.id;

-- --------------------------------------------------------
-- 2. Truy vấn thông tin của giáo viên và khóa học giáo viên đã dạy
select t.id, t.name, c.title as 'Course'
from teacher t
         left join teacher_course tc on t.id = tc.teacher_id
         left join course c on tc.course_id = c.id;

-- --------------------------------------------------------
-- 3. Truy vấn các khóa học có số lượng sinh viên đang học trên 10 người và đánh giá trung bình >= 4.0(thang điểm 5)
select c.id, c.title, avg(sc.rating) as 'Average rating',
       count(sc.student_id) as 'Number of students'
from course c
         left join student_course sc on c.id = sc.course_id
group by c.id
having avg(sc.rating) >= 4.0 and count(sc.student_id) > 10;

-- --------------------------------------------------------
-- 4. Truy vấn toàn bộ thông tin của khóa học bao gồm: Tên khóa học, Tên chương(Chapter), và danh sách chi tiếp các lesson của từng chapter
select c.title as 'Course',
       ch.title as 'Chapter',
       group_concat(l.title) as 'Lessons' -- danh sách các bài học trong chapter
from course c
         left join chapter ch on c.id = ch.course_id
         left join lesson l on ch.id = l.chapter_id
group by c.id, ch.id;

-- --------------------------------------------------------
-- 5. Tìm tất cả khóa học chưa có sinh viên học hoặc giáo viên nào dạy
select c.id, c.title
from course c
         left join student_course sc on c.id = sc.course_id
         left join teacher_course tc on c.id = tc.course_id
where sc.student_id is null or tc.teacher_id is null;

-- --------------------------------------------------------
-- 6. Truy vấn chi tiết khóa học và số lượng chapter và số lượng bài học trong khóa học, và số lượng user đã đăng ký khóa học
select c.id, c.title,
    count(distinct ch.id) as 'Number of chapters',
    count(distinct l.id) as 'Number of lessons',
    count(distinct sc.student_id) as 'Number of students'
from course c
    left join chapter ch on c.id = ch.course_id
    left join lesson l on ch.id = l.chapter_id -- course -> chapter -> lesson
    left join student_course sc on c.id = sc.course_id -- course -> student_course
group by c.id;

-- --------------------------------------------------------
-- 7. truy vấn thông tin chi tiết về khóa học và chapter và số lượng bài học trong chapter
select c.id, c.title,
       ch.title as 'Chapter', count(l.id) as 'Number of lessons'
from course c
         left join chapter ch on c.id = ch.course_id
         left join lesson l on ch.id = l.chapter_id
group by c.id, ch.id;

-- --------------------------------------------------------
-- 8. Truy vấn thông tin chi tiết về khóa học, chapter, thông tin bài học, số lượng user
-- đã hoàn thành bài học, và số lượng user đang học bài học.
select c.id, c.title,
       ch.title as 'Chapter',
       l.title as 'Lesson',
       count(distinct case when sc.rating is not null then sc.student_id end) as 'Number of students completed',
       count(distinct case when sc.rating is null then sc.student_id end) as 'Number of students in progress'
from course c
         left join chapter ch on c.id = ch.course_id
         left join lesson l on ch.id = l.chapter_id
         left join student_lesson sl on l.id = sl.lesson_id
         left join student_course sc on sl.student_id = sc.student_id and c.id = sc.course_id
group by c.id, ch.id, l.id;

-- --------------------------------------------------------
-- 9. Hệ thống yêu cầu phải đánh dấu lại được các bài học(Lesson) nào mà
-- sinh viên đã học qua, Bạn hãy thiết kế thêm vào CSDL ở trên để đáp ứng bài
-- toán này.

-- added student_lesson table

