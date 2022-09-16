create database cdac_app_final;
use cdac_app_final;
-- drop database cdac_app_final
-- ----------------------------------------------------------------------
-- ccat_student

create table if not exists ccat_student(
	ccat_no bigint PRIMARY KEY NOT NULL,
    f_name varchar(25) NOT NULL, 
	m_name varchar(25),
    l_name varchar(25),
    dob date NOT NULL,		-- Date format YYYY-MM-DD 
    course varchar(10) NOT NULL
);

insert into ccat_student values('2203001','Hardik',NULL,'Agarwal','2000-03-17','PG-DAC');
insert into ccat_student values('2203002','Joy',NULL,'Pahari','1998-09-01','PG-DAC');
insert into ccat_student values('2203003','Udit',NULL,'Keskar','1999-11-23','PG-DBDA');
insert into ccat_student values('2203004','Mayank',NULL,'Sachan','1994-03-07','PG-DESC');
insert into ccat_student values('2203005','Kamana',NULL,'Mathur','1997-07-04','PG-XYZ');
insert into ccat_student values('1111111','admin','admin','admin','1999-01-01','PG-DAC');

-- ----------------------------------------------------------------------
-- user_table

CREATE TABLE IF NOT EXISTS user_table(
	u_id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    f_name VARCHAR(25),
    ccat_no BIGINT NOT NULL,
    u_role VARCHAR(10)
);

INSERT INTO user_table VALUES (1, 'Hardik', 2203001, 'Student');

-- ----------------------------------------------------------------------
-- personal_table

create table if not exists personal_details(
	u_id bigint PRIMARY KEY NOT NULL,
    f_name varchar(25) NOT NULL,
    m_name varchar(25), l_name varchar(25),
    gender varchar(1) NOT NULL,
    dob date NOT NULL,		-- Date format YYYY-MM-DD
    email varchar(60) NOT NULL,
    phone bigint NOT NULL,
    qualification varchar(15) NOT NULL,
    photo varchar(500),
    course varchar(10) NOT NULL
);

insert into personal_details values('1','Hardik',NULL,'Agarwal','M','2000-03-17','hardik@gmail.com','8630296896','B.tech','https:///dcjcbbivfvbv','PG-DAC');

-- ----------------------------------------------------------------------
-- user_address

CREATE TABLE IF NOT EXISTS user_address(
	u_id bigint PRIMARY KEY NOT NULL,
	add_line1 varchar(30) NOT NULL,
	add_line2 varchar(30),
	state varchar(20) NOT NULL,
	city varchar(20) NOT NULL,
	pincode int NOT NULL
);
                            
INSERT INTO user_address VALUES(1,'Ganesh Apartment','Kisan Nagar','Uttar Pradesh','Hapur',400001);
                                
-- ----------------------------------------------------------------------
-- guardian

CREATE TABLE IF NOT EXISTS guardian(
    u_id BIGINT PRIMARY KEY NOT NULL,
    guardian_name VARCHAR(50),
    guardian_phone BIGINT
);

INSERT INTO guardian VALUES(1, 'Mala Agarwal', '8630298749');

-- ----------------------------------------------------------------------

-- user_login

CREATE TABLE IF NOT EXISTS user_login(
	u_id bigint not null,
    u_name varchar(50),
    u_prn bigint primary key,
    u_password varchar(20),
    course varchar(10)
);