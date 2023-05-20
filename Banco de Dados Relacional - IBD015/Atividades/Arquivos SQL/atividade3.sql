CREATE SCHEMA `oficina_mecanica`;
-- drop database `oficina_mecaninca`

USE `oficina_mecanica`;

CREATE TABLE CLIENTE (
	cpf int primary key auto_increment,
    nome varchar (255),
    endereco varchar (255) not null DEFAULT "Sem Estado",
    uf enum('SP','RJ', 'ES', 'MG', 'CE', 'PI'),
    telefone varchar (11)
);

DESC CLIENTE;

CREATE TABLE PRODUTO (
	id int primary key,
    descricao varchar (255),
    custo float (5,2)
);

DESC PRODUTO;
-- DROP TABLE SERVIÇO;
CREATE TABLE SERVICO (
	id_servico int primary key,
	descricao varchar (255),
    custo float (5,2),
    tempo_realiza time
);


DESC SERVIÇO;

CREATE TABLE VEICULO (
    renavan int primary key auto_increment,
    chassi varchar (50),
    cor varchar (100),
    modelo varchar (100),
    cpf int, 
    FOREIGN KEY (cpf) REFERENCES CLIENTE (cpf)
);

DESC  VEICULO;

CREATE TABLE RELATO_CLIENTE (
	id_relato int primary key,
    data_relato date, 
    problema longtext,
    id_veiculo int, 
    FOREIGN KEY (id_veiculo) REFERENCES VEICULO (renavan)
);

DESC RELATO_CLIENTE;

CREATE TABLE ORCAMENTO (
	id int primary key,
    valor float (5,2),
    data_realizao date,
    prev_entrega date, 
    situacao varchar (50), 
    forma_pagamento varchar (100),
	id_veiculo int,
    FOREIGN KEY (id_veiculo) REFERENCES VEICULO (renavan)
);

DESC ORCAMENTO;

CREATE TABLE ITEM_PRODUTO (
	id_orcamento int,
    id_produto int, 
    custo float (5,2),
    quantidade int,
    situacao varchar (50),
    FOREIGN KEY (id_orcamento) REFERENCES ORCAMENTO (id),
    FOREIGN KEY (id_produto) REFERENCES PRODUTO (id)
);

DESC ITEM_PRODUTO;

CREATE TABLE ITEM_SERVICO (
   id_orcamento int, 
   id_servico int, 
   custo float (5,2),
   situacao varchar (50),
   FOREIGN KEY (id_orcamento) REFERENCES ORCAMENTO (id),
   FOREIGN KEY (id_servico) REFERENCES SERVICO (id_servico)
);

DESC ITEM_SERVICO;
SHOW TABLES;

 -- REMOVENDO TABELAS DA MAIS FRACA ATÉ A MAIS FORTE
 
DROP TABLE ITEM_PRODUTO;
DROP TABLE ITEM_SERVICO;
DROP TABLE ORCAMENTO;
DROP TABLE RELATO_CLIENTE;
DROP TABLE VEICULO;
DROP TABLE CLIENTE;
DROP TABLE SERVICO;
DROP TABLE PRODUTO;

-- ALTERAR Coluna Nome para Nome Completo da Tabela Cliente 
alter table CLIENTE 
	change column nome nome_completo varchar(255);

-- ADICIONANDO Coluna Ano na Table Veiculo
alter table VEICULO
 add column ano year;

-- DML NÃO PROCEDURAL (OU GENÉRICO)
INSERT INTO CLIENTE VALUES (111222, "Gilberto Santos", "Rua ABC, Itaquera, SP", "119111");

-- DML PROCEDURAL (OU NÃO GENÉRICO)
INSERT INTO CLIENTE (nome, uf) VALUES ( "José Augusto", "SP");

INSERT INTO CLIENTE (nome, endereco) VALUES (222111, "Maria Eduarda", "Rua ABC, Itaquera, SP");


INSERT INTO VEICULO (modelo, cpf) VALUES ("FIAT", 1);
INSERT INTO VEICULO (modelo, cpf) VALUES ("VW", 4);


SELECT * FROM CLIENTE;
SELECT * FROM VEICULO;