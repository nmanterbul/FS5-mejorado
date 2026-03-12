

use FS5_DB;

drop table if exists usuarios;
CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    pass VARCHAR(255) NOT NULL UNIQUE,
	rol int
);

insert into usuarios(username,pass,rol) values ("asier","asier",1);
insert into usuarios(username,pass,rol) values ("nahia","nahia",1);
insert into usuarios(username,pass,rol) values ("adri","adri",1);

drop table if exists equipos;

CREATE TABLE equipos(
	idEquipo INT,
    idTorneo int,
    equipoName varchar(50) not null,
    cantidadJug int,
    cantidadPuntos int,
    posicion int,
    primary key (idEquipo) 
);


drop table if exists jugadores;

CREATE TABLE jugadores(
	idJugador INT,
    idEquipo int,
    idTorneo int,
    jugadorName varchar(50) not null,
    posicion varchar(50),
    primary key(idJugador)
);

drop table if exists torneos;

create table torneos(
	idTorneo varchar(30),
    idEquipo varchar(50),
    torneoName varchar(50)
);
drop table if exists partidos;
create table partidos(
    idPartido int,
    equipoLocal varchar(50),
    equipoVisitante varchar(50),
    golesLocal int,
    golesVisitante int,
    idJornada int,
    idTorneo int,
    primary key(idPartido)
);



INSERT INTO torneos (idTorneo,idEquipo, torneoName) VALUES
(1,1,'1 Division'),
(1,2,'1 Division'),
(1,3,'1 Division'),
(1,4,'1 Division'),
(1,5,'1 Division'),
(1,6,'1 Division'),
(1,7,'1 Division'),
(1,8,'1 Division'),
(1,9,'1 Division'),
(1,10,'1 Division'),
(1,11,'1 Division'),
(1,12,'1 Division'),
(1,13,'1 Division'),
(1,14,'1 Division'),
(1,15,'1 Division'),
(1,16,'1 Division'),

(2,1,'2 Division');

-- Jornada 1
INSERT INTO partidos (idPartido, equipoLocal, equipoVisitante, golesLocal, golesVisitante, idJornada, idTorneo) VALUES
(1, 'Movistar Inter', 'ElPozo Murcia', 3, 2, 1, 1),
(2, 'Palma Futsal', 'Jaén Paraíso Interior FS', 1, 1, 1, 1),
(3, 'Peñíscola FS', 'FC Barcelona', 2, 4, 1, 1),
(4, 'Jimbee Cartagena', 'Industrias Santa Coloma', 3, 3, 1, 1),
(5, 'Xota FS', 'Mañanes FS', 0, 1, 1, 1),
(6, 'Córdoba Patrimonio de la Humanidad', 'Burela FS', 4, 2, 1, 1),
(7, 'Ribera Navarra FS', 'Viña Albali Valdepeñas', 1, 0, 1, 1),
(8, 'Noia Portus Apostoli', 'Sala 10 Zaragoza', 2, 2, 1, 1);

-- Jornada 2
INSERT INTO partidos (idPartido, equipoLocal, equipoVisitante, golesLocal, golesVisitante, idJornada, idTorneo) VALUES
(9, 'ElPozo Murcia', 'Palma Futsal', 2, 2, 2, 1),
(10, 'Jaén Paraíso Interior FS', 'Peñíscola FS', 0, 3, 2, 1),
(11, 'FC Barcelona', 'Jimbee Cartagena', 5, 1, 2, 1),
(12, 'Industrias Santa Coloma', 'Xota FS', 2, 2, 2, 1),
(13, 'Mañanes FS', 'Córdoba Patrimonio de la Humanidad', 1, 4, 2, 1),
(14, 'Burela FS', 'Ribera Navarra FS', 2, 3, 2, 1),
(15, 'Viña Albali Valdepeñas', 'Noia Portus Apostoli', 1, 1, 2, 1),
(16, 'Sala 10 Zaragoza', 'Movistar Inter', 0, 3, 2, 1);

