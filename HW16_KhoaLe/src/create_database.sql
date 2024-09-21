drop database if exists ronin;
create database if not exists ronin;
use ronin;

drop table if exists students;

create table students
(
    id     bigint primary key,
    name   varchar(50) not null,
    status varchar(20)
);

create table teacher
(
    id     bigint primary key,
    name   varchar(50) not null,
    status varchar(20)
);

create table course
(
    id          bigint primary key,
    title       varchar(50) not null,
    description varchar(50),
    status      varchar(20)
);

create table chapter
(
    id          bigint primary key,
    title       varchar(50) not null,
    description varchar(50),
    status      varchar(20),
    course_id   bigint,
    foreign key (course_id) references course (id)
);


alter table chapter
add course_id bigint,
    add foreign key (course_id) references course (id);


create table student_course
(
    student_id bigint,
    course_id  bigint,
    rating     float,
    primary key (student_id, course_id)
);


create table teacher_course
(
    teacher_id bigint,
    course_id  bigint,
    primary key (teacher_id, course_id)
);

create table lesson
(
    id          bigint primary key,
    title       varchar(50) not null,
    description varchar(50),
    chapter_id  bigint,
    foreign key (chapter_id) references chapter (id)
);

create table student_lesson
(
    student_id bigint,
    lesson_id  bigint,
    primary key (student_id, lesson_id)
);

