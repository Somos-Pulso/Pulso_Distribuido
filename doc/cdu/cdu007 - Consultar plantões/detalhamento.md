# CDU07. Consultar Plantões

- **Ator principal**: Médico
- **Atores secundários**: Sistema  
- **Resumo**: Permite que médicos consultem os plantões disponíveis, já assumidos ou pendentes, com detalhes como data, horário, local, status e observações. Essa funcionalidade possibilita ao médico visualizar rapidamente seus compromissos e oportunidades de plantão.  
- **Pré-condição**: O médico (CLT ou PJ) está autenticado no sistema e acessou a opção "Meus plantões" ou "Plantões disponíveis".  
- **Pós-condição**: A lista de plantões é exibida com informações detalhadas, permitindo que o médico acompanhe sua escala ou oportunidades.  

---

## Fluxo Principal

| Ações do Ator                    | Ações do Sistema                                                           |
|----------------------------------|----------------------------------------------------------------------------|
| 1 - Acessa plantão de interesse. |                                                                            |
|                                  | 2 - Recupera dados do plantão selecionado, alocação, profissional e troca. |
| 3 - Visualiza plantão montado.   |                                                                            |

---

## Fluxos Alternativos

### Fluxo Alternativo I - [Listar plantões]

| Ações do Ator                         | Ações do Sistema                                                                         |
|---------------------------------------|------------------------------------------------------------------------------------------|
| 1.1 - Acessa a opção "Meus plantões". |                                                                                          |
|                                       | 1.2 - Consulta a base de dados e exibe a lista de planões relacionados ao médico logado. |
| 1.3 - Visualiza os plantões listados. |                                                                                          |

---

## Fluxos Exceção

### Fluxo Exceção I – [Detalhar plantão inexistente]
| Ações do Ator                    | Ações do Sistema                                                                   |
|----------------------------------|------------------------------------------------------------------------------------|
| 1.a Acessa plantão de interesse. |                                                                                    |
|                                  | 1.b O sistema não encontra plantão e exibe a mensagem: *"Plantão não encontrado."* |

---

## Protótipo

## Diagrama de Interação (Sequência ou Comunicação)

## Diagrama de Classes de Projeto
