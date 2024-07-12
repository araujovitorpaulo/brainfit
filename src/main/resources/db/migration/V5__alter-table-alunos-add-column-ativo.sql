ALTER TABLE alunos ADD COLUMN ativo CHAR(1) DEFAULT 'S' CHECK (ativo IN ('S', 'N'));

UPDATE alunos SET ativo = 'S';