SET @@auto_increment_increment = 1;

INSERT INTO album (anio, nombre, url_portada) VALUES
    (1975, 'A Night at the Opera', 'despuesVeo'),
    (2010, 'Doo-Wops & Hooligans', 'despuesVeo'),
    (1983, 'Rebelion', 'despuesVeo');

INSERT INTO cancion (nombre, url_pista, id_album) VALUES
	('Love Of My Life', 'despuesVeo', 1),
    ('Runaway Baby', 'despuesVeo', 2),
    ('Stop That Train', 'despuesVeo', 3);

INSERT INTO genero (nombre) VALUES
	('Rock'),
	('Pop'),
	('Reggae');

INSERT INTO artista (tipo_artista, nombre, edad, nacionalidad, id_banda) VALUES
	('Banda', 'Queen', NULL, NULL, NULL),
	('Persona', 'Bruno Mars', 36, 'Estados Unidos', NULL),
	('Persona', 'Bob Marley', NULL, 'Jamaica', NULL),
	('Persona', 'Freddy Mercury', NULL, 'Tanzania', 1);

INSERT INTO album_x_artista (id_album, id_artista) VALUES
	(1, 1),
	(2, 2),
	(3, 3);

INSERT INTO cancion_x_artista (id_cancion, id_artista) VALUES
	(1, 1),
	(2, 2),
	(3, 3);

INSERT INTO cancion_x_genero (id_cancion, id_genero) VALUES
	(1, 1),
	(2, 2),
	(3, 3);