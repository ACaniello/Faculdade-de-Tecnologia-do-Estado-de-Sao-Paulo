INSERT INTO cadfun 
VALUES (34, 'ANA BASTOS', '3', 'PROGRAMADORA', 1450.00);

select nomefun, salariofun from cadfun 
order by nomefun;
select nomefun, salariofun from cadfun 
order by nomefun desc;
select nomefun from cadfun 
where deptofun='3' 
order by nomefun;
select nomefun, deptofun from cadfun
order by deptofun, nomefun desc;

SELECT * FROM cadfun WHERE CODFUN = 7;
UPDATE cadfun SET SALARIOfun = 2300.56 WHERE CODFUN = 7;

SELECT * FROM cadfun WHERE NOMEfun = 'ANA BASTOS';
UPDATE cadfun SET DEPTOfun = '4' WHERE NOMEfun = 'ANA BASTOS';

SELECT * FROM cadfun;
UPDATE cadfun SET SALARIOfun = SALARIOfun * 1.10;

SELECT distinct DEPTOfun FROM cadfun order by deptofun;

SELECT * FROM cadfun;
DELETE FROM cadfun WHERE DEPTOfun = '2';
DELETE FROM cadfun WHERE NOMEfun = 'MARCELO SOUZA';

TRUNCATE TABLE cadfun;

ALTER TABLE cadfun add admissaofun date;
select*from cadfun;

UPDATE cadfun SET ADMISSAOfun = '2006-01-15' WHERE CODFUN = 2;
UPDATE cadfun SET ADMISSAOfun = '1999-10-21' WHERE CODFUN = 5;
UPDATE cadfun SET ADMISSAOfun = '1980-05-10' WHERE CODFUN = 7;
UPDATE cadfun SET ADMISSAOfun = '2000-12-21' WHERE CODFUN = 12;
UPDATE cadfun SET ADMISSAOfun = '2000-10-21' WHERE CODFUN = 34;
select*from cadfun;

SELECT NOMEfun, ADMISSAOfun FROM cadfun WHERE MONTH(ADMISSAOfun) = 12;
SELECT NOMEfun, ADMISSAOfun FROM cadfun WHERE ADMISSAOfun >= '2000-01-01';

INSERT INTO cadfun 
VALUES (15, 'MARCOS HENRIQUE', '2', 'GERENTE', 2184.33, '2006-05-25');
INSERT INTO cadfun 
VALUES (20, 'AUDREY TOLEDO', '2', 'SUPERVISORA', 1700.00, '2006-07-05');
INSERT INTO cadfun 
VALUES (22, 'SANDRA MANZANO', '2','ANALISTA', 2000.00, '2006-07-01');
INSERT INTO cadfun 
VALUES (24, 'MARCIO CANUTO', '2', 'PROGRAMADOR', 1200.00, '2006-07-10');


SELECT NOMEfun, SALARIOfun FROM cadfun;
SELECT NOMEfun, SALARIOfun + 100 FROM cadfun;
SELECT NOMEfun, SALARIOfun FROM cadfun;
SELECT NOMEfun, SALARIOfun * 1.20 FROM cadfun;
SELECT NOMEfun, SALARIOfun FROM cadfun;

SELECT * FROM cadfun WHERE DEPTOfun = ‘5’;
SELECT * FROM cadfun WHERE FUNCAOfun = 'VENDEDOR';
SELECT * FROM cadfun WHERE SALARIOfun <= 1700;
SELECT * FROM cadfun WHERE SALARIOfun > 1700 + 50;
SELECT * FROM cadfun WHERE SALARIOfun > (1700 + 50);

SELECT * FROM cadfun 
WHERE (DEPTOfun = '3') AND (FUNCAOfun = 'PROGRAMADOR');
SELECT * FROM cadfun 
WHERE (DEPTOfun = '3') OR (DEPTOfun = '5');
SELECT * FROM cadfun 
WHERE NOT (FUNCAOfun = 'VENDEDOR');
SELECT * FROM cadfun 
WHERE (DEPTOfun = '5') XOR (FUNCAOfun = 'PROGRAMADOR');

ALTER TABLE cadfun ADD FILHOSfun SMALLINT;

SELECT NOMEfun, FILHOS FROM cadfun;
SELECT CODFUN, NOMEfun, FILHOSfun FROM cadfun WHERE FILHOSfun IS NULL;
SELECT CODFUN, NOMEfun, FILHOSfun FROM cadfun WHERE NOT FILHOSfun IS NULL;
SELECT CODFUN, NOMEfun, FILHOSfun FROM cadfun WHERE FILHOSfun IS NOT NULL;
SELECT CODFUN, NOMEfun, FILHOSfun FROM cadfun WHERE NOT (FILHOSfun IS NULL);


SELECT * FROM cadfun WHERE NOMEfun LIKE 'A%';
SELECT * FROM cadfun WHERE NOMEfun LIKE '_A%';
SELECT * FROM cadfun WHERE NOMEfun LIKE '%AN%';
SELECT * FROM cadfun WHERE SALARIOfun LIKE '%6';
SELECT * FROM cadfun WHERE SALARIOfun LIKE '_5%2';
SELECT * FROM cadfun WHERE NOMEfun NOT LIKE '%AN%';


UPDATE cadfun SET FILHOSfun = 1 WHERE CODFUN = 2;
UPDATE cadfun SET FILHOSfun = 3 WHERE CODFUN = 3;
UPDATE cadfun SET FILHOSfun = 2 WHERE CODFUN = 5;
UPDATE cadfun SET FILHOSfun = 1 WHERE CODFUN = 9;
UPDATE cadfun SET FILHOSfun = 4 WHERE CODFUN = 20;
UPDATE cadfun SET FILHOSfun = 3 WHERE CODFUN = 25;


SELECT CODFUN, NOMEfun, FILHOSfun FROM cadfun;
SELECT CODFUN, NOMEfun, FILHOSfun FROM cadfun WHERE FILHOSfun IS NULL;
SELECT CODFUN, NOMEfun, FILHOSfun FROM cadfun WHERE NOT (FILHOSfun IS NULL);
SELECT * FROM cadfun WHERE SALARIOfun BETWEEN 1700 AND 2000;
SELECT * FROM cadfun WHERE SALARIOfun NOT BETWEEN 1700 AND 2000;
SELECT * FROM cadfun WHERE DEPTOfun IN ('2', '3');
SELECT * FROM cadfun WHERE DEPTOfun NOT IN ('2', '3');