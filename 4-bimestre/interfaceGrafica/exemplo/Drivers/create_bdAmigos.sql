CREATE DATABASE bd_Amigos;
USE bd_Amigos;

CREATE TABLE `tb_Amigos`(
	`id_amigo` INT(100) NOT NULL
    ,`nome` VARCHAR(100) NOT NULL
    ,`apelido` VARCHAR(100) NOT NULL
    ,`telefone` VARCHAR(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
