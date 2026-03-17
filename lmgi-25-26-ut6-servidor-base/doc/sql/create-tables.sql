CREATE TABLE usuarios (

    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    pass VARCHAR(255) NOT NULL UNIQUE,
	rol int
);

CREATE TABLE equipos(
	idEquipo INT auto_increment,
	idTorneo int,
    equipoName varchar(50) not null,
    cantidadJug int,
    cantidadPuntos int,
    posicion int,
    primary key (idEquipo)
);


CREATE TABLE jugadores(
	idJugador INT auto_increment,
    idEquipo int default 0,
    idTorneo int,
    jugadorName varchar(50) not null,
    posicion varchar(50),
    posicionGoleadores int,
    numGoles int,
    primary key(idJugador),
    constraint foreign key(idEquipo) references equipos(idEquipo) on delete set null
);

create table torneos(
	idTorneo int auto_increment,
    torneoName varchar(50),
    primary key(idTorneo)
);

create table torneo_equipo(
    idTorneo int,
    idEquipo int
);

create table partidos(
    idPartido int auto_increment,
    equipoLocal varchar(50),
    equipoVisitante varchar(50),
    golesLocal int,
    golesVisitante int,
    idJornada int,
    idTorneo int,
    primary key(idPartido)
);


