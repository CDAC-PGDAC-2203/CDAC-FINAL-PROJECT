create database cdac_app_final;
use cdac_app_final;

-- Date format YYYY-MM-DD 
create table if not exists ccat_pre(
	ccat_no bigint PRIMARY KEY NOT NULL,
    f_name varchar(25), 
	m_name varchar(25),
    l_name varchar(25),
    dob date,
    course varchar(10)
);

insert into ccat_pre values('2203001','Hardik',NULL,'Agarwal','2000-03-17','PG-DAC');
insert into ccat_pre values('2203002','Joy',NULL,'Pahari','1998-09-01','PG-DAC');
insert into ccat_pre values('2203003','Udit',NULL,'Keskar','1999-11-23','PG-DBDA');
insert into ccat_pre values('2203004','Mayank',NULL,'Sachan','1994-03-07','PG-DESC');
insert into ccat_pre values('2203005','Kamana',NULL,'Mathur','1997-07-04','PG-XYZ');
insert into ccat_pre values('1111111','admin','admin','admin','1999-01-01','PG-DAC');

-- ---------------------------------------------------------------------------------------------------------------------------------------------

-- user_table

CREATE TABLE IF NOT EXISTS user_table(
	u_id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    f_name VARCHAR(25) ,
    ccat_no BIGINT NOT NULL,
    u_role VARCHAR(10)
);

INSERT INTO user_table VALUES (1, 'Hardik', 2203001, 'Student');

-- ----------------------------------------------------------------------------------------------------------------------------------------------
-- ------------------------------------------------------------------------------------------------------
-- personal_table
-- Date format YYYY-MM-DD 
create table if not exists personal_details(u_id bigint PRIMARY KEY NOT NULL, f_name varchar(25) NOT NULL, 
m_name varchar(25), l_name varchar(25), gender varchar(1) NOT NULL, dob date NOT NULL,
email varchar(60) NOT NULL, phone bigint NOT NULL,qualification varchar(15) NOT NULL,photo blob);

insert into personal_details values('1','Hardik',NULL,'Agarwal','M','2000-03-17','hardik@gmail.com',
'8630296896','B.tech',NULL);
-- ------------------------------------------------------------------------------------------------------

-- user_address

create table if not exists user_address(u_id bigint NOT NULL Primary Key,
							add_line1 varchar(30),
                            add_line2 varchar(30),
							state varchar(20),
                            city varchar(20),
                            pincode int);
                            
insert into user_address values(1,
								'Ganesh Apartment',
                                'Kisan Nagar',
								'Uttar Pradesh',
                                'Hapur',
                                400001);
