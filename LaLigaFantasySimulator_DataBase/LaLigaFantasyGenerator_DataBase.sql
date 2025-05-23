-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema laliga
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema laliga
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `laliga` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `laliga` ;

-- -----------------------------------------------------
-- Table `laliga`.`auditoria_simulaciones`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `laliga`.`auditoria_simulaciones` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `registro_simulacion` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 381
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `laliga`.`equipos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `laliga`.`equipos` (
  `id_equipo` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(100) NOT NULL,
  `id_escudo` VARCHAR(45) NOT NULL,
  `valoración` FLOAT NOT NULL,
  PRIMARY KEY (`id_equipo`, `nombre`))
ENGINE = InnoDB
AUTO_INCREMENT = 21
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `laliga`.`partidos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `laliga`.`partidos` (
  `idpartidos` INT NOT NULL AUTO_INCREMENT,
  `id_temporada` VARCHAR(45) NOT NULL,
  `nombre_local` VARCHAR(100) NOT NULL,
  `nombre_visitante` VARCHAR(100) NOT NULL,
  `goles_local` INT NOT NULL,
  `goles_visitante` INT NOT NULL,
  `jornada` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idpartidos`),
  INDEX `id_temporada_idx` (`id_temporada` ASC) VISIBLE,
  INDEX `nombre_local_idx` (`nombre_local` ASC) VISIBLE,
  INDEX `nombre_local_idx1` (`nombre_local` ASC, `nombre_visitante` ASC) VISIBLE)
ENGINE = InnoDB
AUTO_INCREMENT = 761
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

USE `laliga` ;

-- -----------------------------------------------------
-- procedure insertar_partido
-- -----------------------------------------------------

DELIMITER $$
USE `laliga`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `insertar_partido`(
	IN p_id_temporada VARCHAR(100),
    IN p_nombre_local VARCHAR(100),
    IN p_nombre_visitante VARCHAR(100),
    IN p_goles_local INT,
    IN p_goles_visitante INT,
    IN p_jornada VARCHAR(45)
    )
BEGIN
	INSERT INTO partidos (id_temporada, nombre_local, nombre_visitante, goles_local, goles_visitante, jornada)
    VALUES (p_id_temporada, p_nombre_local, p_nombre_visitante, p_goles_local, p_goles_visitante, p_jornada);
END$$

DELIMITER ;
USE `laliga`;

DELIMITER $$
USE `laliga`$$
CREATE
DEFINER=`root`@`localhost`
TRIGGER `laliga`.`tr_auditoria_simulaciones`
AFTER INSERT ON `laliga`.`partidos`
FOR EACH ROW
BEGIN
	INSERT INTO auditoria_simulaciones (
    registro_simulacion
    )
    VALUES (
    NOW()
    );
END$$


DELIMITER ;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
