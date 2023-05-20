USE fatec_zl;

INSERT INTO aluno VALUES(8,NULL,20,"M",6.00);
INSERT INTO aluno VALUES(2,"Maria",21,"F",7.00);
INSERT INTO aluno VALUES(3,"Joaquim",22,"I",5.00);

-- Não Procedural (ou Genérico)
--  * representa todas as colunas

SELECT * FROM aluno;

-- Procedural (ou Não Genérico) 
SELECT idaluno, nome,idade FROM aluno WHERE idaluno=1;

 -- Testando Operadores
SELECT idaluno, nome,idade FROM aluno WHERE idaluno>1;
SELECT idaluno, nome,idade FROM aluno WHERE idaluno<1;
SELECT idaluno, nome,idade FROM aluno WHERE idaluno<>1;
SELECT idaluno, nome,idade FROM aluno WHERE idaluno>=1;
SELECT idaluno, nome,idade FROM aluno WHERE idaluno<=1;

-- Testando Operdores Booleanos 
SELECT idaluno, nome,idade FROM aluno WHERE idaluno>=0 AND idaluno<=2;
SELECT idaluno, nome,idade FROM aluno WHERE idaluno=0 OR idaluno<=2;

--  Testando Like Binary 
INSERT INTO aluno VALUES(4,"João Maria",20,"M",6.00);
INSERT INTO aluno VALUES(5,"Lucas João",20,"M",6.00);
INSERT INTO aluno VALUES(6,"Antonio Fagundes João",20,"M",6.00);

 -- SELECIONA TUDO QUE INICIA COM JOÃO
SELECT idaluno, nome,idade FROM aluno WHERE nome like binary "João%";

-- SELECIONA TUDO QUE HÁ JOÃO APÓS UM CARACTER
SELECT idaluno, nome,idade FROM aluno WHERE nome like binary "% João";

-- SELECIONA TUDO QUE HÁ JOÃO (NÃO IMPORTA A ORDEM)
SELECT idaluno, nome,idade FROM aluno WHERE nome like binary "%João%";


-- TESTANDO O COMANDO LIKE

SELECT idaluno, nome,idade FROM aluno WHERE nome like "João";

-- TESTANDO O COMANDO IN

SELECT idaluno, nome,idade FROM aluno WHERE nome in ("João", "Maria");

-- TESTANDO O COMANDO BETWEEN 
SELECT idaluno, nome,idade, media FROM aluno 
WHERE media between 3.0 and 6.0;

-- TESTANDO FUNÇÕES AGREGADAS

SELECT SUM(media) FROM aluno;
SELECT count(media) FROM aluno;
SELECT MAX(media) from aluno;
SELECT MIN(media) from aluno;
SELECT AVG(media) from aluno;

SELECT SUM(media) FROM aluno group by media;
SELECT AVG(media) FROM aluno group by media;

SELECT sexo,AVG(media) FROM aluno group by sexo,media;

SELECT sexo,AVG(media) FROM aluno group by sexo,media 
HAVING AVG(MEDIA)=5;

-- TESTANDO DISTINCT
SELECT DISTINCT nome from aluno;

-- TESTANDO NOW()
SELECT NOW();

-- TESTANDO NOT/NULL
SELECT * FROM ALUNO WHERE nome is not null;
SELECT * FROM ALUNO WHERE nome is null;

SELECT lower(nome) FROM aluno;
SELECT upper(nome) FROM aluno;

SELECT ROUND(media,1) from aluno;

SELECT SQRT(media) from aluno;

SELECT TRUNCATE(media,1) from aluno;

SELECT * FROM ALUNO ORDER BY nome asc;
SELECT * FROM ALUNO ORDER BY nome desc;

SELECT * FROM ALUNO ORDER BY idaluno asc;
SELECT * FROM ALUNO ORDER BY idaluno desc;
