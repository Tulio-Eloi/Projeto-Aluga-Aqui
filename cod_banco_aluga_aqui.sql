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
  PRIMARY KEY (`id_carros`))
ENGINE = InnoDB;


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
