ALTER TABLE academias ADD COLUMN ativa CHAR(1) DEFAULT 'S' CHECK (ativa IN ('S', 'N'));

UPDATE academias SET ativa = 'S';