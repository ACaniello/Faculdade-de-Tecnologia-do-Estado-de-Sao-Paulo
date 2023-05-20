CREATE DATABASE `aula08`;
use `aula08`;
CREATE TABLE `cliente`(
	cod_cli int,
    nome varchar (50),
    cpf varchar (14),
    rua varchar (50),
    num varchar (5),
    bairro varchar (50),
    cidade varchar (50),
    uf varchar (2), 
    cep varchar (9),
    primary key (cod_cli)
);

desc `cliente`;
show tables;

INSERT INTO `cliente` (cod_cli, nome, cpf, rua, num, bairro, cidade, uf, cep) 
VALUES (1, 'GILBERTO', '12345678901', 'AV. ASTROUNAUTAS','133', 
'CIDADE JARDIM', 'S. J. DOS CAMPOS', 'SP', '12227-220');

INSERT INTO `cliente` (cod_cli, nome, cpf, rua, num, bairro, cidade, uf, cep) 
VALUES (2, 'GILBERTO', '12345678901', 'AV. ASTROUNAUTAS','133', 
'CIDADE JARDIM', 'S. J. DOS CAMPOS', 'SP', '12227-220');


INSERT INTO `cliente` 
VALUES (3, 'JOÃO', '12345678901', 'AV. ASTROUNAUTAS','133', 
'CIDADE JARDIM', 'S. J. DOS CAMPOS', 'SP', '12227-220');

INSERT INTO `cliente` 
VALUES ('MARIA', '12345678901', 'AV. ASTROUNAUTAS','133', 
'CIDADE JARDIM', 'S. J. DOS CAMPOS', 'SP', '12227-220');

SELECT * FROM `cliente`;

-- NÃO-PROCEDURAL OU GENÉRICO
DELETE FROM `cliente`;

-- PROCEDURAL OU NÃO-GENÉRICO
DELETE FROM `cliente` WHERE cod_cli=1;

-- NÃO-PROCEDURAL OU GENÉRICO 
UPDATE `cliente` SET nome='MARIA';

-- PROCEDURAL OU NÃO-GENÉRICO
UPDATE `cliente` 
SET nome='Maria', rua='Av.Brasil', num='148',cidade='São Paulo' 
WHERE cod_cli=2;