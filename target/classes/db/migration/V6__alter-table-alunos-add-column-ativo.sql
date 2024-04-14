alter table alunos add ativo char(1) default 'S' check (ativo in('S','N'));

update alunos set ativo='S';