-- Jornada 3
INSERT INTO partidos (idPartido, equipoLocal, equipoVisitante, golesLocal, golesVisitante, idJornada, idTorneo) VALUES
(17, 'Movistar Inter', 'Palma Futsal', 3, 1, 3, 1),
(18, 'ElPozo Murcia', 'Jaén Paraíso Interior FS', 1, 0, 3, 1),
(19, 'Peñíscola FS', 'Jimbee Cartagena', 2, 2, 3, 1),
(20, 'FC Barcelona', 'Industrias Santa Coloma', 4, 0, 3, 1),
(21, 'Xota FS', 'Mañanes FS', 1, 1, 3, 1),
(22, 'Córdoba Patrimonio de la Humanidad', 'Ribera Navarra FS', 0, 2, 3, 1),
(23, 'Burela FS', 'Viña Albali Valdepeñas', 1, 1, 3, 1),
(24, 'Noia Portus Apostoli', 'Sala 10 Zaragoza', 3, 2, 3, 1);

-- Jornada 4
INSERT INTO partidos (idPartido, equipoLocal, equipoVisitante, golesLocal, golesVisitante, idJornada, idTorneo) VALUES
(25, 'Jaén Paraíso Interior FS', 'Movistar Inter', 0, 4, 4, 1),
(26, 'Palma Futsal', 'ElPozo Murcia', 2, 3, 4, 1),
(27, 'Jimbee Cartagena', 'Peñíscola FS', 1, 1, 4, 1),
(28, 'Industrias Santa Coloma', 'FC Barcelona', 0, 3, 4, 1),
(29, 'Mañanes FS', 'Xota FS', 2, 0, 4, 1),
(30, 'Ribera Navarra FS', 'Córdoba Patrimonio de la Humanidad', 3, 3, 4, 1),
(31, 'Viña Albali Valdepeñas', 'Burela FS', 2, 2, 4, 1),
(32, 'Sala 10 Zaragoza', 'Noia Portus Apostoli', 1, 2, 4, 1);

-- Jornada 5
INSERT INTO partidos (idPartido, equipoLocal, equipoVisitante, golesLocal, golesVisitante, idJornada, idTorneo) VALUES
(33, 'Movistar Inter', 'Peñíscola FS', 5, 1, 5, 1),
(34, 'ElPozo Murcia', 'Jimbee Cartagena', 2, 4, 5, 1),
(35, 'Palma Futsal', 'Industrias Santa Coloma', 3, 0, 5, 1),
(36, 'Jaén Paraíso Interior FS', 'Mañanes FS', 1, 1, 5, 1),
(37, 'FC Barcelona', 'Ribera Navarra FS', 2, 2, 5, 1),
(38, 'Xota FS', 'Viña Albali Valdepeñas', 0, 2, 5, 1),
(39, 'Córdoba Patrimonio de la Humanidad', 'Noia Portus Apostoli', 3, 1, 5, 1),
(40, 'Burela FS', 'Sala 10 Zaragoza', 1, 3, 5, 1);

-- Jornada 6
INSERT INTO partidos (idPartido, equipoLocal, equipoVisitante, golesLocal, golesVisitante, idJornada, idTorneo) VALUES
(41, 'Jimbee Cartagena', 'Movistar Inter', 1, 6, 6, 1),
(42, 'Industrias Santa Coloma', 'ElPozo Murcia', 2, 3, 6, 1),
(43, 'Mañanes FS', 'Palma Futsal', 1, 4, 6, 1),
(44, 'Ribera Navarra FS', 'Jaén Paraíso Interior FS', 2, 1, 6, 1),
(45, 'Viña Albali Valdepeñas', 'FC Barcelona', 0, 0, 6, 1),
(46, 'Noia Portus Apostoli', 'Xota FS', 2, 3, 6, 1),
(47, 'Sala 10 Zaragoza', 'Córdoba Patrimonio de la Humanidad', 1, 2, 6, 1),
(48, 'Burela FS', 'Peñíscola FS', 3, 3, 6, 1);

