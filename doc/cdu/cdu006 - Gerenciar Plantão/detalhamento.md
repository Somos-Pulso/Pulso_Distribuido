# CDU006. Gerenciar Plantão

- **Ator principal**: Líder de escala
- **Atores secundários**: Sistema
- **Resumo**: Permite ao líder de escala criar, editar ou excluir plantões dentro de uma escala já criada, alocando médicos e ajustando os dados necessários.
- **Pré-condição**: O líder de escala está autenticado e acessou a tela de detalhamento de uma escala existente.
- **Pós-condição**: A escala refletirá corretamente os plantões criados, atualizados ou removidos.



## Fluxo Principal

|                        Ações do ator                               |                              Ações do sistema                                    |
| :----------------------------------------------------------------: | :------------------------------------------------------------------------------: |
|         0 - Acessa a tela de detalhamento da escala                |                                                                                  |
|                                                                    |                 1 - Exibe os horários disponíveis na escala                      |
|         2 - Seleciona um horário em determinado dia                |                                                                                  |
|                                                                    |      3 - Exibe lista de profissionais da instituição e formulário de plantão     |
| 4 - Seleciona profissionais, preenche formulário e clica em salvar |                                                                                  |
|                                                                    | 5 - Valida dados, cria o plantão, aloca o médico e exibe o plantão na tela       |


## Fluxo Alternativo I – [Atualizar plantão existente]

|                  Ações do ator                 |                                Ações do sistema                                 |
| :--------------------------------------------: | :-----------------------------------------------------------------------------: |
|  1.1 - Clica em um plantão já criado na escala |                                                                                 |
|                                                | 1.2 - Exibe formulário com dados do plantão já preenchidos e médicos associados |
| 1.3 - Altera dados desejados e clica em salvar |                                                                                 |
|                                                |        1.4 - Atualiza os dados do plantão e exibe-o atualizado na tela          |


## Fluxo Alternativo II – [Excluir plantão]

|                     Ações do ator                      |                     Ações do sistema                  |
| :----------------------------------------------------: | :---------------------------------------------------: |
| 1.1.1 - Clica em um plantão existente                  |                                                       |
|            1.1.2 - Seleciona a opção excluir           |                                                       |
|                                                        | 1.1.3 - Remove o plantão da escala e apaga seus dados |

## Fluto Alternativo III - [Detalhar plantão]

| Ações do ator                    | Ações do sistema                                                                   |
| :------------------------------: | :--------------------------------------------------------------------------------: |
| 1.a - Seleciona um plantão       |                                                                                    |
|                                  | 1.b - Busca pelo plantão na base de dados junto com suas alocações e profissionais |
| 1.c - Visualiza dados do plantão |                                                                                    |

## Fluxo Exceção I - [Criando um plantão para um horário/dia/setor de plantão já existente]

|                        Ações do ator                               |                              Ações do sistema                                                                 |
| :----------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------: |
|         2.1 - Seleciona um horário em determinado dia              |                                                                                                               |
|                                                                    |      2.2 - Exibe mensagem de erro informando que não é possível criar plantão com horário/dia/setor repetidos |

## Fluxo Exceção II - [Removendo plantão já pego ou com data passada]

|                        Ações do ator                               |                              Ações do sistema                                                                   |
| :----------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------: |
|         1.1.2.1 - Seleciona a opção excluir                        |                                                                                                                 |
|                                                                    |      1.1.2.2 - Exibe mensagem de erro informando que não é possível remover plantão já pego ou com data passada |

## Fluxo Exceção III - [Buscando plantão inexistente]

|                        Ações do ator                               |                              Ações do sistema                                                          |
| :----------------------------------------------------------------: | :----------------------------------------------------------------------------------------------------: |
|         1.a - Seleciona um plantão                                 |                                                                                                        |
|                                                                    |      1.a.1 - Exibe mensagem de erro informando que não foi possível encontrar plantão na base de dados |

## Protótipo

## Diagramas de Atividade

### Criar Plantão
<img width="1181" height="1210" alt="CDU - Criar Plantão" src="https://github.com/user-attachments/assets/55da288c-b587-4eab-b879-94c961b9b478" />

### Detalhar Plantão
<img width="1068" height="929" alt="CDU - Detalhar Plantão" src="https://github.com/user-attachments/assets/49a22c33-2179-47cf-8327-cf2c79ee2611" />

### Atualizar Plantão
<img width="1129" height="1224" alt="CDU - Atualizar Plantão" src="https://github.com/user-attachments/assets/2695a7b8-7e7b-4eb5-b7fd-b2bbb2c36821" />

### Excluir Plantão
<img width="838" height="1129" alt="CDU - Excluir Plantão" src="https://github.com/user-attachments/assets/52d9ceb0-6eef-4486-b957-cf4422c9d6fe" />

## Diagrama de Interação (Sequência ou Comunicação)

## Diagrama de Classes de Projeto
