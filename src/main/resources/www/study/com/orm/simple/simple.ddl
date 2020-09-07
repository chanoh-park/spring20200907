drop table t_simple;

-- id, name, birth_date
create table t_simple (
	id			number(10),
	name		varchar2(50),
	birth_date date,
	primary key(id)
);

insert into t_simple (id, name, birth_date) values (-10000000, '홍길동', '1500.01.01');