-- Jornada 7
INSERT INTO partidos (idPartido, equipoLocal, equipoVisitante, golesLocal, golesVisitante, idJornada, idTorneo) VALUES
(49, 'Movistar Inter', 'Jaén Paraíso Interior FS', 4, 1, 7, 1),
(50, 'ElPozo Murcia', 'Palma Futsal', 2, 2, 7, 1),
(51, 'Peñíscola FS', 'Jimbee Cartagena', 1, 5, 7, 1),
(52, 'FC Barcelona', 'Industrias Santa Coloma', 3, 1, 7, 1),
(53, 'Xota FS', 'Mañanes FS', 2, 0, 7, 1),
(54, 'Córdoba Patrimonio de la Humanidad', 'Ribera Navarra FS', 1, 3, 7, 1),
(55, 'Burela FS', 'Viña Albali Valdepeñas', 2, 2, 7, 1),
(56, 'Noia Portus Apostoli', 'Sala 10 Zaragoza', 1, 1, 7, 1);

-- Jornada 8
INSERT INTO partidos (idPartido, equipoLocal, equipoVisitante, golesLocal, golesVisitante, idJornada, idTorneo) VALUES
(57, 'Jaén Paraíso Interior FS', 'ElPozo Murcia', 0, 2, 8, 1),
(58, 'Palma Futsal', 'Peñíscola FS', 3, 1, 8, 1),
(59, 'Jimbee Cartagena', 'FC Barcelona', 1, 4, 8, 1),
(60, 'Industrias Santa Coloma', 'Xota FS', 0, 2, 8, 1),
(61, 'Mañanes FS', 'Córdoba Patrimonio de la Humanidad', 1, 3, 8, 1),
(62, 'Ribera Navarra FS', 'Burela FS', 2, 2, 8, 1),
(63, 'Viña Albali Valdepeñas', 'Noia Portus Apostoli', 1, 1, 8, 1),
(64, 'Sala 10 Zaragoza', 'Movistar Inter', 0, 3, 8, 1);

-- Jornada 9
INSERT INTO partidos (idPartido, equipoLocal, equipoVisitante, golesLocal, golesVisitante, idJornada, idTorneo) VALUES
(65, 'Movistar Inter', 'Ribera Navarra FS', 5, 0, 9, 1),
(66, 'ElPozo Murcia', 'Burela FS', 2, 1, 9, 1),
(67, 'Palma Futsal', 'Viña Albali Valdepeñas', 3, 2, 9, 1),
(68, 'Jaén Paraíso Interior FS', 'Noia Portus Apostoli', 1, 1, 9, 1),
(69, 'Peñíscola FS', 'Sala 10 Zaragoza', 2, 3, 9, 1),
(70, 'Jimbee Cartagena', 'Mañanes FS', 4, 0, 9, 1),
(71, 'Industrias Santa Coloma', 'Córdoba Patrimonio de la Humanidad', 1, 2, 9, 1),
(72, 'Xota FS', 'FC Barcelona', 0, 4, 9, 1);

-- Jornada 10
INSERT INTO partidos (idPartido, equipoLocal, equipoVisitante, golesLocal, golesVisitante, idJornada, idTorneo) VALUES
(73, 'Mañanes FS', 'ElPozo Murcia', 1, 3, 10, 1),
(74, 'Córdoba Patrimonio de la Humanidad', 'Palma Futsal', 2, 2, 10, 1),
(75, 'Burela FS', 'Jaén Paraíso Interior FS', 1, 1, 10, 1),
(76, 'Ribera Navarra FS', 'Jimbee Cartagena', 3, 3, 10, 1),
(77, 'Viña Albali Valdepeñas', 'Peñíscola FS', 2, 0, 10, 1),
(78, 'Noia Portus Apostoli', 'Industrias Santa Coloma', 1, 3, 10, 1),
(79, 'Sala 10 Zaragoza', 'Xota FS', 2, 2, 10, 1),
(80, 'FC Barcelona', 'Movistar Inter', 1, 5, 10, 1);

-- INSERTS para equipos
INSERT INTO equipos (idEquipo, idTorneo, equipoName, cantidadJug) VALUES
(1,1, 'Movistar Inter', 12),
(2,1, 'ElPozo Murcia', 12),
(3,1, 'Palma Futsal', 12),
(4,1, 'Jaén Paraíso Interior FS', 12),
(5,1, 'Peñíscola FS', 12),
(6,1, 'FC Barcelona', 12),
(7,1, 'Jimbee Cartagena', 12),
(8,1, 'Industrias Santa Coloma', 12),
(9,1, 'Xota FS', 12),
(10,1, 'Mañanes FS', 12),
(11,1, 'Córdoba Patrimonio de la Humanidad', 12),
(12,1, 'Burela FS', 12),
(13,1, 'Ribera Navarra FS', 12),
(14,1, 'Viña Albali Valdepeñas', 12),
(15,1, 'Noia Portus Apostoli', 12),
(16,1, 'Sala 10 Zaragoza', 12);

