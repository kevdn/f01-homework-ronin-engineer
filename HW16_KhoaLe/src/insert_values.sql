use ronin;
-- Insert data into students table
INSERT INTO students (id, name, status) VALUES
            (1, 'John Doe', 'Active'),
            (2, 'Jane Smith', 'Active'),
            (3, 'Mike Johnson', 'Inactive'),
            (4, 'Emily Brown', 'Active');

-- Insert data into teacher table
INSERT INTO teacher (id, name, status) VALUES
            (1, 'Prof. Anderson', 'Active'),
            (2, 'Dr. Williams', 'Active'),
            (3, 'Ms. Davis', 'Inactive');

-- Insert data into course table
INSERT INTO course (id, title, description, status) VALUES
            (1, 'Introduction to Programming', 'Learn basics of programming', 'Active'),
            (2, 'Data Structures', 'Advanced programming concepts', 'Active'),
            (3, 'Web Development', 'Build modern web applications', 'Active');

-- Insert data into chapter table
INSERT INTO chapter (id, title, description, status, course_id) VALUES
            (1, 'Variables and Data Types', 'Understanding basic concepts', 'Active', 1),
            (2, 'Control Structures', 'Loops and conditionals', 'Active', 1),
            (3, 'Arrays and Lists', 'Working with collections', 'Active', 2),
            (4, 'HTML Basics', 'Structure of web pages', 'Active', 3);

-- Insert data into student_course table
INSERT INTO student_course (student_id, course_id, rating) VALUES
            (1, 1, 4.5),
            (1, 2, null),
            (2, 1, 4.8),
            (3, 3, 3.7),
            (4, 2, null);

-- Insert data into teacher_course table
INSERT INTO teacher_course (teacher_id, course_id) VALUES
            (1, 1),
            (1, 2),
            (2, 3),
            (3, 1);

-- Insert data into lesson table
INSERT INTO lesson (id, title, description, chapter_id) VALUES
            (1, 'What is a Variable?', 'Introduction to variables', 1),
            (2, 'If Statements', 'Understanding conditional logic', 2),
            (3, 'For Loops', 'Iterating through collections', 2),
            (4, 'Linked Lists', 'Understanding linked structures', 3),
            (5, 'Basic HTML Tags', 'Common HTML elements', 4);

-- Insert data into student_lesson table
INSERT INTO student_lesson (student_id, lesson_id) VALUES
            (1, 1),
            (1, 2),
            (2, 1),
            (3, 5),
            (4, 3),
            (4, 4);