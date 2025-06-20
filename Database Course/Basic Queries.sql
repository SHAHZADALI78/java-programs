CREATE DATABASE college;
USE college;
CREATE TABLE student(
rollno INT PRIMARY KEY,
name VARCHAR(50),
grade VARCHAR(1),
marks INT NOT NULL,
city VARCHAR(50)
);
SELECT * FROM student;
INSERT INTO student
 (rollno , name, grade, marks, city)
 VALUES
 (101, "Aslam","C", 85, "karachi"),
 (102, "Saad", "A",90, "karachi"),
 (103, "Saeed", "B", 95, "Hyderabad"),
 (104, "Saeed", "A", 95, "Hyderabad"),
 (105, "Saeed", "B", 95, "sukkur"),
 (106, "Saeed", "C", 95, "sukkur");
SELECT * FROM student;
SELECT *
FROM student
WHERE grade = "A";
SELECT *
FROM student 
WHERE grade BETWEEN A AND C;
SELECT *
FROM student 
WHERE grade IN ("A" , "C");
SELECT *
FROM student 
WHERE grade NOT IN ("A" , "C");
SELECT *
FROM student
ORDER BY grade ASC;
SELECT *
FROM student
ORDER BY grade DESC
LIMIT 3;
SELECT * FROM student WHERE marks > 90;
SELECT * FROM student WHERE city = "karachi";
SELECT * FROM student WHERE marks > 90 AND city = "hyderabad";
SELECT * FROM student WHERE marks+15 > 100;
SELECT * FROM student WHERE city IN ("karachi" , "gambat");
SELECT max(marks) FROM student;
SELECT count(marks) FROM student;
SELECT city FROM student GROUP BY city;
SELECT city, count(name) FROM student GROUP BY city;








