CREATE DATABASE Ragnarok;

USE Ragnarok;

CREATE TABLE Colaboradores 
(
id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
nome VARCHAR(150) NOT NULL,
email VARCHAR(50) NOT NULL,
fone VARCHAR(20) NOT NULL,
cpf VARCHAR(11) NOT NULL,
funcao VARCHAR(50) NOT NULL,
endereco VARCHAR(50) NOT NULL,
salario DECIMAL(9,2) NOT NULL,
numHoras DATETIME DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO Colaboradores (nome, email, fone, cpf, funcao, endereco, salario, numHoras)
VALUES ('Victor Men', 'victinReiDelas@gmai.com', '40028922', '44856754811', 'garoto_de_programa', 'Av. das Catiorinha', '2.00', '2022-09-05');

SELECT * FROM Colaboradores;
