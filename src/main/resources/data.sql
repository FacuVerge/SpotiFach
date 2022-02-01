INSERT INTO album (anio, nombre, url_portada) VALUES
    (1975, 'A Night at the Opera', 'https://i.postimg.cc/qMrqsGh4/51h786-Suy-IL-AC.jpg'),
    (2010, 'Doo-Wops & Hooligans', 'https://i.postimg.cc/XYyPn9LB/R-14424600-1574266542-1141.jpg'),
    (1983, 'Rebelion', 'https://i.postimg.cc/3wTt7VWz/R-7504492-1442851391-6280.jpg'),
    (1970, 'Let It Be', 'https://i.postimg.cc/VLNPF58Z/Let-It-Be.jpg'),
    (1982, 'Thriller', 'https://i.postimg.cc/d1znZHJK/D-NQ-NP-609579-MLA29007750572-122018-O.jpg');

INSERT INTO cancion (nombre, url_pista, id_album) VALUES
	('Love Of My Life', 'https://www.mboxdrive.com/Queen%20-%20Love%20Of%20My%20Life.mp3', 1),
    ('Runaway Baby', 'https://www.mboxdrive.com/X2Download.com%20-%20Bruno%20Mars%20-%20Runaway%20Baby%20(Official%20Audio%20Video)%20[HD]%20(128%20kbps).mp3', 2),
    ('Stop That Train', 'https://www.mboxdrive.com/stopThatTrain.mp3', 3),
    ('Let It Be', 'https://www.mboxdrive.com/The%20Beatles%20-%20Let%20It%20Be.mp3', 4),
    ('Thriller', 'https://www.mboxdrive.com/Michael%20Jackson%20-%20Thriller.mp3', 5);

INSERT INTO genero (nombre, imagen_base64) VALUES
	('Rock', 'https://i.postimg.cc/cCW7p0yH/rock.png'),
	('Pop', 'https://i.postimg.cc/N0x6qZDf/michael.png'),
	('Reggae', 'https://i.postimg.cc/dQZ9DNtn/reggae.png');

INSERT INTO artista (tipo_artista, nombre, edad, nacionalidad, id_banda) VALUES
	('Banda', 'Queen', NULL, NULL, NULL),
	('Persona', 'Bruno Mars', 36, 'Estados Unidos', NULL),
	('Persona', 'Bob Marley', NULL, 'Jamaica', NULL),
	('Persona', 'Freddy Mercury', NULL, 'Tanzania', 1),
	('Banda', 'The Beatles', NULL, NULL, NULL),
	('Persona', 'Michael Jackson', NULL, 'Estados Unidos', NULL),
	('Banda', 'UB40', NULL, NULL, NULL);

INSERT INTO album_x_artista (id_album, id_artista) VALUES
	(1, 1),
	(2, 2),
	(3, 3),
	(4, 5),
	(5, 6);

INSERT INTO cancion_x_artista (id_cancion, id_artista) VALUES
	(1, 1),
	(2, 2),
	(3, 3),
	(4, 5),
	(5, 6);

INSERT INTO cancion_x_genero (id_cancion, id_genero) VALUES
	(1, 1),
	(2, 2),
	(3, 3),
    (4, 1),
    (5, 2);
