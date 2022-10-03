-- ccat_student table

insert into ccat_student values('2203001','Hardik',NULL,'Agarwal','2000-03-17','PG-DAC');
insert into ccat_student values('2203002','Joy',NULL,'Pahari','1998-09-01','PG-DAC');
insert into ccat_student values('2203003','Udit',NULL,'Keskar','1999-11-23','PG-DBDA');
insert into ccat_student values('2203004','Mayank',NULL,'Sachan','1994-03-07','PG-DBDA');
insert into ccat_student values('2203005','Kamana',NULL,'Mathur','1997-07-04','PG-DESD');
insert into ccat_student values('1111111','admin','admin','admin','1999-01-01','PG-DAC');

-- --------------------------------------------------------------------------------------------

-- user_table table

INSERT INTO user_table VALUES (10000, 'admin', 1111111, 'ADMIN');

-- --------------------------------------------------------------------------------------------

-- user_login table

insert into user_login values(10000,'admin',11111,'$2a$10$dp.US7K4f97owgHXpmwyUO1aiox8vexAFD/egkn4QHUDvqI4.NHn2','ADMIN','PG-DAC');

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

-- notice table

INSERT INTO notice VALUES('Naukri Alerts !!!','https://www.naukri.com/hiring-jobs','Y');
INSERT INTO notice VALUES('TCS Hiring!!!','https://www.tcs.com/careers/entry-level','Y');

-- --------------------------------------------------------------------------------------------

-- lecture_link table

INSERT INTO lecture_link VALUES(1,'PG-DAC','2022-09-27','01:00_https://meet.google.com/oed-smxz-dkb','04:00_https://meet.google.com/jqf-yrqq-aye','06:00_https://meet.google.com/pnt-difv-fum','05:00_https://meet.google.com/jqf-yrqq-aye','03:00_https://meet.google.com/pnt-difv-fum');
INSERT INTO lecture_link VALUES(2,'PG-DBDA','2022-09-29','08:00_https://meet.google.com/oed-smxz-dkb','14:00_https://meet.google.com/jqf-yrqq-aye','15:00_https://meet.google.com/pnt-difv-fum','16:00_https://meet.google.com/jqf-yrqq-aye','18:00_https://meet.google.com/pnt-difv-fum');
INSERT INTO lecture_link VALUES(3,'PG-DAC','2022-09-29','01:00_https://meet.google.com/oed-smxz-dkb','04:00_https://meet.google.com/jqf-yrqq-aye','06:00_https://meet.google.com/pnt-difv-fum','05:00_https://meet.google.com/jqf-yrqq-aye','03:00_https://meet.google.com/pnt-difv-fum');