UPDATE equipos SET cantidadPuntos = 28, posicion = 1 WHERE equipoName = 'Movistar Inter' AND idTorneo = 1;
UPDATE equipos SET cantidadPuntos = 23, posicion = 2 WHERE equipoName = 'FC Barcelona' AND idTorneo = 1;
UPDATE equipos SET cantidadPuntos = 16, posicion = 3 WHERE equipoName = 'Jimbee Cartagena' AND idTorneo = 1;
UPDATE equipos SET cantidadPuntos = 14, posicion = 4 WHERE equipoName = 'Ribera Navarra FS' AND idTorneo = 1;
UPDATE equipos SET cantidadPuntos = 14, posicion = 5 WHERE equipoName = 'Córdoba Patrimonio de la Humanidad' AND idTorneo = 1;
UPDATE equipos SET cantidadPuntos = 14, posicion = 6 WHERE equipoName = 'Palma Futsal' AND idTorneo = 1;
UPDATE equipos SET cantidadPuntos = 13, posicion = 7 WHERE equipoName = 'Peñíscola FS' AND idTorneo = 1;
UPDATE equipos SET cantidadPuntos = 12, posicion = 8 WHERE equipoName = 'Viña Albali Valdepeñas' AND idTorneo = 1;
UPDATE equipos SET cantidadPuntos = 9, posicion = 9 WHERE equipoName = 'Noia Portus Apostoli' AND idTorneo = 1;
UPDATE equipos SET cantidadPuntos = 8, posicion = 10 WHERE equipoName = 'Jaén Paraíso Interior FS' AND idTorneo = 1;
UPDATE equipos SET cantidadPuntos = 8, posicion = 11 WHERE equipoName = 'Industrias Santa Coloma' AND idTorneo = 1;
UPDATE equipos SET cantidadPuntos = 8, posicion = 12 WHERE equipoName = 'Burela FS' AND idTorneo = 1;
UPDATE equipos SET cantidadPuntos = 7, posicion = 13 WHERE equipoName = 'ElPozo Murcia' AND idTorneo = 1;
UPDATE equipos SET cantidadPuntos = 7, posicion = 14 WHERE equipoName = 'Sala 10 Zaragoza' AND idTorneo = 1;
UPDATE equipos SET cantidadPuntos = 5, posicion = 15 WHERE equipoName = 'Mañanes FS' AND idTorneo = 1;
UPDATE equipos SET cantidadPuntos = 5, posicion = 16 WHERE equipoName = 'Xota FS' AND idTorneo = 1;

-- INSERTS para jugadores (asociados a los equipos)
-- Movistar Inter
-- FC Barcelona
INSERT INTO jugadores (idJugador, idEquipo, idTorneo, jugadorName, posicion) VALUES
(1, 1, 1, 'Álex Merlim', 'Portero'),
(2, 1, 1, 'Sergio Lozano', 'Cierre'),
(3, 1, 1, 'Ferrao', 'Ala'),
(4, 1, 1, 'Adolfo', 'Pivot'),
(5, 1, 1, 'Esquerdinha', 'Ala Pivot'),
(6, 1, 1, 'Juanjo', 'Portero'),
(7, 1, 1, 'Batería', 'Cierre'),
(8, 1, 1, 'Pito', 'Ala'),
(9, 1, 1, 'Aicardo', 'Pivot'),
(10, 1, 1, 'Boyis', 'Ala Pivot'),
(11, 1, 1, 'Herrero', 'Portero'),
(12, 1, 1, 'Roger', 'Cierre');

