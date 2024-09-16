drop database if exists `ronin`;
create database `ronin`;
use `ronin`;
drop table if exists student;
-- --------------------------------------------------------
CREATE TABLE student (
    student_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    class VARCHAR(255) NOT NULL,
    age INT NOT NULL,
    math FLOAT NOT NULL,
    literature FLOAT NOT NULL,
    english FLOAT NOT NULL,
    avg_score FLOAT NOT NULL
);
