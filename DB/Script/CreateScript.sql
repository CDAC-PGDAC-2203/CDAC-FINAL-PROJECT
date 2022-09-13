create database cdac_app_final;
use cdac_app_final;

-- Date format YYYY-MM-DD 
create table if not exists ccat_pre(ccat_no bigint PRIMARY KEY NOT NULL, f_name varchar(25), 
m_name varchar(25), l_name varchar(25), dob date);

insert into ccat_pre values('2203001','Hardik',NULL,'Agarwal','2000-03-17');
insert into ccat_pre values('2203002','Joy',NULL,'Pahari','1998-09-01');
insert into ccat_pre values('2203003','Udit',NULL,'Keskar','1999-11-23');
insert into ccat_pre values('2203004','Mayank',NULL,'Sachan','1994-03-07');
insert into ccat_pre values('2203005','Kamana',NULL,'Mathur','1997-07-04');
insert into ccat_pre values('1111111','admin','admin','admin','1999-01-01');
