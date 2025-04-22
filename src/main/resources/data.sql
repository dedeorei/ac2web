
-- Populando setores
INSERT INTO SETOR (id, nome) VALUES (1, 'TI');
INSERT INTO SETOR (id, nome) VALUES (2, 'RH');

-- Populando funcionários
INSERT INTO FUNCIONARIO (id, nome, setor_id) VALUES (1, 'João Silva', 1);
INSERT INTO FUNCIONARIO (id, nome, setor_id) VALUES (2, 'Maria Souza', 2);
INSERT INTO FUNCIONARIO (id, nome, setor_id) VALUES (3, 'Carlos Lima', 1);

-- Populando projetos
INSERT INTO PROJETO (id, descricao, data_inicio, data_fim) VALUES (1, 'Sistema de Vendas', '2025-01-01', '2025-06-30');
INSERT INTO PROJETO (id, descricao, data_inicio, data_fim) VALUES (2, 'Reestruturação RH', '2025-03-15', '2025-08-20');

-- Vinculando funcionários a projetos
INSERT INTO PROJETO_FUNCIONARIO (projeto_id, funcionario_id) VALUES (1, 1);
INSERT INTO PROJETO_FUNCIONARIO (projeto_id, funcionario_id) VALUES (1, 3);
INSERT INTO PROJETO_FUNCIONARIO (projeto_id, funcionario_id) VALUES (2, 2);
