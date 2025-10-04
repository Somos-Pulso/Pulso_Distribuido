# CDU014. Responder solicitação de troca

* **Ator principal**: Médico PJ
* **Atores secundários**: Médico PJ e Líder de Escala
* **Resumo**: Permite que médicos PJ respondam se aceitam ou recusam solicitações de troca do tipo duplo destinadas a si.
* **Pré-condição**: O médico PJ estar devidamente autenticado no sistema e ter sido viculado em uma troca requisitada por outro médico.
* **Pós-condição**: Troca realizada e alocações para plantões trocadas.

## Fluxo Principal

| Ações do Ator                                                 | Ações do Sistema                                                                                                                                 |
|---------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------|
| 1 - O médico seleciona solicitação de troca aberto para si.    |                                                                                                                                                  |
|                                                               | 2 - O sistema exibe dados da solicitação de troca.                                                                                                |
| 3 - O médico aceita solicitação e informa plantão para trocar. |                                                                                                                                                  |
|                                                               | 4 - O sistema valida dados de entrada, confirma troca, faz a troca de alocações dos plantões mencionados e informa médico solicitante do sucesso. |

---

## Fluxos Alternativos

### Fluxo Alternativo I – [Recusar troca]
| Ações do Ator                     | Ações do Sistema                                                    |
|-----------------------------------|---------------------------------------------------------------------|
| 3.1 - O médico recusa solicitação. |                                                                     |
|                                   | 3.2 - O sistema recusa troca e informa médico solicitante da recusa. |

### Fluxo Exceção I - [Plantão inexistente informado]
| Ações do Ator                                                               | Ações do Sistema                                                                                                  |
|-----------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|
| 3.a - O médico aceita solicitação e informa plantão inexistente para trocar. |                                                                                                                   |
|                                                                             | 3.b - O sistema exibe mensagem de erro informando que não é possível confirmar a troca com um plantão inexistente. |

---

## Fluxos Execeção

### Fluxo Exceção II - [Plantão informado sem vínculo com médico]
| Ações do Ator                                                                           | Ações do Sistema                                                                                                              |
|-----------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------|
| 3.aa - O médico aceita solicitação e informa plantão que não está vinculado para trocar. |                                                                                                                               |
|                                                                                         | 3.bb - O sistema exibe mensagem de erro informando que não é possível confirmar a troca com um plantão que não está vinculado. |

### Fluxo Exceção III - [Interação com troca inexistente]
| Ações do Ator                                         | Ações do Sistema                                                                                         |
|-------------------------------------------------------|----------------------------------------------------------------------------------------------------------|
| 3.a - O médico seleciona troca inexistente para trocar |                                                                                                          |
|                                                       | 3.b - O sistema exibe mensagem de erro informando que não foi possível encontrar a troca na base de dados |

---

## Protótipo

## Diagramas de Atividade
<img width="2489" height="1496" alt="CDU - Responder solicitação de Troca" src="https://github.com/user-attachments/assets/9a0a476c-8d8c-49ff-8274-e748ec5d582e" />

## Diagrama de Interação (Sequência ou Comunicação)

## Diagrama de Classes de Projeto