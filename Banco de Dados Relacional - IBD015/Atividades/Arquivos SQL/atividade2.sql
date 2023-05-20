create database `fateczl`;
use `fateczl`;

show tables;
desc `aluno`;

CREATE TABLE `aluno` (
  `idALUNO` int(11) NOT NULL,
  `nome_completo` varchar(255) DEFAULT NULL,
  `telefone` varchar(45) DEFAULT NULL,
  `genero` varchar(45) DEFAULT NULL,
  `data_nascimento` date DEFAULT NULL,
  `celular` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`idALUNO`)
); 


desc `disciplina`;
CREATE TABLE `disciplina` (
  `idDISCIPLINA` int(11) NOT NULL,
  `nome` text NOT NULL,
  `curso` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idDISCIPLINA`)
) ;

CREATE TABLE `nota`(
	`idDISCIPLINA` INT NOT NULL,
    `idALUNO` INT NOT NULL,
    `N1` FLOAT NOT NULL,
    `N2` FLOAT NOT NULL,
    `N3` FLOAT NOT NULL,
    `MF` FLOAT NOT NULL,
    FOREIGN KEY (`idDISCIPLINA`) REFERENCES `disciplina` (`idDISCIPLINA`),
    FOREIGN KEY (`idALUNO`) REFERENCES `aluno` (`idALUNO`)
);

desc `nota`;


SELECT * FROM `Aluno`;

-- INSERINDO DADOS NA TABELA PRINCIPAL: ALUNO

-- INSERT NÃO-PROCEDURAL (OU GENÉRICO, OU INSERT TOTAL)
INSERT INTO `Aluno` VALUES (2,"João Francisco","(11) 4444-1111","MASCULINO","1970-12-12", "(11) 9112-111");
 -- 1062: Valor da Chave Primária está repetido
 -- 1136: Verificar se todas os dados da colunas foram mencionados ou inclusos  
 
 -- INSERT PROCEDURAL (OU ESPECIFICO, OU PERSONALIZADO)
INSERT INTO `Aluno`(idALUNO, nome_completo) VALUES (3, 'Maria Eduarda');


-- INSERINDO DADOS NA TABELA PRINCIPAL: DISCIPLINA


-- INSERT NÃO-PROCEDURAL (OU GENÉRICO, OU INSERT TOTAL)
INSERT INTO `disciplina` VALUES (1, "Modelagem de Banco de Dados","DSM","ATIVO");


 -- INSERT PROCEDURAL (OU ESPECIFICO, OU PERSONALIZADO)
INSERT INTO `disciplina` (idDISCIPLINA, nome) VALUES (2,'Bando de Dados Relacional');

-- COMANDO PARA CONSULTAR DADOS DE FORMA GENÉRICA 
SELECT * FROM `disciplina`;

-- INSERINDO DADOS NA TABELA SECUNDÁRIA: NOTA
SELECT * FROM `nota`;

-- INSERT NÃO-PROCEDURAL (OU GENÉRICO, OU INSERT TOTAL)
INSERT INTO `nota` VALUES(1,1,6,6,6,6);

-- INSERT PROCEDURAL (OU ESPECIFICO, OU PERSONALIZADO)
INSERT INTO `nota` (idDisciplina, idAluno, mf) VALUES(1,3,6);

-- 1452: Menciona um código que não existe na Tabela Principal. Integridade Referencia seja mantida

CREATE TABLE `aluno` (
  `idALUNO` int(11) NOT NULL,
  `nome_completo` varchar(255) DEFAULT NULL,
  `telefone` varchar(45) DEFAULT NULL,
  `genero` varchar(45) DEFAULT NULL,
  `data_nascimento` date DEFAULT NULL,
  `celular` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`idALUNO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


