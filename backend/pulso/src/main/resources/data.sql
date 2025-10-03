-- Script para inserir dados de teste automaticamente
-- Ordem de inserção respeitando as dependências das foreign keys

-- 1. ESPECIALIDADES (independente)
INSERT INTO especialidades (nome) VALUES 
('Cardiologia'),
('Pediatria'),
('Ortopedia'),
('Neurologia'),
('Ginecologia'),
('Clínica Geral');

-- 2. USUÁRIOS (criar usuários primeiro - sem dependências)
INSERT INTO usuarios (matricula, senha, ativo, criado_em, atualizado_em) VALUES 
('ADM001', 'admin123', true, NOW(), NOW()),  -- ID 1 - Admin futuro do Hospital São Paulo
('GES001', 'gestor123', true, NOW(), NOW()), -- ID 2 - Gestor futuro da Clínica Santa Maria
('MED001', 'med123', true, NOW(), NOW()),    -- ID 3 - Dr. João Silva
('MED002', 'med123', true, NOW(), NOW()),    -- ID 4 - Dra. Maria Santos
('MED003', 'med123', true, NOW(), NOW()),    -- ID 5 - Dr. Pedro Oliveira
('MED004', 'med123', true, NOW(), NOW()),    -- ID 6 - Dra. Ana Costa
('MED005', 'med123', true, NOW(), NOW()),    -- ID 7 - Dr. Carlos Ferreira
('MED006', 'med123', true, NOW(), NOW());    -- ID 8 - Dra. Lucia Mendes

-- 3. INSTITUIÇÕES (agora com referência aos usuários)
INSERT INTO instituicoes (nome, email, telefone, endereco, cnpj, exige_vinculo, usuario_id) VALUES 
('Hospital São Paulo', 'contato@hsaopaulo.com.br', '(11) 3456-7890', 'Rua das Flores, 123 - São Paulo/SP', '12.345.678/0001-90', true, 1),
('Clínica Santa Maria', 'atendimento@santamaria.com.br', '(11) 2345-6789', 'Av. Paulista, 456 - São Paulo/SP', '98.765.432/0001-10', false, 2),
('Hospital Regional Norte', 'info@hospitalregional.com.br', '(85) 3333-4444', 'Rua Norte, 789 - Fortaleza/CE', '11.222.333/0001-44', true, 3);

-- 4. PESSOAS (agora com referência aos usuários)
INSERT INTO pessoas (nome, email, telefone, usuario_id) VALUES 
('Dr. João Silva', 'joao.silva@email.com', '(11) 99999-1111', 3),
('Dra. Maria Santos', 'maria.santos@email.com', '(11) 88888-2222', 4),
('Dr. Pedro Oliveira', 'pedro.oliveira@email.com', '(11) 77777-3333', 5),
('Dra. Ana Costa', 'ana.costa@email.com', '(11) 66666-4444', 6),
('Dr. Carlos Ferreira', 'carlos.ferreira@email.com', '(11) 55555-5555', 7),
('Dra. Lucia Mendes', 'lucia.mendes@email.com', '(11) 44444-6666', 8),
('Dr. Roberto Admin', 'roberto.admin@email.com', '(11) 33333-7777', 1),
('Dra. Patricia Gestora', 'patricia.gestora@email.com', '(11) 22222-8888', 2);

-- 5. PROFISSIONAIS (depende de pessoas e especialidades)
INSERT INTO profissional (pessoa_id, especialidade_id, crm, data_nasc, ano_formacao, pix, tipo_pix) VALUES 
(1, 1, 'CRM12345', '1980-05-15', '2005-12-01', '11999991111', 'TELEFONE'),
(2, 2, 'CRM23456', '1975-08-22', '2000-06-15', '11888882222', 'TELEFONE'),
(3, 3, 'CRM34567', '1982-03-10', '2007-11-20', '11777773333', 'TELEFONE'),
(4, 4, 'CRM45678', '1978-12-03', '2003-05-30', '11666664444', 'TELEFONE'),
(5, 5, 'CRM56789', '1985-07-18', '2010-03-12', '11555555555', 'TELEFONE'),
(6, 6, 'CRM67890', '1983-11-25', '2008-09-08', '11444446666', 'TELEFONE');

-- 6. VÍNCULOS (depende de profissionais e instituições)
INSERT INTO vinculos (profissional_id, instituicao_id, tipo_vinculo) VALUES 
(1, 1, 'CLT'),  -- Dr. João Silva no Hospital São Paulo
(2, 1, 'PJ'),   -- Dra. Maria Santos no Hospital São Paulo
(3, 2, 'CLT'),  -- Dr. Pedro Oliveira na Clínica Santa Maria
(4, 1, 'CLT'),  -- Dra. Ana Costa no Hospital São Paulo
(5, 3, 'PJ'),   -- Dr. Carlos Ferreira no Hospital Regional Norte
(6, 2, 'CLT');  -- Dra. Lucia Mendes na Clínica Santa Maria

-- 7. LÍDERES DE ESCALA (depende de pessoas, especialidades e vínculos)
INSERT INTO lideres_escala (pessoa_id, especialidade_id, vinculo_id) VALUES 
(1, 1, 1),  -- Dr. João Silva líder de Cardiologia
(4, 4, 4);  -- Dra. Ana Costa líder de Neurologia

