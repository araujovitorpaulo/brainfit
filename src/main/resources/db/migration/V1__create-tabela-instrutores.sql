CREATE SEQUENCE instrutores_seq START 1 INCREMENT 1;

CREATE TABLE instrutores (
    id INT DEFAULT nextval('instrutores_seq') PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    telefone VARCHAR(10) NOT NULL,
    especialidade VARCHAR(100) NOT NULL,
    idade INT NOT NULL,
    sexo VARCHAR(20) NOT NULL,
    logradouro VARCHAR(100) NOT NULL,
    bairro VARCHAR(100) NOT NULL,
    cep VARCHAR(10) NOT NULL,
    cidade VARCHAR(100) NOT NULL,
    uf CHAR(2) NOT NULL,
    complemento VARCHAR(100),
    numero VARCHAR(20)
);