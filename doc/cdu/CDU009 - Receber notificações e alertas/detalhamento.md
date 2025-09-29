# CDU009. Receber Notificações e Alertas

* **Ator principal**: Usuário
* **Atores secundários**: Sistema
* **Resumo**: Permite ao usuário visualizar notificações e alertas relacionados à sua conta, receber atualizações em tempo real e acessar detalhes completos de cada notificação.
* **Pré-condição**: Usuário autenticado no sistema e com sessão ativa.
* **Pós-condição**: O usuário visualiza notificações novas e antigas, podendo consultar detalhes completos de cada alerta.

---

## Fluxo Principal

|                                 Ações do ator                                 |                                        Ações do sistema                                       |
| :---------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------: |
|                              1 - Entra no sistema                             |                                              ...                                              |
|                                      ...                                      |                           2 - Autentica o usuário e inicia a sessão                           |
|         3 - Acessa área de notificações ou permanece na tela principal        |                                              ...                                              |
|                                      ...                                      |                 4 - Carrega notificações antigas via API e mantém cache local                 |
| 5 - Visualiza lista de notificações na tela principal ou pelo atalho superior |                                              ...                                              |
|                                      ...                                      |                6 - Exibe notificações com resumo, data/hora e status de leitura               |
|                 7 - Clica em uma notificação para ver detalhes                |                                              ...                                              |
|                                      ...                                      |  8 - Exibe tela de detalhes da notificação, incluindo informações completas e possíveis ações |
|              9 - Permanece conectado e novas notificações chegam              |                                              ...                                              |
|                                      ...                                      | 10 - Adiciona notificações novas ao cache e atualiza automaticamente a lista visível no front |

---

## Fluxo Alternativo I - [Filtro ou busca de notificações]

|                        Ações do ator                        |                               Ações do sistema                               |
| :---------------------------------------------------------: | :--------------------------------------------------------------------------: |
| 1.1 - Aplica filtro por tipo, data ou status da notificação |                                      ...                                     |
|                             ...                             | 1.2 - Atualiza a lista de notificações de acordo com os critérios informados |

---

## Fluxo Exceção I - [Sem notificações]

|            Ações do ator            |                          Ações do sistema                          |
| :---------------------------------: | :----------------------------------------------------------------: |
| 0.1 - Acessa a área de notificações |                                 ...                                |
|                 ...                 | 0.2 - Exibe mensagem: “Nenhuma notificação disponível no momento.” |

## Protótipo


## Diagrama de Interação (Sequência ou Comunicação)



## Diagrama de Classes de Projeto

