create database One_To_Many_Relationship;
use One_To_Many_Relationship;

create table department(
dept_id int(11) primary key auto_increment,
dept_name varchar(225) not null
);
create table students(
student_id int(11) primary key auto_increment,
student_name varchar(225) not null,
dept_id int(11),
foreign key (dept_id) references department (dept_id)
);
insert into department (dept_name) VALUES ('Computer Science'), ('Mathematics'),('English');
insert into students (student_name, dept_id) VALUES ('Ali', 1), ('Habib', 2), ('Sajid', 3);
SELECT s.student_id, s.student_name, d.dept_name FROM students s
Inner join department d ON s.dept_id = d.dept_id;
drop database One_To_Many_Relationship;

create table teacher (
    teacher_id INT(11) primary key auto_increment,
    teacher_name VARCHAR(225)
);
create table course (
    course_id int(11) primary key auto_increment,
    course_name VARCHAR(225),
    teacher_id INT,
    FOREIGN KEY (teacher_id) REFERENCES teacher(teacher_id)
);
INSERT INTO teacher (teacher_name) VALUES ('Rahim Bux'), ('Jabbar');
INSERT INTO course (course_name, teacher_id) 
VALUES ('Data Structures', 1), ('Algorithms', 1), ('Calculus', 2);
SELECT c.course_id, c.course_name, t.teacher_name FROM course c
INNER JOIN teacher t ON c.teacher_id = t.teacher_id;

CREATE TABLE library (
    library_id INT(11) PRIMARY KEY AUTO_INCREMENT,
    library_name VARCHAR(225)
);
CREATE TABLE book (
    book_id INT(11) PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(225),
    library_id INT,
    FOREIGN KEY (library_id) REFERENCES library(library_id)
);
INSERT INTO library (library_name) VALUES ('Central Library'), ('City Library');
INSERT INTO book (title, library_id) 
VALUES ('Introduction to Java', 1), ('SQL for Beginners', 1), ('Python Programming', 2);
SELECT b.book_id, b.title, l.library_name FROM book b
INNER JOIN library l ON b.library_id = l.library_id;

CREATE TABLE customer (
    customer_id INT(11) PRIMARY KEY AUTO_INCREMENT,
    customer_name VARCHAR(225)
);
CREATE TABLE orders (
    order_id INT(11) PRIMARY KEY AUTO_INCREMENT,
    order_date DATE,
    customer_id INT(11),
    FOREIGN KEY (customer_id) REFERENCES customer(customer_id)
);
INSERT INTO customer (customer_name) VALUES ('Waseem'), ('Shahid');
INSERT INTO orders (order_date, customer_id) 
VALUES ('2025-06-01', 1), ('2025-06-02', 1), ('2025-06-03', 2);
SELECT o.order_id, o.order_date, c.customer_name FROM orders o
INNER JOIN customer c ON o.customer_id = c.customer_id;

CREATE TABLE country (
    country_id INT(11) PRIMARY KEY AUTO_INCREMENT,
    country_name VARCHAR(225)
);
CREATE TABLE city (
    city_id INT(11) PRIMARY KEY AUTO_INCREMENT,
    city_name VARCHAR(225),
    country_id INT(11),
    FOREIGN KEY (country_id) REFERENCES country(country_id)
);
INSERT INTO country (country_name) VALUES ('Pakistan'), ('USA');
INSERT INTO city (city_name, country_id) 
VALUES ('Lahore', 1), ('Karachi', 1), ('New York', 2);
SELECT ci.city_id, ci.city_name, co.country_name FROM city ci
INNER JOIN country co ON ci.country_id = co.country_id;

CREATE TABLE hospital (
    hospital_id INT(11) PRIMARY KEY AUTO_INCREMENT,
    hospital_name VARCHAR(225)
);
CREATE TABLE patient (
    patient_id INT(11) PRIMARY KEY AUTO_INCREMENT,
    patient_name VARCHAR(225),
    hospital_id INT,
    FOREIGN KEY (hospital_id) REFERENCES hospital(hospital_id)
);
INSERT INTO hospital (hospital_name) VALUES ('City Hospital'), ('Private Clinic');
INSERT INTO patient (patient_name, hospital_id) 
VALUES ('Usman', 1), ('Aliya', 1), ('Imran', 2);
SELECT p.patient_id, p.patient_name, h.hospital_name FROM patient p
INNER JOIN hospital h ON p.hospital_id = h.hospital_id;

CREATE TABLE school (
    school_id INT(11) PRIMARY KEY AUTO_INCREMENT,
    school_name VARCHAR(225)
);
CREATE TABLE class (
    class_id INT(11) PRIMARY KEY AUTO_INCREMENT,
    class_name VARCHAR(225),
    school_id INT(11),
    FOREIGN KEY (school_id) REFERENCES school(school_id)
);
INSERT INTO school (school_name) VALUES ('Murad High School'), ('British Grammar School');
INSERT INTO class (class_name, school_id) 
VALUES ('Grade 9', 1), ('Grade 10', 1), ('Grade 11', 2);
SELECT c.class_id, c.class_name, s.school_name FROM class c
INNER JOIN school s ON c.school_id = s.school_id;


CREATE TABLE company (
    company_id INT(11) PRIMARY KEY AUTO_INCREMENT,
    company_name VARCHAR(225)
);
CREATE TABLE employee (
    employee_id INT(11) PRIMARY KEY AUTO_INCREMENT,
    employee_name VARCHAR(225),
    company_id INT(11),
    FOREIGN KEY (company_id) REFERENCES company(company_id)
);
INSERT INTO company (company_name) VALUES ('TechSoft'), ('Systems');
INSERT INTO employee (employee_name, company_id) 
VALUES ('Amir', 1), ('Ajmal', 1), ('Noman', 2);
SELECT e.employee_id, e.employee_name, c.company_name FROM employee e
INNER JOIN company c ON e.company_id = c.company_id;


CREATE TABLE publisher (
    publisher_id INT(11) PRIMARY KEY AUTO_INCREMENT,
    publisher_name VARCHAR(225) NOT NULL
);
CREATE TABLE BOOK (
    book_id INT(11) PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(225) NOT NULL,
    publisher_id INT(11),
    FOREIGN KEY (publisher_id) REFERENCES publisher(publisher_id)
);
INSERT INTO publisher (publisher_name) 
VALUES ('John'), ('Aristotle');
INSERT INTO book (title, publisher_id) 
VALUES ('Database Systems', 1), ('Learning Python', 2), ('Java in Depth', 1);
SELECT b.book_id, b.title, p.publisher_name FROM book b
INNER JOIN publisher p ON b.publisher_id = p.publisher_id;


CREATE TABLE category (
    category_id INT(11) PRIMARY KEY AUTO_INCREMENT,
    category_name VARCHAR(225) NOT NULL
);
CREATE TABLE product (
    product_id INT(11) PRIMARY KEY AUTO_INCREMENT,
    product_name VARCHAR(225) NOT NULL,
    category_id INT(11),
    FOREIGN KEY (category_id) REFERENCES category(category_id)
);
INSERT INTO category (category_name) 
VALUES ('Electronics'), ('Furniture');
INSERT INTO product (product_name, category_id) 
VALUES ('Laptop', 1), ('Smartphone', 1), ('Chair', 2), ('Table', 2);
SELECT p.product_id, p.product_name, c.category_name FROM product p
INNER JOIN category c ON p.category_id = c.category_id;
















