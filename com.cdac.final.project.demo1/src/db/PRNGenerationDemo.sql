create database projectdemo;
use projectdemo;
drop table if exists student;
create table student(
	s_id bigint not null primary key,
    f_name varchar(25) not null ,
    m_name varchar(25),
    l_name varchar(25)
);

insert into student values(1, 'kamana', null, 'mathur');
insert into student values(2, 'hardik', null, 'agarwal');
insert into student values(3, 'udit', null, 'keskar');
insert into student values(4, 'mayank', null, 'sachan');
insert into student values(5, 'joy', null, 'pahari');

-- ---------------------------------------

drop procedure if exists generate_prn
Delimiter #

create procedure generate_prn()

BEGIN

declare var_prn bigint;
declare var_start int default 1;
declare count int;

drop table if exists user_login;
create table user_login as
select s_id, f_name, m_name, l_name
from student
order by f_name, m_name, l_name;
alter table user_login add prn bigint, add u_password varchar(20), add update_id bigint auto_increment primary key;

set var_prn = 220340120001;
set count = (select count(*) from user_login);
while var_start <= count do 
-- insert into user_login (prn,u_password) values(var_prn, var_prn);
update user_login
	set prn = var_prn, u_password = var_prn
    where update_id = var_start;
set var_prn = var_prn + 1;
set var_start = var_start + 1;
end while;

END #

call generate_prn

-- to call stored procedure we will provide a button to admin,
-- on click will generate prn