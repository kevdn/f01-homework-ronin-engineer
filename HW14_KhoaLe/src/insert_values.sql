use `ronin`;
DELIMITER //

CREATE PROCEDURE insert_students()
BEGIN
    DECLARE i INT DEFAULT 0;
    DECLARE first_names VARCHAR(255) DEFAULT 'John,Emma,Michael,Olivia,William,Ava,James,Isabella,George,Sophia';
    DECLARE last_names VARCHAR(255) DEFAULT 'Smith,Johnson,Williams,Jones,Brown,Davis,Miller,Wilson,Moore,Taylor';
    DECLARE classes VARCHAR(255) DEFAULT '10A,10B,10C,11A,11B,11C,12A,12B,12C';
    DECLARE math FLOAT;
    DECLARE literature FLOAT;
    DECLARE english FLOAT;
    DECLARE avg_score FLOAT;

    WHILE i < 100 DO
            SET i = i + 1;

            SET math = ROUND(RAND() * 10, 2);
            SET literature = ROUND(RAND() * 10, 2);
            SET english = ROUND(RAND() * 10, 2);
            SET avg_score = ROUND((math + literature + english) / 3, 2);

            INSERT INTO student (name, class, age, math, literature, english, avg_score)
            VALUES (
                       CONCAT_WS(' ', SUBSTRING_INDEX(SUBSTRING_INDEX(first_names, ',', FLOOR(RAND() * 10 + 1)), ',', -1), SUBSTRING_INDEX(SUBSTRING_INDEX(last_names, ',', FLOOR(RAND() * 10 + 1)), ',', -1)),
                       SUBSTRING_INDEX(SUBSTRING_INDEX(classes, ',', FLOOR(RAND() * 9 + 1)), ',', -1),
                       FLOOR(RAND() * 3 + 15),
                       math,
                       literature,
                       english,
                       avg_score
                   );
        END WHILE;
END //

DELIMITER ;

CALL insert_students();