-- 8. SETORES (depende de instituições)
INSERT INTO setores (nome, instituicao_id) VALUES 
('Emergência', 1),
('UTI', 1),
('Pediatria', 1),
('Cardiologia', 1),
('Consultórios', 2),
('Exames', 2),
('Internação', 3),
('Cirurgia', 3);

-- 9. SETOR_ESPECIALIDADE (tabela de relacionamento)
INSERT INTO setor_especialidade (setor_id, especialidade_id) VALUES 
(1, 1), -- Emergência -> Cardiologia
(1, 6), -- Emergência -> Clínica Geral
(2, 1), -- UTI -> Cardiologia
(2, 4), -- UTI -> Neurologia
(3, 2), -- Pediatria -> Pediatria
(4, 1), -- Cardiologia -> Cardiologia
(5, 6), -- Consultórios -> Clínica Geral
(5, 5), -- Consultórios -> Ginecologia
(6, 3), -- Exames -> Ortopedia
(7, 2), -- Internação -> Pediatria
(8, 3); -- Cirurgia -> Ortopedia

-- 10. ESCALAS (depende de líderes de escala e setores)
INSERT INTO escala (nome, mes_referencia, status, lider_escala_id, setor_id, data_criacao, data_atualizacao) VALUES 
('Escala Cardiologia Janeiro 2025', '2025-01-01', 'PUBLICADA', 1, 4, NOW(), NOW()),
('Escala Emergência Janeiro 2025', '2025-01-01', 'RASCUNHO', 1, 1, NOW(), NOW()),
('Escala Neurologia Janeiro 2025', '2025-01-01', 'PUBLICADA', 2, 2, NOW(), NOW());

-- 11. PLANTÕES (depende de escalas)
INSERT INTO plantao (escala_id, hora_entrada, hora_saida, quantidade_profissionais, estimativa_valor, estimativa_pagamento, forma_pagamento, comentario, data_criacao, data_atualizacao) VALUES 
(1, '2025-01-15 08:00:00', '2025-01-15 18:00:00', 2, 800, '2025-02-15', 'PIX', 'Plantão diurno cardiologia', NOW(), NOW()),
(1, '2025-01-15 18:00:00', '2025-01-16 08:00:00', 1, 1200, '2025-02-15', 'PIX', 'Plantão noturno cardiologia', NOW(), NOW()),
(2, '2025-01-20 06:00:00', '2025-01-20 18:00:00', 3, 600, '2025-02-20', 'A_VISTA', 'Plantão emergência', NOW(), NOW()),
(3, '2025-01-25 08:00:00', '2025-01-25 20:00:00', 2, 1000, '2025-02-25', 'PIX', 'Plantão neurologia', NOW(), NOW());

-- 12. ALOCAÇÕES (depende de plantões e profissionais)
INSERT INTO alocacao (plantao_id, profissional_id, fixa) VALUES 
(1, 1, true),   -- Dr. João Silva no plantão diurno cardiologia
(1, 4, false),  -- Dra. Ana Costa no plantão diurno cardiologia
(2, 1, true),   -- Dr. João Silva no plantão noturno cardiologia
(3, 2, true),   -- Dra. Maria Santos na emergência
(3, 6, false),  -- Dra. Lucia Mendes na emergência
(4, 4, true),   -- Dra. Ana Costa no plantão neurologia
(4, 1, false);  -- Dr. João Silva no plantão neurologia

-- 13. TROCAS (depende de plantões e profissionais)
INSERT INTO troca (plantao_id, profissional_id, tipo, status, comentario) VALUES 
(2, 1, 'SIMPLES', 'PENDENTE', 'Preciso trocar plantão noturno'),
(4, 4, 'DUPLA', 'CONFIRMADO', 'Troca confirmada com colega');

-- 14. NOTIFICAÇÕES (depende de pessoas - usando IDs como remetente/destinatário)
INSERT INTO notificacao (titulo, conteudo, tipo, status, id_remetente, id_destinatario, data_criacao) VALUES 
('Nova Escala Publicada', 'A escala de cardiologia de janeiro foi publicada', 'ESCALA', 'ENVIADA', 1, 4, NOW()),
('Solicitação de Troca', 'Dr. João Silva solicitou troca de plantão', 'TROCA', 'PENDENTE', 1, 4, NOW()),
('Plantão Confirmado', 'Seu plantão do dia 15/01 foi confirmado', 'PLANTAO', 'LIDA', 7, 1, NOW());

-- Mensagens de confirmação
SELECT 'Dados de teste inseridos com sucesso!' as status;
SELECT COUNT(*) as total_especialidades FROM especialidades;
SELECT COUNT(*) as total_instituicoes FROM instituicoes;
SELECT COUNT(*) as total_pessoas FROM pessoas;
SELECT COUNT(*) as total_profissionais FROM profissional;
SELECT COUNT(*) as total_usuarios FROM usuarios;
SELECT COUNT(*) as total_escalas FROM escala;
SELECT COUNT(*) as total_plantoes FROM plantao;