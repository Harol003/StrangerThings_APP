CREATE DATABASE IF NOT EXISTS StrangerThings2;
USE StrangerThings2;

CREATE TABLE banda_cancion (
	nombre_cancion VARCHAR(255) NOT NULL,
	artista_cancion VARCHAR(255) NOT NULL,
      año_cancion float (4) NOT NULL,
	Episodio_Cancion INT(2) NOT NULL
);


CREATE TABLE serie_premios (
	organiza_premio VARCHAR(255) NOT NULL,
	categoria_premio VARCHAR(255) NOT NULL,
      nominado_premio VARCHAR(255) NOT NULL,
	resultado_premio VARCHAR(255) NOT NULL
);

CREATE TABLE serie_libros (
	titulo_libro VARCHAR(255) NOT NULL,
	autor_libro VARCHAR(255) NOT NULL,
      apublica_libro float (4) NOT NULL,
	editorial_libro VARCHAR (4) NOT NULL
);



CREATE TABLE info_actor2 (
	nombre_actor VARCHAR(255) NOT NULL,
	apellidos_actor VARCHAR(255) NOT NULL,
      edad_actor INT(2) NOT NULL,
	sexo_Actor CHAR NOT NULL
);

***********************************************************************
LLAVES PRIMARIAS
***********************************************************************

alter table info_actor2 add id_actor BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY;



