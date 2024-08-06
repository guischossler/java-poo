CREATE TABLE pessoa (
	id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    sexo CHAR(1) NOT NULL,
    telefone VARCHAR(11),
    email VARCHAR(100),
    dt_nascimento VARCHAR(8),
	ativo BOOLEAN NOT NULL
);

