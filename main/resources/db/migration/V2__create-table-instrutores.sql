create sequence instrutores_seq start with 1 increment by 1;

create table instrutores(
    id number default instrutores_seq.nextval,
    nome varchar(100) not null,
    email varchar(100) not null,
    telefone varchar(10) not null,
    especialidade varchar(100) not null,
    idade int not null,
    sexo varchar(20) not null,
    logradouro varchar(100) not null,
    bairro varchar(100) not null,
    cep varchar(10) not null,
    cidade varchar(100) not null,
    uf char(2) not null,
    complemento varchar(100),
    numero varchar(20),
    primary key(id));