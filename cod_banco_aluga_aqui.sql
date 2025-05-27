-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema aluga_aqui
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema aluga_aqui
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `aluga_aqui` DEFAULT CHARACTER SET utf8 ;
-- -----------------------------------------------------
-- Schema aluga_aqui
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema aluga_aqui
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `aluga_aqui` DEFAULT CHARACTER SET utf8 ;
USE `aluga_aqui` ;

-- -----------------------------------------------------
-- Table `aluga_aqui`.`carros`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `aluga_aqui`.`carros` (
  `id_carros` INT NOT NULL AUTO_INCREMENT,
  `modelo_carros` VARCHAR(45) NOT NULL,
  `marca_carros` VARCHAR(45) NOT NULL,
  `placa_carros` VARCHAR(45) NOT NULL,
  `ano_carros` VARCHAR(45) NOT NULL,
  `cor_carros` VARCHAR(45) NOT NULL,
  `status_carros` VARCHAR(45) NOT NULL,
   `valor_carros` double NOT NULL,
  `imagens_carros` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_carros`))
ENGINE = InnoDB;

INSERT INTO `carros` (`id_carros`, `modelo_carros`, `marca_carros`, `placa_carros`, `ano_carros`, `cor_carros`, `status_carros`, `valor_carros`, `imagens_carros`) VALUES
(1, 'Cheiron', 'Bugatti', 'sadad63', '2025', 'azul', 'Disponivel', 1500, 'https://motorshow.com.br/wp-content/uploads/sites/2/2016/03/bugatti-chiron-2.jpg'),
(2, 'Skyline GT-R R34', 'Nissan', 'xpq9081', '2003', 'Azul', 'Disponivel', 400, 'https://s2-autoesporte.glbimg.com/se9camHJ7IJIVxStZO3VX22TTfc=/0x0:960x480/924x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_cf9d035bf26b4646b105bd958f32089d/internal_photos/bs/2023/V/d/IwKZ56TnmCEKtBkz4vgg/skyline-2.jpg'),
(3, 'Jetta GLI', 'volkswagen', 'ERIC-3625', '2025', 'Branco', 'Disponivel', 150, 'https://clickpetroleoegas.com.br/wp-content/uploads/2024/06/planetcars.jpg'),
(4, 'Civic TYPE R', 'Honda', 'ZG68512', '2025', 'Preto', 'Indisponível', 250, 'https://directimports.com.br/wp-content/uploads/2023/03/2-23.webp');
-- -----------------------------------------------------
-- Table `aluga_aqui`.`clientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `aluga_aqui`.`clientes` (
  `id_clientes` INT NOT NULL AUTO_INCREMENT,
  `nome_clientes` VARCHAR(45) NOT NULL,
  `email_clientes` VARCHAR(45) NOT NULL,
  `telefone__clientes` VARCHAR(45) NOT NULL,
  `endereco_clientes` VARCHAR(45) NOT NULL,
  `cpf_clientes` VARCHAR(14) NOT NULL,
  PRIMARY KEY (`id_clientes`),
  UNIQUE INDEX `cpf_clientes_UNIQUE` (`cpf_clientes` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `aluga_aqui`.`alugueis`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `aluga_aqui`.`alugueis` (
  `id_alugueis` INT NOT NULL AUTO_INCREMENT,
  `data_inicio_alugueis` DATE NOT NULL,
  `data_fim_alugueis` DATE NOT NULL,
  `valor_total_alugueis` DECIMAL(10,2) NOT NULL,
  `observacoes_alugueis` VARCHAR(45) NULL,
  `carros_id_carros` INT NOT NULL,
  `clientes_id_clientes` INT NOT NULL,
  PRIMARY KEY (`id_alugueis`),
  INDEX `fk_alugueis_carros_idx` (`carros_id_carros` ASC),
  INDEX `fk_alugueis_clientes1_idx` (`clientes_id_clientes` ASC),
  CONSTRAINT `fk_alugueis_carros`
    FOREIGN KEY (`carros_id_carros`)
    REFERENCES `aluga_aqui`.`carros` (`id_carros`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_alugueis_clientes1`
    FOREIGN KEY (`clientes_id_clientes`)
    REFERENCES `aluga_aqui`.`clientes` (`id_clientes`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

USE `aluga_aqui` ;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
