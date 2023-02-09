CREATE SCHEMA `comercio`;

CREATE TABLE `comercio`.`cliente` (
  `id` int,
  `nome_cliente` int,
  `cpf` varchar(255),
  `endereço` varchar(255),
  `admin_id` int,
  PRIMARY KEY (`id`, `nome_cliente`)
);

CREATE TABLE `comercio`.`fly` (
  `ordem_id` int,
  `produto_id` int,
  `quantity_ticket` int DEFAULT 1
);

CREATE TABLE `comercio`.`ordens` (
  `id` int PRIMARY KEY,
  `cliente_id` int UNIQUE NOT NULL,
  `status` varchar(255),
  `nfe` varchar(255),
  `criado_ate` varchar(255) COMMENT 'Quando a ordem for criada'
);

CREATE TABLE `comercio`.`produto` (
  `id` int PRIMARY KEY,
  `nome` varchar(255),
  `comerciante_id` int NOT NULL,
  `valor` int,
  `status` ENUM ('out_of_stock', 'in_stock', 'running_low'),
  `criado_ate` datetime DEFAULT (now())
);

CREATE TABLE `comercio`.`produto_tags` (
  `id` int PRIMARY KEY,
  `nome` varchar(255)
);

CREATE TABLE `comercio`.`comerciante_vendas` (
  `id` int PRIMARY KEY,
  `comerciante_id` int,
  `nome_cliente` int,
  `data_inicial` datetime,
  `data_final` datetime
);

CREATE TABLE `comercio`.`airport` (
  `id` int PRIMARY KEY,
  `airport_id` int,
  `nome_cliente` int,
  `data_inicial` datetime,
  `data_final` datetime
);

CREATE TABLE `clientes` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `nome_completo` varchar(255),
  `criado_ate` timestamp,
  `nome_cliente` int
);

CREATE TABLE `paises` (
  `codigo_pais` int PRIMARY KEY,
  `nome_pais` varchar(255),
  `nome_continente` varchar(255)
);

CREATE INDEX `produto_status` ON `comercio`.`produto` (`comerciante_id`, `status`);

CREATE UNIQUE INDEX ``comercio`.produto_index_1` ON `comercio`.`produto` (`id`);

ALTER TABLE `comercio`.`cliente` ADD FOREIGN KEY (`admin_id`) REFERENCES `clientes` (`id`);

ALTER TABLE `comercio`.`cliente` ADD FOREIGN KEY (`nome_cliente`) REFERENCES `paises` (`codigo_pais`);

ALTER TABLE `comercio`.`fly` ADD FOREIGN KEY (`ordem_id`) REFERENCES `comercio`.`ordens` (`id`);

ALTER TABLE `comercio`.`fly` ADD FOREIGN KEY (`produto_id`) REFERENCES `comercio`.`produto` (`id`);

ALTER TABLE `comercio`.`produto` ADD FOREIGN KEY (`comerciante_id`) REFERENCES `comercio`.`cliente` (`id`);

CREATE TABLE `produto_tags_produto` (
  `produto_tags_id` int NOT NULL,
  `produto_id` int NOT NULL,
  PRIMARY KEY (`produto_tags_id`, `produto_id`)
);

ALTER TABLE `produto_tags_produto` ADD FOREIGN KEY (`produto_tags_id`) REFERENCES `comercio`.`produto_tags` (`id`);

ALTER TABLE `produto_tags_produto` ADD FOREIGN KEY (`produto_id`) REFERENCES `comercio`.`produto` (`id`);


ALTER TABLE `comercio`.`comerciante_vendas` ADD FOREIGN KEY (`comerciante_id`, `nome_cliente`) REFERENCES `comercio`.`cliente` (`id`, `nome_cliente`);

ALTER TABLE `comercio`.`comerciante_vendas` ADD FOREIGN KEY (`id`, `comerciante_id`) REFERENCES `comercio`.`airport` (`id`, `airport_id`);

ALTER TABLE `clientes` ADD FOREIGN KEY (`nome_cliente`) REFERENCES `paises` (`codigo_pais`);

ALTER TABLE `paises` ADD FOREIGN KEY (`codigo_pais`) REFERENCES `comercio`.`ordens` (`cliente_id`);
