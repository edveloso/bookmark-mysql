create database book;

use book;

create table bookmark(
	id int primary key auto_increment,
    usuario varchar(35),
    url varchar(100),
	descricao varchar(100)    
);