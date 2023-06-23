CREATE DATABASE RedesSociales;
USE RedesSociales;

CREATE TABLE Usuario
(
ID SMALLINT AUTO_INCREMENT PRIMARY KEY,
Nombre_Completo VARCHAR(100) NOT NULL,
Telefono INT UNSIGNED NOT NULL,
Correo VARCHAR (100) NOT NULL,
NomUsuario VARCHAR (20) NOT NULL,
Clave VARCHAR (15) NOT NULL
);

CREATE TABLE Publicacion
(
Id_Pub BIGINT AUTO_INCREMENT PRIMARY KEY,
Titulo VARCHAR (100) NOT NULL,
Descripcion CHAR (100) NOT NULL,
Imagen CHAR (100) NOT NULL
);



INSERT INTO Usuario (Nombre_Completo,Telefono,Correo,NomUsuario,Clave) 
VALUES ('Daniel Diaz',32165701,'danieldiaz@gmail.com','danield17',1234);


INSERT INTO Publicacion (Titulo,Descripcion,Imagen)
VALUES('Hola','Un saludo','hola.jpg');


SELECT *FROM Usuario;
