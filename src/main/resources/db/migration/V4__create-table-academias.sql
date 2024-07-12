CREATE SEQUENCE academias_seq START 1 INCREMENT 1;

CREATE TABLE academias (
    id INT DEFAULT nextval('academias_seq') PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    telefone VARCHAR(20) NOT NULL UNIQUE,
    logradouro VARCHAR(100) NOT NULL,
    bairro VARCHAR(100) NOT NULL,
    cep VARCHAR(15) NOT NULL,
    cidade VARCHAR(100) NOT NULL,
    uf CHAR(2) NOT NULL,
    complemento VARCHAR(100),
    numero VARCHAR(20)
);
