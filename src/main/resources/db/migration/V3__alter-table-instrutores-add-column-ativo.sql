ALTER TABLE instrutores ADD COLUMN ativo CHAR(1) DEFAULT 'S' CHECK (ativo IN ('S', 'N'));

UPDATE instrutores SET ativo = 'S';