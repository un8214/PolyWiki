/*
 * 데이터베이스 생성용
create database polywiki;
use polywiki;
*/

create table document(
	id int not null,
	edited int,
	title varchar(50),
	content varchar(10000),
	editedtime timestamp default current_timestamp on update current_timestamp,
	author int,
	primary key (id)
);

create table users(
	id int not null AUTO_INCREMENT,
	ip varchar(100),
	username varchar(30),
	password varchar(30),
	primary key (id)
);
/* 데이터베이스 테스트용 데이터 */
insert into document(id, edited, title, content, author) value (1,0,"코딩의 신이 되는법", "코딩을 열심히 한다.",1);
insert into users(ip, username, password) value(1, "172.31.0.1", "user", "0000");
insert into users(ip) value(2, "172.31.0.1");