create sequence academias_seq start with 1 increment by 1;

create table academias(
    id number default academias_seq.nextval,
    nome varchar(100) not null,
    telefone varchar(20) not null unique,
    logradouro varchar(100) not null,
    bairro varchar(100) not null,
    cep varchar(15) not null,
    cidade varchar(100) not null,
    uf char(2) not null,
    complemento varchar(100),
    numero varchar(20),
    primary key(id));