-- ElPozo Murcia
INSERT INTO jugadores (idJugador, idEquipo, idTorneo, jugadorName, posicion) VALUES
(13, 2, 1, 'Paniagua', 'Portero'),
(14, 2, 1, 'Mario Rivillos', 'Cierre'),
(15, 2, 1, 'Álex García', 'Ala'),
(16, 2, 1, 'Carlos Barrón', 'Pivot'),
(17, 2, 1, 'Julio García', 'Ala Pivot'),
(18, 2, 1, 'Marín', 'Portero'),
(19, 2, 1, 'Nacho Gadea', 'Cierre'),
(20, 2, 1, 'Bebe', 'Ala'),
(21, 2, 1, 'Mati Rosa', 'Pivot'),
(22, 2, 1, 'Álex Redondo', 'Ala Pivot'),
(23, 2, 1, 'Chemi', 'Portero'),
(24, 2, 1, 'Miguelín', 'Cierre');

-- Palma Futsal
INSERT INTO jugadores (idJugador, idEquipo, idTorneo, jugadorName, posicion) VALUES
(25, 3, 1, 'Rafa Usín', 'Portero'),
(26, 3, 1, 'Marcao', 'Cierre'),
(27, 3, 1, 'Boyis', 'Ala'),
(28, 3, 1, 'Álex', 'Pivot'),
(29, 3, 1, 'Corso', 'Ala Pivot'),
(30, 3, 1, 'Javi Matilla', 'Portero'),
(31, 3, 1, 'Pitu', 'Cierre'),
(32, 3, 1, 'Pablo', 'Ala'),
(33, 3, 1, 'Juanillo', 'Pivot'),
(34, 3, 1, 'Mati', 'Ala Pivot'),
(35, 3, 1, 'Bebe', 'Portero'),
(36, 3, 1, 'Migue', 'Cierre');

-- Jaén Paraíso Interior FS
INSERT INTO jugadores (idJugador, idEquipo, idTorneo, jugadorName, posicion) VALUES
(37, 4, 1, 'Juan Carlos', 'Portero'),
(38, 4, 1, 'Fernandinho', 'Cierre'),
(39, 4, 1, 'Javi Alonso', 'Ala'),
(40, 4, 1, 'Alan Brandi', 'Pivot'),
(41, 4, 1, 'Diego', 'Ala Pivot'),
(42, 4, 1, 'Juanlu', 'Portero'),
(43, 4, 1, 'Edu', 'Cierre'),
(44, 4, 1, 'José Ruiz', 'Ala'),
(45, 4, 1, 'Andresito', 'Pivot'),
(46, 4, 1, 'Rafa', 'Ala Pivot'),
(47, 4, 1, 'Chino', 'Portero'),
(48, 4, 1, 'Kike', 'Cierre');

-- Peñíscola FS
INSERT INTO jugadores (idJugador, idEquipo, idTorneo, jugadorName, posicion) VALUES
(49, 5, 1, 'Juanjo', 'Portero'),
(50, 5, 1, 'Javi Alonso', 'Cierre'),
(51, 5, 1, 'Pitu', 'Ala'),
(52, 5, 1, 'Chino', 'Pivot'),
(53, 5, 1, 'Álex', 'Ala Pivot'),
(54, 5, 1, 'Javi Sánchez', 'Portero'),
(55, 5, 1, 'Diego', 'Cierre'),
(56, 5, 1, 'José Ruiz', 'Ala'),
(57, 5, 1, 'Mati Rosa', 'Pivot'),
(58, 5, 1, 'Bebe', 'Ala Pivot'),
(59, 5, 1, 'Herrero', 'Portero'),
(60, 5, 1, 'Roger', 'Cierre');

-- Jimbee Cartagena
INSERT INTO jugadores (idJugador, idEquipo, idTorneo, jugadorName, posicion) VALUES
(61, 6, 1, 'Juanillo', 'Portero'),
(62, 6, 1, 'Nacho Gadea', 'Cierre'),
(63, 6, 1, 'Javi Matilla', 'Ala'),
(64, 6, 1, 'Álex Merlim', 'Pivot'),
(65, 6, 1, 'Esquerdinha', 'Ala Pivot'),
(66, 6, 1, 'Juanjo', 'Portero'),
(67, 6, 1, 'Batería', 'Cierre'),
(68, 6, 1, 'Pito', 'Ala'),
(69, 6, 1, 'Ferrao', 'Pivot'),
(70, 6, 1, 'Boyis', 'Ala Pivot'),
(71, 6, 1, 'Herrero', 'Portero'),
(72, 6, 1, 'Roger', 'Cierre');

