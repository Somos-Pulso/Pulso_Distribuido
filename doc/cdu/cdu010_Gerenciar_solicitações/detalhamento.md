## CDU017. Gerenciar Solicitações – Líder de Escala

* **Ator principal**: Líder de escala
* **Atores secundários**: Médicos solicitantes de plantões
* **Resumo**: O líder de escala acessa as solicitações de repasse de plantões no feed, revisa cada solicitação e decide aprovar, rejeitar ou delegar a avaliação. O sistema valida requisitos de especialidade e conflitos de horários, garantindo que a cobertura do plantão seja mantida. O líder também pode adicionar observações, filtrar, ordenar ou priorizar solicitações.
* **Pré-condição**: Deve existir pelo menos uma solicitação de repasse pendente no feed.
* **Pós-condição**: O sistema atualiza o status do plantão de acordo com a decisão do líder (aprovado, rejeitado, pendente, delegado) e notifica o médico solicitante.

---

### Fluxo Principal – Gerenciar Solicitações

| Ações do Líder de Escala | Ações do Sistema |
|--------------------------|-----------------|
| **1 - Acessa** a lista de solicitações de plantões pendentes. | |
| **2 - Filtra ou ordena** as solicitações por data, especialidade, hospital ou urgência, se desejar. | **3 - O sistema exibe** a lista de solicitações de acordo com os filtros aplicados. |
| **4 - Seleciona** uma solicitação para avaliar. | **5 - O sistema exibe** os detalhes do plantão e do médico solicitante. |
| **6 - Decide** aprovar, rejeitar ou delegar a solicitação. | **7 - O sistema registra** a decisão e atualiza o status do plantão. |
| **7 - Opcionalmente adiciona** observações ou mensagens ao médico solicitante. | **8 - O sistema notifica** o médico solicitante sobre a decisão. |
| **8 - Pode priorizar** a solicitação, marcando-a como urgente ou de alta prioridade. | **9 - O sistema mantém** o histórico de decisões e alterações de prioridade. |

### Fluxos Alternativos – Gerenciar Solicitações

## Fluxo Alternativo I – [Delegar avaliação para outro líder]
| Ações do Líder de Escala | Ações do Sistema |
|--------------------------|-----------------|
| Seleciona uma solicitação para avaliar | |
| Decide **delegar** a avaliação para outro líder de escala | O sistema encaminha a solicitação para o líder indicado e registra a delegação no histórico. |

## Fluxo Alternativo II – [Adicionar observações antes de aprovar/rejeitar]
| Ações do Líder de Escala | Ações do Sistema |
|--------------------------|-----------------|
| Seleciona uma solicitação | |
| Insere **observações ou mensagens** para o médico solicitante | O sistema salva as observações e as envia junto com a decisão final sobre o plantão. |

## Fluxo Alternativo III – [Priorizar solicitação]
| Ações do Líder de Escala | Ações do Sistema |
|--------------------------|-----------------|
| Identifica uma solicitação como urgente ou de alta prioridade | O sistema marca a solicitação como “Prioridade Alta” e destaca na lista de pendentes. |

## Fluxo Alternativo IV – [Suspender ou cancelar solicitação]
| Ações do Líder de Escala | Ações do Sistema |
|--------------------------|-----------------|
| Decide **cancelar ou suspender** a solicitação devido a inconsistências ou problemas no plantão | O sistema atualiza o status do plantão para “Suspenso” ou “Cancelado” e notifica o médico solicitante. |




## Protótipo


> Obs. as seções a seguir apenas serão utilizadas na segunda unidade do PDSWeb (segundo orientações do gerente do projeto).

## Diagrama de Interação (Sequência ou Comunicação)



## Diagrama de Classes de Projeto

