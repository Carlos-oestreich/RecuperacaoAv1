CREATE DATABASE db_biblioteca;

USE db_biblioteca;

CREATE TABLE tb_usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(50) UNIQUE NOT NULL,
    senha VARCHAR(100) NOT NULL
);

CREATE TABLE tb_livros (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(150) NOT NULL,
    editora VARCHAR(100) NOT NULL,
    ano varchar(50) NOT NULL,
    disponivel BOOLEAN DEFAULT TRUE
);

INSERT INTO tb_usuarios (nome, email, senha) VALUES ('teste', 'teste', 'teste');