-- Industrias Santa Coloma
INSERT INTO jugadores (idJugador, idEquipo, idTorneo, jugadorName, posicion) VALUES
(73, 7, 1, 'Chemi', 'Portero'),
(74, 7, 1, 'Mario Rivillos', 'Cierre'),
(75, 7, 1, 'Álex García', 'Ala'),
(76, 7, 1, 'Carlos Barrón', 'Pivot'),
(77, 7, 1, 'Julio García', 'Ala Pivot'),
(78, 7, 1, 'Marín', 'Portero'),
(79, 7, 1, 'Nacho Gadea', 'Cierre'),
(80, 7, 1, 'Bebe', 'Ala'),
(81, 7, 1, 'Mati Rosa', 'Pivot'),
(82, 7, 1, 'Álex Redondo', 'Ala Pivot'),
(83, 7, 1, 'Chemi', 'Portero'),
(84, 7, 1, 'Miguelín', 'Cierre');

-- Xota FS
INSERT INTO jugadores (idJugador, idEquipo, idTorneo, jugadorName, posicion) VALUES
(85, 8, 1, 'Pitu', 'Portero'),
(86, 8, 1, 'Javi Sánchez', 'Cierre'),
(87, 8, 1, 'Alan Brandi', 'Ala'),
(88, 8, 1, 'Juanlu', 'Pivot'),
(89, 8, 1, 'Kike', 'Ala Pivot'),
(90, 8, 1, 'Juanillo', 'Portero'),
(91, 8, 1, 'Nacho Gadea', 'Cierre'),
(92, 8, 1, 'Javi Matilla', 'Ala'),
(93, 8, 1, 'Álex Merlim', 'Pivot'),
(94, 8, 1, 'Esquerdinha', 'Ala Pivot'),
(95, 8, 1, 'Juanjo', 'Portero'),
(96, 8, 1, 'Batería', 'Cierre');

-- Mañanes FS
INSERT INTO jugadores (idJugador, idEquipo, idTorneo, jugadorName, posicion) VALUES
(97, 9, 1, 'Pito', 'Portero'),
(98, 9, 1, 'Sergio Lozano', 'Cierre'),
(99, 9, 1, 'Ferrao', 'Ala'),
(100, 9, 1, 'Adolfo', 'Pivot'),
(101, 9, 1, 'Esquerdinha', 'Ala Pivot'),
(102, 9, 1, 'Juanjo', 'Portero'),
(103, 9, 1, 'Batería', 'Cierre'),
(104, 9, 1, 'Pito', 'Ala'),
(105, 9, 1, 'Aicardo', 'Pivot'),
(106, 9, 1, 'Boyis', 'Ala Pivot'),
(107, 9, 1, 'Herrero', 'Portero'),
(108, 9, 1, 'Roger', 'Cierre');

-- Córdoba Patrimonio de la Humanidad
INSERT INTO jugadores (idJugador, idEquipo, idTorneo, jugadorName, posicion) VALUES
(109, 10, 1, 'Juan Carlos', 'Portero'),
(110, 10, 1, 'Fernandinho', 'Cierre'),
(111, 10, 1, 'Javi Alonso', 'Ala'),
(112, 10, 1, 'Alan Brandi', 'Pivot'),
(113, 10, 1, 'Diego', 'Ala Pivot'),
(114, 10, 1, 'Juanlu', 'Portero'),
(115, 10, 1, 'Edu', 'Cierre'),
(116, 10, 1, 'José Ruiz', 'Ala'),
(117, 10, 1, 'Andresito', 'Pivot'),
(118, 10, 1, 'Rafa', 'Ala Pivot'),
(119, 10, 1, 'Chino', 'Portero'),
(120, 10, 1, 'Kike', 'Cierre');

