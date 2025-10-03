# CDU013. Consultar Plantões

- **Ator principal**: Médico CLT e Médico PJ  
- **Atores secundários**: Sistema  
- **Resumo**: Permite que médicos CLT e PJ consultem os plantões disponíveis, já assumidos ou pendentes, com detalhes como data, horário, local, status e observações. Essa funcionalidade possibilita ao médico visualizar rapidamente seus compromissos e oportunidades de plantão.  
- **Pré-condição**: O médico (CLT ou PJ) está autenticado no sistema e acessou a opção "Meus plantões" ou "Plantões disponíveis".  
- **Pós-condição**: A lista de plantões é exibida com informações detalhadas, permitindo que o médico acompanhe sua escala ou oportunidades.  

---

## Fluxo Principal

| Ações do Ator (Médico) | Ações do Sistema |
|-------------------------|------------------|
| 1. O médico acessa a opção "Meus plantões" ou "Plantões disponíveis". | |
| | 2. O sistema consulta a base de dados de plantões relacionados ao perfil do médico (CLT/PJ). |
| | 3. O sistema exibe a lista de plantões, incluindo: data, horário, setor, status e observações. |
| 4. O médico seleciona um plantão da lista para ver detalhes. | |
| | 5. O sistema exibe as informações completas do plantão (data, horário, local, status, criador e observações adicionais). |

---

## Fluxos Alternativos

### FA01 – Filtragem ou busca de plantões
| Ações do Ator | Ações do Sistema |
|---------------|------------------|
| 1a. O médico aplica filtros (por data, setor, status) ou realiza uma busca. | |
| | 2a. O sistema atualiza a lista de plantões conforme os critérios informados. |

### FA02 – Ordenação da lista
| Ações do Ator | Ações do Sistema |
|---------------|------------------|
| 1b. O médico altera a ordenação da lista (ex.: por data ou setor). | |
| | 2b. O sistema reorganiza a lista de plantões conforme a ordenação escolhida. |

---

## Fluxos de Exceção

### Exceção E01 – Lista de plantões vazia
| Ações do Ator | Ações do Sistema |
|---------------|------------------|
| 1. O médico acessa "Meus plantões" ou "Plantões disponíveis". | |
| | 2. O sistema não encontra plantões e exibe a mensagem: *"Nenhum plantão encontrado."* |

### Exceção E02 – Falha no carregamento
| Ações do Ator | Ações do Sistema |
|---------------|------------------|
| 1. O médico acessa "Meus plantões". | |
| | 2. O sistema encontra erro na consulta e exibe a mensagem: *"Não foi possível carregar os plantões. Tente novamente mais tarde."* |

---

## Protótipo

> Obs. as seções a seguir apenas serão utilizadas na segunda unidade do PDSWeb (segundo orientações do gerente do projeto).

## Diagrama de Interação (Sequência ou Comunicação)

## Diagrama de Classes de Projeto
