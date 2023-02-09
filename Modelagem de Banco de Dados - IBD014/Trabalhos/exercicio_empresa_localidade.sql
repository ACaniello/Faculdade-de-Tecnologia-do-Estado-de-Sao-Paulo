CREATE SCHEMA `ecommerce`;

CREATE TABLE `ecommerce`.`empresa` (
  `id` int,
  `pais_code` int,
  `empresa_name` varchar(255),
  `ddd_brasil` int
);

CREATE TABLE `ecommerce`.`clientes` (
  `cpf` int,
  `id` int,
  `data_de_nascimento` int,
  `ddd_brasil` int,
  `rua_code` varchar(255),
  `CEP_code` int,
  `bairro_code` varchar(255),
  `cidade_code` varchar(255),
  `estado_code` varchar(255)
);

CREATE TABLE `users` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `nome_completo` varchar(255),
  `created_at` timestamp,
  `pais_code` int
);

CREATE TABLE `paises` (
  `code` int PRIMARY KEY,
  `nome` varchar(255),
  `nome_continente` varchar(255)
);

ALTER TABLE `ecommerce`.`empresa` ADD FOREIGN KEY (`id`) REFERENCES `ecommerce`.`clientes` (`id`);

ALTER TABLE `ecommerce`.`empresa` ADD FOREIGN KEY (`pais_code`) REFERENCES `paises` (`code`);

ALTER TABLE `users` ADD FOREIGN KEY (`id`) REFERENCES `ecommerce`.`clientes` (`id`);

ALTER TABLE `users` ADD FOREIGN KEY (`pais_code`) REFERENCES `paises` (`code`);

ALTER TABLE `users` ADD FOREIGN KEY (`nome_completo`) REFERENCES `ecommerce`.`clientes` (`id`);