-- Burela FS
INSERT INTO jugadores (idJugador, idEquipo, idTorneo, jugadorName, posicion) VALUES
(121, 11, 1, 'Juanjo', 'Portero'),
(122, 11, 1, 'Javi Alonso', 'Cierre'),
(123, 11, 1, 'Pitu', 'Ala'),
(124, 11, 1, 'Chino', 'Pivot'),
(125, 11, 1, 'Álex', 'Ala Pivot'),
(126, 11, 1, 'Javi Sánchez', 'Portero'),
(127, 11, 1, 'Diego', 'Cierre'),
(128, 11, 1, 'José Ruiz', 'Ala'),
(129, 11, 1, 'Mati Rosa', 'Pivot'),
(130, 11, 1, 'Bebe', 'Ala Pivot'),
(131, 11, 1, 'Herrero', 'Portero'),
(132, 11, 1, 'Roger', 'Cierre');

-- Ribera Navarra FS
INSERT INTO jugadores (idJugador, idEquipo, idTorneo, jugadorName, posicion) VALUES
(133, 12, 1, 'Chemi', 'Portero'),
(134, 12, 1, 'Mario Rivillos', 'Cierre'),
(135, 12, 1, 'Álex García', 'Ala'),
(136, 12, 1, 'Carlos Barrón', 'Pivot'),
(137, 12, 1, 'Julio García', 'Ala Pivot'),
(138, 12, 1, 'Marín', 'Portero'),
(139, 12, 1, 'Nacho Gadea', 'Cierre'),
(140, 12, 1, 'Bebe', 'Ala'),
(141, 12, 1, 'Mati Rosa', 'Pivot'),
(142, 12, 1, 'Álex Redondo', 'Ala Pivot'),
(143, 12, 1, 'Chemi', 'Portero'),
(144, 12, 1, 'Miguelín', 'Cierre');

-- Viña Albali Valdepeñas
INSERT INTO jugadores (idJugador, idEquipo, idTorneo, jugadorName, posicion) VALUES
(145, 13, 1, 'Pitu', 'Portero'),
(146, 13, 1, 'Javi Sánchez', 'Cierre'),
(147, 13, 1, 'Alan Brandi', 'Ala'),
(148, 13, 1, 'Juanlu', 'Pivot'),
(149, 13, 1, 'Kike', 'Ala Pivot'),
(150, 13, 1, 'Juanillo', 'Portero'),
(151, 13, 1, 'Nacho Gadea', 'Cierre'),
(152, 13, 1, 'Javi Matilla', 'Ala'),
(153, 13, 1, 'Álex Merlim', 'Pivot'),
(154, 13, 1, 'Esquerdinha', 'Ala Pivot'),
(155, 13, 1, 'Juanjo', 'Portero'),
(156, 13, 1, 'Batería', 'Cierre');

-- Noia Portus Apostoli
INSERT INTO jugadores (idJugador, idEquipo, idTorneo, jugadorName, posicion) VALUES
(157, 14, 1, 'Pito', 'Portero'),
(158, 14, 1, 'Sergio Lozano', 'Cierre'),
(159, 14, 1, 'Ferrao', 'Ala'),
(160, 14, 1, 'Adolfo', 'Pivot'),
(161, 14, 1, 'Esquerdinha', 'Ala Pivot'),
(162, 14, 1, 'Juanjo', 'Portero'),
(163, 14, 1, 'Batería', 'Cierre'),
(164, 14, 1, 'Pito', 'Ala'),
(165, 14, 1, 'Aicardo', 'Pivot'),
(166, 14, 1, 'Boyis', 'Ala Pivot'),
(167, 14, 1, 'Herrero', 'Portero'),
(168, 14, 1, 'Roger', 'Cierre');

-- Sala 10 Zaragoza
INSERT INTO jugadores (idJugador, idEquipo, idTorneo, jugadorName, posicion) VALUES
(169, 15, 1, 'Juan Carlos', 'Portero'),
(170, 15, 1, 'Fernandinho', 'Cierre'),
(171, 15, 1, 'Javi Alonso', 'Ala'),
(172, 15, 1, 'Alan Brandi', 'Pivot'),
(173, 15, 1, 'Diego', 'Ala Pivot'),
(174, 15, 1, 'Juanlu', 'Portero'),
(175, 15, 1, 'Edu', 'Cierre'),
(176, 15, 1, 'José Ruiz', 'Ala'),
(177, 15, 1, 'Andresito', 'Pivot'),
(178, 15, 1, 'Rafa', 'Ala Pivot'),
(179, 15, 1, 'Chino', 'Portero'),
(180, 15, 1, 'Kike', 'Cierre');





