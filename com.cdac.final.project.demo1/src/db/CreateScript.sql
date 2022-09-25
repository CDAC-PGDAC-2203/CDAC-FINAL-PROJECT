create database cdac_app_final;
use cdac_app_final;
-- drop database cdac_app_final

-- ------------------------------------------------------------------------------------------------------

-- ccat_student table

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

-- ------------------------------------------------------------------------------------------------------

-- user_table

CREATE TABLE IF NOT EXISTS user_table(
	u_id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    f_name VARCHAR(25),
    ccat_no BIGINT NOT NULL,
    u_role VARCHAR(10)
);

INSERT INTO user_table VALUES (1, 'Hardik', 2203001, 'STUDENT');
INSERT INTO user_table VALUES (2, 'Joy', 2203002, 'STUDENT');
INSERT INTO user_table VALUES (3, 'Udit', 2203003, 'STUDENT');
INSERT INTO user_table VALUES (4, 'Mayank', 2203004, 'STUDENT');
INSERT INTO user_table VALUES (5, 'Kamana', 2203005, 'STUDENT');
INSERT INTO user_table VALUES (10000, 'admin', 1111111, 'ADMIN');

-- ------------------------------------------------------------------------------------------------------

-- personal_details table

create table if not exists personal_details(
	u_id bigint PRIMARY KEY NOT NULL,
    ccat_no bigint,
    f_name varchar(25) NOT NULL,
    m_name varchar(25), l_name varchar(25),
    gender varchar(1) NOT NULL,
    dob date NOT NULL,		-- Date format YYYY-MM-DD
    email varchar(60) NOT NULL,
    phone bigint NOT NULL,
    qualification varchar(15) NOT NULL,
    photo varchar(5000),
    course varchar(10) NOT NULL,
    guardian_name VARCHAR(50),
    guardian_phone BIGINT
);

insert into personal_details values('1',2203001,'Hardik',NULL,'Agarwal','M','2000-03-17','hardikagarwal1703@gmail.com','8630296896','B.tech','https:\\hardik.png','PG-DAC','Mala Agarwal', '8630298749');
insert into personal_details values('2',2203002,'Joy',NULL,'Pahari','M','1998-09-01','joypahari11@gmail.com','7798003910','B.tech','https:\\joy.png','PG-DAC','SB Pahari', '7499153589');
insert into personal_details values('3',2203003,'Udit',NULL,'Keskar','M','1999-11-23','udit@gmail.com','9876543212','B.tech','https:\\udit.png','PG-DBDA','Abc', '7548754875');
insert into personal_details values('4',2203004,'Mayank',NULL,'Sachan','M','1995-03-07','mayank@gmail.com','8426971358','B.tech','https:\\mayank.png','PG-DESC','Abc', '3232323232');
insert into personal_details values('5',2203005,'Kamana',NULL,'Mathur','F','1997-07-04','kamana.mathur89@gmail.com','9731862459','B.tech','https:\\kamana.png','PG-XYZ','Abc', '5454545454');

-- ------------------------------------------------------------------------------------------------------

-- user_address table

CREATE TABLE IF NOT EXISTS user_address(
	u_id bigint PRIMARY KEY NOT NULL,
	add_line1 varchar(30) NOT NULL,
	add_line2 varchar(30),
	state varchar(20) NOT NULL,
	city varchar(20) NOT NULL,
	pincode int NOT NULL
);
                            
INSERT INTO user_address VALUES(1,'Ganesh Apartment','Kisan Nagar','Uttar Pradesh','Hapur',400001);
INSERT INTO user_address VALUES(2,'Flat No. C/4','Navelkar Bldg, Mangoor Hill','Goa','Vasco',403802);
INSERT INTO user_address VALUES(3,'UVW','XYZ','Maharastra','Mumbai',454545);
INSERT INTO user_address VALUES(4,'DEF','ABC','Delhi','Noida',454545);
INSERT INTO user_address VALUES(5,'ABC','DEF','Rajasthan','Jodhpur',454545);
                                
-- ------------------------------------------------------------------------------------------------------

-- user_login table

CREATE TABLE IF NOT EXISTS user_login(
	u_id bigint not null,
    u_name varchar(50),
    u_prn bigint primary key not null,
    u_password varchar(20),
    u_role varchar(10),
    course varchar(10)
);

insert into user_login values(10000,'admin',11111,11111,'ADMIN','PG-DAC');

-- ------------------------------------------------------------------------------------------------------

-- module tables

CREATE TABLE IF NOT EXISTS module_1(
	u_prn bigint primary key not null,

    lab bigint,
    assessment bigint,
    attendance bigint
);
insert into module_1 values(220340120003,35,15,5);

CREATE TABLE IF NOT EXISTS module_2(
	u_prn bigint primary key not null,

    lab bigint,
    assessment bigint,
    attendance bigint
);
insert into module_2 values(220340120003,34,15,5);

CREATE TABLE IF NOT EXISTS module_3(
	u_prn bigint primary key not null,

    lab bigint,
    assessment bigint,
    attendance bigint
);

CREATE TABLE IF NOT EXISTS module_4(
	u_prn bigint primary key not null,

    lab bigint,
    assessment bigint,
    attendance bigint
);

