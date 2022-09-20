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

INSERT INTO user_table VALUES (1, 'Hardik', 2203001, 'STUDENT');

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
    course varchar(10) NOT NULL,
    guardian_name VARCHAR(50),
    guardian_phone BIGINT
);

insert into personal_details values('1','Hardik',NULL,'Agarwal','M','2000-03-17',
'hardik@gmail.com','8630296896','B.tech',
'https:///dcjcbbivfvbv','PG-DAC',
'Mala Agarwal', '8630298749');

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

-- user_login

CREATE TABLE IF NOT EXISTS user_login(
	u_id bigint not null,
    u_name varchar(50),
    u_prn bigint primary key not null,
    u_password varchar(20),
    course varchar(10)
);

-- ----------------------------------------------------------------------

-- Result Table

CREATE TABLE IF NOT EXISTS result_table(
	u_prn bigint primary key not null,

    mod1_lab int,
    mod1_assessment int,
    mod1_attendance int,
    
    mod2_lab int,
    mod2_assessment int,
    mod2_attendance int,
    
    mod3_lab int,
    mod3_assessment int,
    mod3_attendance int,
    
    mod4_lab int,
    mod4_assessment int,
    mod4_attendance int,
    
    mod5_lab int,
    mod5_assessment int,
    mod5_attendance int,
    
    mod6_lab int,
    mod6_assessment int,
    mod6_attendance int,
    
    mod7_lab int,
    mod7_assessment int,
    mod7_attendance int,
    
    mod8_lab int,
    mod8_assessment int,
    mod8_attendance int
);

-- ----------------------------------------------------------------------------------------
-- Result Table

CREATE TABLE IF NOT EXISTS final_result_table(
	u_prn bigint primary key not null,

    mod1 int,
	mod2 int,
    mod3 int,
    mod4 int,
    mod5 int,
    mod6 int,
    mod7 int,
    mod8 int
);

insert into final_result_table values(220340120003,60,58,58,59,60,48,60,48);

-- ----------------------------------------------------------------------------------------
-- Doubt Forum table

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

-- ----------------------------------------------------------------------------------------

-- current_day_attendance

CREATE TABLE IF NOT EXISTS current_day_attendance(
	u_prn bigint not null,
    module varchar(10) not null,
    today_date date not null,
    lecture_attendance int not null,
    lab_attendance int not null,
    total_attended int not null,
    lecture_count int not null,
    primary key (u_prn, module)
);

-- ----------------------------------------------------------------------------------------

-- total_attendance

CREATE TABLE IF NOT EXISTS total_attendance(
	u_prn bigint not null,
    module varchar(10) not null,
    attended_lecture int not null,
    total_lecture int not null,
    PRIMARY KEY (u_prn, module)
);

-- ----------------------------------------------------------------------------------------

-- schedule_table table

CREATE TABLE IF NOT EXISTS schedule_table(
	today_date date primary key not null,
    module varchar(10) not null,
	lect_link varchar(500),
    lab_b1_link varchar(500),
    lab_b2_link varchar(500),
    lab_b3_link varchar(500),
    lab_b4_link varchar(500)
);

-- ----------------------------------------------------------------
