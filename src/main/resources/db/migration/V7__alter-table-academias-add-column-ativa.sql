alter table academias add ativa char(1) default 'S' check (ativa in('S','N'));

update academias set ativa='S';