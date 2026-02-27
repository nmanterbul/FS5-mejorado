create table usuarios (
	id int auto_increment primary key,
    username varchar(50) not null,
    pass varchar(25) not null unique,
	rol int
);