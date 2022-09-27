-- ccat_student table

insert into ccat_student values('2203001','Hardik',NULL,'Agarwal','2000-03-17','PG-DAC');
insert into ccat_student values('2203002','Joy',NULL,'Pahari','1998-09-01','PG-DAC');
insert into ccat_student values('2203003','Udit',NULL,'Keskar','1999-11-23','PG-DBDA');
insert into ccat_student values('2203004','Mayank',NULL,'Sachan','1994-03-07','PG-DBDA');
insert into ccat_student values('2203005','Kamana',NULL,'Mathur','1997-07-04','PG-DESD');
insert into ccat_student values('1111111','admin','admin','admin','1999-01-01','PG-DAC');

-- --------------------------------------------------------------------------------------------

-- user_table table

INSERT INTO user_table VALUES (1, 'Hardik', 2203001, 'STUDENT');
INSERT INTO user_table VALUES (2, 'Joy', 2203002, 'STUDENT');
INSERT INTO user_table VALUES (10000, 'admin', 1111111, 'ADMIN');

-- --------------------------------------------------------------------------------------------

-- personal_details table

insert into personal_details values('1',2203001,'Hardik',NULL,'Agarwal','M','2000-03-17','hardikagarwal1703@gmail.com','8630296896','B.tech','https:\\hardik.png','PG-DAC','Mala Agarwal', '8630298749');
insert into personal_details values('2',2203002,'Joy',NULL,'Pahari','M','1998-09-01','joypahari11@gmail.com','7798003910','B.tech','https:\\joy.png','PG-DAC','SB Pahari', '7499153589');

-- --------------------------------------------------------------------------------------------
-- user_address table

INSERT INTO user_address VALUES(1,'Ganesh Apartment','Kisan Nagar','Uttar Pradesh','Hapur',400001);
INSERT INTO user_address VALUES(2,'Flat No. C/4','Navelkar Bldg, Mangoor Hill','Goa','Vasco',403802);

-- --------------------------------------------------------------------------------------------

-- user_login table
insert into user_login values(10000,'admin',11111,11111,'ADMIN','PG-DAC');
INSERT INTO user_login VALUES (1, 'Hardik', 220340120001,'220340120001','STUDENT','PG-DAC');
INSERT INTO user_login VALUES (2, 'Joy', 220340120002,'220340120001', 'STUDENT','PG-DAC');

-- --------------------------------------------------------------------------------------------

-- module tables

insert into module_1 values(220340120001,35,15,5);
insert into module_2 values(220340120001,34,15,5);
insert into module_3 values(220340120001,35,14,5);
insert into module_4 values(220340120001,36,12,5);

-- --------------------------------------------------------------------------------------------

-- final_result table

insert into final_result values(220340120001,50,40,50,40,60,null,null,null);
insert into final_result values(220340120002,60,55,50,45,40,null,null,null);

-- --------------------------------------------------------------------------------------------

-- total_attendance table

INSERT INTO total_attendance VALUES(220340120001,'mod1',8,10);
INSERT INTO total_attendance VALUES(220340120001,'mod2',7,10);
INSERT INTO total_attendance VALUES(220340120001,'mod3',2,10);
INSERT INTO total_attendance VALUES(220340120001,'mod4',4,10);

-- --------------------------------------------------------------------------------------------

-- doubt_forum table

INSERT INTO doubt_forum VALUES(1, 220340120001, 'Hardik', 'hardikagarwal1703@gmail.com', 'mod1', 'xyz', 'xyz', 'Y');
INSERT INTO doubt_forum VALUES(2, 220340120002, 'Joy', 'joypahari11@gmail.com', 'mod2', 'abc', 'abc', 'Y');
INSERT INTO doubt_forum VALUES(3, 220340120001, 'Hardik', 'hardikagarwal1703@gmail.com', 'mod2', 'abc', 'abc', 'N');
INSERT INTO doubt_forum VALUES(4, 220340120002, 'Joy', 'joypahari11@gmail.com', 'mod2', 'abc', 'abc', 'Y');

-- --------------------------------------------------------------------------------------------

-- feedback table

INSERT INTO feedback VALUES(220340120001,'PG-DAC','Madhura','mod1',2,3,5,5,5,20,'Excellent');
INSERT INTO feedback VALUES(220340120002,'PG-DAC','Madhura','mod1',3,4,5,5,5,20,'Excellent');

-- -------------------------------------------------------------------------------------------- 

-- faculty table

INSERT INTO faculty VALUES(1,'A','N','PG-DAC');
INSERT INTO faculty VALUES(2,'B','N','PG-XYZ');
INSERT INTO faculty VALUES(3,'C','N','PG-DAC');

-- --------------------------------------------------------------------------------------------

-- notice table

INSERT INTO notice VALUES('ABCD','http://link1','N');
INSERT INTO notice VALUES('EFGH','http://link2','N');
INSERT INTO notice VALUES('IJKL','http://link3','N');

-- --------------------------------------------------------------------------------------------

-- lecture_link table

INSERT INTO lecture_link VALUES(1,'PG-DAC','2022-09-27','01:00_https://meet.google.com/oed-smxz-dkb','04:00_https://meet.google.com/jqf-yrqq-aye','06:00_https://meet.google.com/pnt-difv-fum','05:00_https://meet.google.com/jqf-yrqq-aye','03:00_https://meet.google.com/pnt-difv-fum');
INSERT INTO lecture_link VALUES(2,'PG-DAC','2022-09-28','01:00_https://meet.google.com/oed-smxz-dkb','04:00_https://meet.google.com/jqf-yrqq-aye','06:00_https://meet.google.com/pnt-difv-fum','05:00_https://meet.google.com/jqf-yrqq-aye','03:00_https://meet.google.com/pnt-difv-fum');
INSERT INTO lecture_link VALUES(3,'PG-DAC','2022-09-29','01:00_https://meet.google.com/oed-smxz-dkb','04:00_https://meet.google.com/jqf-yrqq-aye','06:00_https://meet.google.com/pnt-difv-fum','05:00_https://meet.google.com/jqf-yrqq-aye','03:00_https://meet.google.com/pnt-difv-fum');