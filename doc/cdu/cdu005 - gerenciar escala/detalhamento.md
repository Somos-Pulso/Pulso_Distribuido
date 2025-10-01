# CDU005. Gerenciar Escala

- **Ator principal**: Líder de Escala
- **Atores secundários**: Sistema
- **Resumo**: Permite ao líder de escala criar e gerenciar escalas médicas, inserindo dados básicos e escolhendo se deseja reutilizar uma escala modelo (template) ou iniciar uma escala vazia. Após a criação, é possível editar ou excluir a escala conforme regras de negócio.
- **Pré-condição**: O líder de escala deve estar autenticado no sistema.
- **Pós-condição**: Uma nova escala é criada, pronta para edição e gerenciamento.

## Fluxo Principal

|                                             Ações do ator                                            |                                                             Ações do sistema                                                             |
| :--------------------------------------------------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------: |
|                                   1 - Acessa a opção “Criar Escala”                                  |                                                                                                                                          |
|                                                                                                      | 2 - Exibe formulário para criação da escala com campos: nome da escala, mês de referência, especialidade, setor e opção de usar template |
|                        3 - Preenche os dados do formulário e confirma criação                        |                                                                                                                                          |
|                                                                                                      |                                 4 - Recebe os dados informados, valida campos obrigatórios e consistência                                |
|                                                                                                      |                   5 - Se não escolheu template: cria escala com plantões vazios seguindo horários fixos da instituição                   |
|                                                                                                      |                                 6 - Redireciona o líder de escala para a tela de detalhes da nova escala                                 |

## Fluxo Alternativo I - [Líder quer Template]

| Ações do ator                                                                         | Ações do sistema                                                                                                                              |
| :-----------------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------: |
| 3.1 - Preenche os dados do formulário informando que quer template e confirma criação |                                                                                                                                               |
|                                                                                       | 3.2 - Recebe os dados informados, valida campos obrigatórios e consistência                                                                   |
|                                                                                       | 3.3 - Cria nova escala replicando os plantões e se tiverem, suas alocações fixas e combinadas do template, adaptadores ao mês de referência   |
|                                                                                       | 3.4 - Redireciona o líder de escala para a tela de detalhes da nova escala                                                                    |

## Fluxo Alternativo II - [Editar dados da escala]

|                      Ações do ator                      |                    Ações do sistema                    |
| :-----------------------------------------------------: | :----------------------------------------------------: |
| 1.1 - Na tela de detalhes da escala, seleciona “Editar” |                                                        |
|                                                         |  1.2 - Exibe formulário de edição dos dados da escala  |
|          1.3 - Atualiza as informações e salva          |                                                        |
|                                                         | 1.4 - Sistema valida alterações e salva os novos dados |


## Fluxo Alternativo III - [Excluir escala]

|                       Ações do ator                      |                                      Ações do sistema                                      |
| :------------------------------------------------------: | :----------------------------------------------------------------------------------------: |
| 1.a - Na tela de detalhes da escala, seleciona “Excluir” |                                                                                            |
|                                                          | 1.b - Verifica se a escala ainda não foi publicada                                         |
|                                                          |                    1.c - Remove a escala e dados oriundos dela                             |
| 1.d - Redirecionado para listagem de escalas             |                                                                                            |

## Fluxo Alternativo IV - [Detalhar escala]

|                       Ações do ator                                                |                                      Ações do sistema                                 |
| :--------------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------: |
| 1.a2 - Seleciona escala específica da listagem de escalas ou plantão de referencia |                                                                                       |
|                                                                                    | 1.b2 - Recupera os dados da escala, plantão, alocação e profissionais para amostragem |
| 1.c2 - Visualiza escala montada                                                    |                                                                                       |

## Fluxo Alternativo V - [Listar escala]

|                       Ações do ator        |                                      Ações do sistema        |
| :----------------------------------------: | :----------------------------------------------------------: |
| 1.a3 - Seleciona opção de "Minhas escalas" |                                                              |
|                                            | 1.b3 - Recupera escalas vinculadas ao lider de escala logado |
| 1.c3 - Visualiza listagem de escalas       |                                                              |

## Fluxo Exceção I - [Falha na validação dos dados]

|                                    Ações do ator                                   |                             Ações do sistema                            |
| :--------------------------------------------------------------------------------: | :---------------------------------------------------------------------: |
| 0.1 - Preenche formulário de criação da escala com dados incorretos ou incompletos |                                                                         |
|                                                                                    | 0.2 - Exibe mensagem de erro destacando os campos inválidos ou ausentes |

## Fluxo Exceção II - [Excluir escala já publicada]

|                                    Ações do ator            |                             Ações do sistema                                                 |
| :---------------------------------------------------------: | :------------------------------------------------------------------------------------------: |
| 1.a.1 - Na tela de detalhes da escala, seleciona “Excluir”  |                                                                                              |
|                                                             | 1.a.2 - Verifica se a escala ainda não foi publicada                                         |
|                                                             | 1.a.3 - Exibe mensagem de erro informando que não é possível excluir uma escala já publicada |

## Fluxo Exceção III - [Detalhar escala inexistente]

|                       Ações do ator                                                  |                                      Ações do sistema                                   |
| :----------------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------: |
| 1.a2.1 - Seleciona escala específica da listagem de escalas ou plantão de referencia |                                                                                         |
|                                                                                      | 1.a2.2 - Exibe mensagem de erro informando que não foi possível encontrar escala        |

## Protótipo

## Diagramas de Atividade

### Criar Escala
<img src="https://github.com/user-attachments/assets/cedd797b-77e3-4428-9dbe-8e48941f0481" alt="CDU - Criar Escala" width="800"/>

### Listar Escalas
<img src="https://github.com/user-attachments/assets/8e378210-73b0-428e-bbfe-af867fac944d" alt="CDU - Listar Escalas" width="800"/>

### Detalhar Escala
<img src="https://github.com/user-attachments/assets/d0dd131c-4ca6-4d93-a783-6a1d49ae1f1b" alt="CDU - Detalhar Escala" width="800"/>

### Atualizar Escala
<img src="https://github.com/user-attachments/assets/5b867aa1-5e3b-4163-8c32-c6ee07a1f17f" alt="CDU - Atualizar Escala" width="800"/>

### Excluir Escala
<img src="https://github.com/user-attachments/assets/6b02243d-0530-40f6-a922-7bc134894e76" alt="CDU - Excluir Escala" width="800"/>

## Diagrama de Interação (Sequência ou Comunicação)

## Diagrama de Classes de Projeto
