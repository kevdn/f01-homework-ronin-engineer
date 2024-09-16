use ronin;
-- --------------------------------------------------------
-- 1. Tìm danh sách các lớp học hiện có trong bảng student
SELECT DISTINCT class FROM student;

-- --------------------------------------------------------
-- 2. Đếm số học sinh trong bảng
SELECT COUNT(student_id) AS 'Number of students' FROM student;

-- 3. Tính tổng điểm các môn(Toán, Văn, Anh..) của tất cả học sinh
SELECT student_id,  (math + literature + english) AS 'Total score' FROM student;

-- 4. Tính điểm trung bình các môn(Toán, Văn, Anh..) của tất cả học sinh
select student_id, avg_score from student;

-- 5. Tìm điểm cao nhất của từng môn theo từng lớp
SELECT class,
       MAX(math) AS 'Max math score',
       MAX(literature) AS 'Max literature score',
       MAX(english) AS 'Max english score'
FROM student
GROUP BY class;

-- 6. Tìm điểm thấp nhất của từng môn theo từng lớp
SELECT class,
       MIN(math) AS 'Min math score',
       MIN(literature) AS 'Min literature score',
       MIN(english) AS 'Min english score'
FROM student
GROUP BY class;

-- 7. Tìm học sinh có tên bắt đầu với chữ cái 'A'
SELECT * FROM student WHERE name LIKE 'A%';

-- 8. Tìm học sinh có điểm môn Toán là 9 hoặc 10
SELECT * FROM student WHERE math IN (9, 10);

-- 9. Lấy thông tin học sinh và sắp xếp theo điểm tổng kết từ cao đến thấp theo từng khối
SELECT * FROM student ORDER BY avg_score DESC;

-- 10. Lấy thông tin 5 học sinh đầu tiên trong bảng có điểm tổng kết tổng cao nhất theo thứ tự cao đến thấp.
SELECT * FROM student ORDER BY avg_score DESC LIMIT 5;

-- 11. Tìm học sinh có điểm môn Văn >= 8 và điểm môn Anh < 6
SELECT * FROM student WHERE literature >= 8 AND english < 6;

-- 12. Tìm học sinh có điểm môn Toán < 5 hoặc điểm tổng kết tổng < 10
SELECT * FROM student WHERE math < 5 OR avg_score < 10;

-- 13. Viết câu update để cập nhập lớp mới cho các học sinh đủ điều kiện lên lớp(điểm tổng kết >= 5 và không có điểm các môn nào = 0)
UPDATE student
SET class = CASE
    WHEN avg_score >= 5 AND math != 0 AND literature != 0 AND english != 0 THEN
        CASE
            WHEN class LIKE '10%' THEN CONCAT('11', SUBSTR(class, 3))
            WHEN class LIKE '11%' THEN CONCAT('12', SUBSTR(class, 3))
            ELSE 'Graduated'
        END
    ELSE class
END;

