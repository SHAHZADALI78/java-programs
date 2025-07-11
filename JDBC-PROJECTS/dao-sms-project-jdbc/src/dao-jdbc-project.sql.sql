create database student_management_system_jdbc_dao;
use student_management_system_jdbc_dao;

create table department (
    d_name varchar(225),
    d_code varchar(225) primary key
);

create table student (
    s_name varchar(225),
    s_rollno varchar(225) primary key,
    s_age int(11),
    s_dept varchar(225),
    foreign key (s_dept) references department(d_code)
);
insert into department (d_name, d_code) values ('Software' , 'BS123');
drop database student_management_system_jdbc_dao;
select * from student;
select * from department;
