alter table instrutores add ativo char(1) default 'S' check (ativo in('S','N'));

update instrutores set ativo='S';