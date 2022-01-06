show databases;
create database nodule_detect_system;
use nodule_detect_system;
create table user(
                     `id` int auto_increment,
                     `username` varchar(11),
                     `password` varchar(11),
                     primary key(`id`));
insert into user values(1,'root','123456')