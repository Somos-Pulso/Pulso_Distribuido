# CDU05. Consultar Escalas

- **Ator principal**: Médico
- **Atores secundários**: Sistema  
- **Resumo**: Permite que o médico visualize as escalas dos plantões nos quais está alocado ou de interesse, trazendo todas as informações da escala e equipe montada para ela.  
- **Pré-condição**: O médico está devidamente autenticado e vinculado a plantões.  
- **Pós-condição**: A lista de escalas do médico é exibida com todos os dados relevantes e pronta para possíveis interações adicionais, como visualização de detalhes.  

## Fluxo Principal
| Ações do Ator                      | Ações do Sistema                                                                               |
| :--------------------------------: | :--------------------------------------------------------------------------------------------: |
| 1 - Seleciona escala de interesse. |                                                                                                |
|                                    | 2 - Recupera dados da escala selecionada, plantões, alocações e profissionais para amostragem. |
| 3 - Visualiza escala montada.      |                                                                                                |

---

## Fluxos Alternativos

### Fluxo Alternativo I - [Detalhar escala por plantão]
| Ações do Ator                                                        | Ações do Sistema                                                                                 |
| :------------------------------------------------------------------: | :----------------------------------------------------------------------------------------------: |
| 1.1 - Seleciona "Ver escala relacionada" no detalhamento do plantão. |                                                                                                  |
|                                                                      | 1.2 - Recupera dados da escala selecionada, plantões, alocações e profissionais para amostragem. |
| 1.3 - Visualiza escala montada.                                      |                                                                                                  |

---

## Fluxos Exceção

### Fluxo Exceção I - [Detalhar escala inexistente]
| Ações do Ator                        | Ações do Sistema                                                       |
| :----------------------------------: | :--------------------------------------------------------------------: |
| 1.1 - Seleciona escala de interesse. |                                                                        |
|                                      | 1.2 - Exibe mensagem informando que não foi possível encontrar escala. |

---

## Protótipo

## Diagrama de Interação (Sequência ou Comunicação)

## Diagrama de Classes de Projeto
