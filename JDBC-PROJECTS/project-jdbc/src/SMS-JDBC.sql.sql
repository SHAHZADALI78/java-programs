create database s_m_s_JDBC;
use s_m_s_JDBC;

create table student (
    s_name varchar(225),
    s_rollNo varchar(225) unique,
    s_age int(11),
    s_dept varchar(225)
);
select * from student;