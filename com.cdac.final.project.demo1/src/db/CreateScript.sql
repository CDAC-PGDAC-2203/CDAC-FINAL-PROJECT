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
    dob date NOT NULL,
    course varchar(10) NOT NULL
);

-- ------------------------------------------------------------------------------------------------------

-- user_table

CREATE TABLE IF NOT EXISTS user_table(
	u_id BIGINT,
    f_name VARCHAR(25),
    ccat_no BIGINT PRIMARY KEY NOT NULL,
    u_role VARCHAR(10)
);

-- ------------------------------------------------------------------------------------------------------

-- personal_details table

create table if not exists personal_details(
	u_id bigint PRIMARY KEY NOT NULL,
    ccat_no bigint,
    f_name varchar(25) NOT NULL,
    m_name varchar(25), l_name varchar(25),
    gender varchar(1) NOT NULL,
    dob date NOT NULL,
    email varchar(60) NOT NULL,
    phone bigint NOT NULL,
    qualification varchar(15) NOT NULL,
    photo longtext,
    course varchar(10) NOT NULL,
    guardian_name VARCHAR(50),
    guardian_phone BIGINT
);

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

-- ------------------------------------------------------------------------------------------------------

-- module tables

CREATE TABLE IF NOT EXISTS module_1(
	u_prn bigint primary key not null,

    lab bigint,
    assessment bigint,
    attendance bigint
);

CREATE TABLE IF NOT EXISTS module_2(
	u_prn bigint primary key not null,

    lab bigint,
    assessment bigint,
    attendance bigint
);

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

-- doubt_forum table

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

-- ------------------------------------------------------------------------------------------------------

-- total_attendance table

CREATE TABLE IF NOT EXISTS total_attendance(
	u_prn bigint not null,
    module varchar(10) not null,
    attended_lecture int not null,
    total_lecture int not null,
    PRIMARY KEY (u_prn, module)
);
INSERT INTO total_attendance VALUES(220340140001,'mod1',8,10);
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

-- ------------------------------------------------------------------------------------------------------

-- faculty table

CREATE TABLE IF NOT EXISTS faculty(
	faculty_id bigint primary key not null,
    faculty_name varchar(100),
    visibility_flag varchar(1),
    course varchar(10)
);

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

-- ------------------------------------------------------------------------------------------------------