CREATE DATABASE aplicacao;

CREATE TABLE tb_usuario (
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(50) NOT NULL,
email VARCHAR (64) UNIQUE NOT NULL,
senha VARCHAR(64) NOT NULL,
telefone VARCHAR(11) NOT NULL
);

INSERT INTO tb_usuario (nome, email, senha, telefone) VALUES ('Andrew','nandsa@gmail.com','senha','1196410730');

SELECT * FROM tb_usuario;

CREATE TABLE tb_projeto(
id INT PRIMARY KEY AUTO_INCREMENT,
ods varchar (100) NOT NULL,
data_criacao datetime DEFAULT CURRENT_TIMESTAMP NOT NULL,
status_projeto boolean NOT NULL,
descricao varchar (100),
id_usuario varchar (64) NOT NULL,
FOREIGN KEY (id_usuario) REFERENCES tb_usuario(email)
);
SELECT * FROM tb_projeto;

SELECT * FROM tb_projeto where id_usuario = 'testeando@gmail.com' and status_projeto = true;

INSERT INTO tb_projeto (ODS_projeto, id_usuario, descricao, status_projeto) VALUES
('Sim teste', 'teste@gmail.com', 'seu cu meu', true);

SELECT nome, email, telefone FROM login WHERE id = '1';