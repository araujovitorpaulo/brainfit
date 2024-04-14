create sequence alunos_seq start with 1 increment by 1;

create table alunos(
    id number default alunos_seq.nextval,
    nome varchar(100) not null,
    idade int not null,
    email varchar(100) not null unique,
    telefone varchar(20) not null unique,
    sexo varchar(20) not null,
    logradouro varchar(100) not null,
    bairro varchar(100) not null,
    cep varchar(15) not null,
    cidade varchar(100) not null,
    uf char(2) not null,
    complemento varchar(100),
    numero varchar(20),
    primary key(id));