CREATE TABLE IF NOT EXISTS module_5(
	u_prn bigint primary key not null,

    lab bigint,
    assessment bigint,
    attendance bigint
);

CREATE TABLE IF NOT EXISTS module_6(
	u_prn bigint primary key not null,

    lab bigint,
    assessment bigint,
    attendance bigint
);

CREATE TABLE IF NOT EXISTS module_7(
	u_prn bigint primary key not null,

    lab bigint,
    assessment bigint,
    attendance bigint
);

CREATE TABLE IF NOT EXISTS module_8(
	u_prn bigint primary key not null,

    lab bigint,
    assessment bigint,
    attendance bigint
);

-- ------------------------------------------------------------------------------------------------------

-- final_result table 

CREATE TABLE IF NOT EXISTS final_result(
	u_prn bigint primary key not null,

    mod1 bigint,
	mod2 bigint,
    mod3 bigint,
    mod4 bigint,
    mod5 bigint,
    mod6 bigint,
    mod7 bigint,
    mod8 bigint
);

-- ------------------------------------------------------------------------------------------------------

-- doubt Forum table

CREATE TABLE IF NOT EXISTS doubt_forum(
	d_id bigint primary key not null,
    u_prn bigint not null,
    u_name varchar(25) not null,
    email varchar(60) not null,
    sub_name varchar(10) not null,
    doubt_content varchar(250) not null,
    attachment varchar(500),
    active_doubt char(1) not null -- (Y/N)
);

INSERT INTO doubt_forum VALUES(1, 220340120001, 'Hardik', 'hardikagarwal1703@gmail.com', 'mod1', 'xyz', 'xyz', 'Y');
INSERT INTO doubt_forum VALUES(2, 220340120002, 'Joy', 'joypahari11@gmail.com', 'mod2', 'abc', 'abc', 'Y');
INSERT INTO doubt_forum VALUES(3, 220340120001, 'Hardik', 'hardikagarwal1703@gmail.com', 'mod2', 'abc', 'abc', 'N');
INSERT INTO doubt_forum VALUES(4, 220340120002, 'Joy', 'joypahari11@gmail.com', 'mod2', 'abc', 'abc', 'Y');

-- ------------------------------------------------------------------------------------------------------

-- total_attendance table

CREATE TABLE IF NOT EXISTS total_attendance(
	u_prn bigint not null,
    module varchar(10) not null,
    attended_lecture int not null,
    total_lecture int not null,
    PRIMARY KEY (u_prn, module)
);

-- ------------------------------------------------------------------------------------------------------

-- lecture_link table

CREATE TABLE IF NOT EXISTS lecture_link(
    id int primary key,
    course varchar(10),
    session_date date,
    lect_link varchar(500),
    b1_link varchar(500),
    b2_link varchar(500),
    b3_link varchar(500),
    b4_link varchar(500)
);

-- ------------------------------------------------------------------------------------------------------

-- question_paper table

CREATE TABLE IF NOT EXISTS question_paper(
	question varchar(700) PRIMARY KEY NOT NULL,
    option1 varchar(700),
    option2 varchar(700),
    option3 varchar(700),
    option4 varchar(700),
    answer varchar(700),
    module varchar(700)
);

-- ------------------------------------------------------------------------------------------------------

-- mcq_marks table

CREATE TABLE IF NOT EXISTS mcq_marks(
	u_prn bigint not null,
    module varchar(50),
    marks bigint
);

-- ------------------------------------------------------------------------------------------------------

-- feedback table

CREATE TABLE IF NOT EXISTS feedback(
	u_prn bigint primary key not null,
    course varchar(10),
    faculty varchar(100),
    module varchar(50),
    parameter_1 int,
    parameter_2 int,
    parameter_3 int,
    parameter_4 int,
    parameter_5 int,
    parameter_total int,
    suggestion varchar(300)
);

INSERT INTO feedback VALUES(220340120001,'PG-DAC','Madhura','mod1',2,3,5,5,5,20,'Excellent');
INSERT INTO feedback VALUES(220340120002,'PG-DAC','Madhura','mod1',3,4,5,5,5,20,'Excellent');

-- ------------------------------------------------------------------------------------------------------

-- faculty table

CREATE TABLE IF NOT EXISTS faculty(
	faculty_id bigint primary key not null,
    faculty_name varchar(100),
    visibility_flag varchar(1),
    course varchar(10)
);

INSERT INTO faculty VALUES(1,'A','N','PG-DAC');
INSERT INTO faculty VALUES(2,'B','N','PG-XYZ');
INSERT INTO faculty VALUES(3,'C','N','PG-DAC');

-- ------------------------------------------------------------------------------------------------------

-- user_token table

CREATE TABLE IF NOT EXISTS user_token(
	u_prn bigint primary key,
    token varchar(500),
    u_role varchar(10)
);

-- ------------------------------------------------------------------------------------------------------

-- notice table

CREATE TABLE IF NOT EXISTS notice(
	notice_name varchar(100),
    notice_link varchar(100),
    visibility varchar(100)
);

INSERT INTO notice VALUES('ABCD','http://link1','N');
INSERT INTO notice VALUES('EFGH','http://link2','N');
INSERT INTO notice VALUES('IJKL','http://link3','N');

-- ------------------------------------------------------------------------------------------------------