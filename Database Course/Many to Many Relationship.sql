create database Many_To_Many_Relationship;
use Many_To_Many_Relationship;
CREATE TABLE movie (
    movie_id INT(11) PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(225)
);
CREATE TABLE actor (
    actor_id INT(11) PRIMARY KEY AUTO_INCREMENT,
    actor_name VARCHAR(225)
);
CREATE TABLE movie_actor (
    movie_id INT(11),
    actor_id INT(11),
    FOREIGN KEY (movie_id) REFERENCES movie(movie_id),
    FOREIGN KEY (actor_id) REFERENCES actor(actor_id)
);
INSERT INTO movie (title) VALUES ('Inception'), ('Titanic');
INSERT INTO actor (actor_name) VALUES ('Leonardo'), ('Tom');
INSERT INTO movie_actor (movie_id, actor_id) VALUES (1,1), (1,2), (2,1);
SELECT m.title, a.actor_name FROM movie_actor ma
inner join movie m ON ma.movie_id = m.movie_id
inner join actor a ON ma.actor_id = a.actor_id;

create table doctors (
    doctor_id int primary key,
    doctor_name varchar(100),
    specialization varchar(100)
);
create table patients (
    patient_id int(11) primary key,
    patient_name varchar(225),
    age int(11)
);
create table appointments (
    doctor_id int(11),
    patient_id int(11),
    appointment_date date,
    primary key (doctor_id, patient_id, appointment_date),
    foreign key (doctor_id) references doctors(doctor_id),
    foreign key (patient_id) references patients(patient_id)
);
insert into doctors values (1, 'Dr. Ahad', 'Dermatologist'), (2, 'Dr. Hassan', 'pediatrics');
insert into patients values (001, 'Shahid', 25), (002, 'Zubair', 28);
insert into appointments values (1, 001, '2025-06-20');
select d.doctor_name, p.patient_name, a.appointment_date from doctors d
Inner join appointments a on d.doctor_id = a.doctor_id
Inner join patients p on a.patient_id = p.patient_id;


create table students (
    student_id int(11) primary key,
    student_name varchar(225)
);
create table courses (
    course_id int(11) primary key,
    course_name varchar(225)
);
create table student_courses (
    student_id int(11),
    course_id int(11),
    enrollment_date date,
    primary key (student_id, course_id),
    foreign key (student_id) references students(student_id),
    foreign key (course_id) references courses(course_id)
);
insert into students values (001, 'Adil'), (002, 'Partab');
insert into courses values (101, 'database systems'), (102, 'OOP');
insert into student_courses values (1, 101, '2025-06-20');

select s.student_name, c.course_name, sc.enrollment_datedepartment
from students s
Inner join student_courses sc on s.student_id = sc.student_id
Inner join courses c on sc.course_id = c.course_id;
