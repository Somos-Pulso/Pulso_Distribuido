# CDU009. Receber Notificações e Alertas

- **Ator principal**: Usuário
- **Atores secundários**: Sistema
- **Resumo**: Permite ao usuário visualizar notificações e alertas relacionados à sua conta, receber atualizações em tempo real e acessar detalhes completos de cada notificação.
- **Pré-condição**: Usuário autenticado no sistema e com sessão ativa.
- **Pós-condição**: O usuário visualiza notificações novas e antigas, podendo consultar detalhes completos de cada alerta.

## Fluxo Principal

|                              Ações do ator                                    |                                            Ações do ator                                      |
| :---------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------: |
|                         1 - Acessa o sistema                                  |                                                                                               |
|                                                                               |                                  2 - Carrega notificações                                     |
| 3 - Visualiza lista de notificações na tela de noficações ou pelo atalho      |                                                                                               |
|                                                                               |                4 - Exibe notificações com resumo, data/hora e status de leitura               |
|                 5 - Clica em uma notificação para ver detalhes                |                                                                                               |
|                                                                               |  6 - Exibe tela de detalhes da notificação, incluindo informações completas e possíveis ações |
|              7 - Permanece conectado e novas notificações chegam              |                                                                                               |
|                                                                               |                  8 - sistema atualiza novas notificações de forma assincrona                  |


## Fluxo Alternativo I - [Filtro ou busca de notificações]

|                        Ações do ator                        |                               Ações do sistema                               |
| :---------------------------------------------------------: | :--------------------------------------------------------------------------: |
| 3.1 - Aplica filtro por tipo, data ou status da notificação |                                                                              |
|                                                             | 3.2 - Atualiza a lista de notificações de acordo com os critérios informados |


## Protótipo


## Diagrama de Interação (Sequência ou Comunicação)



## Diagrama de Classes de Projeto

