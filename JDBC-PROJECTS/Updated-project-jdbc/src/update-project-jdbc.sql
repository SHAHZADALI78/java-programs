create database student_management_system_jdbc;
use student_management_system_jdbc;

create table student (
    s_name varchar(225),
    s_rollNo varchar(225) unique,
    s_age int(11),
    s_dept varchar(225)
);

create table departments(
	dept_name varchar(225),
    dept_code varchar (225)
);
select * from student;
select* from department;