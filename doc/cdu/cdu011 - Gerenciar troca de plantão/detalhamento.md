# CDU011. Gerenciar troca de plantão

* **Ator principal**: Médico PJ
* **Atores secundários**: Médico PJ e Líder de Escala
* **Resumo**: Permite que médicos PJ solicitem a troca de um plantão em que já estão alocados com algum outro médico escolhido pelo solicitante.
* **Pré-condição**: O médico PJ estar devidamente autenticado no sistema e ter um plantão vinculado a si.
* **Pós-condição**: Plantão devidamente encaminhado para o médico solicitado e registro de troca aberto e salvo no sistema.


### Fluxo Principal

| Ações do Ator                                                                                         | Ações do Sistema                                                                                                    |
|-------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------|
| 1. O médico seleciona "Criar nova troca" ou "Trocar/Repassar" pelo plantão.                           |                                                                                                                     |
|                                                                                                       | 2. O sistema exibe formulário de criação de troca.                                                                  |
| 3. O médico informa plantão que deseja trocar, médico que deseja fazer a troca e comentário da troca. |                                                                                                                     |
|                                                                                                       | 4. O sistema valida dados de entrada, cria nova troca do tipo "dupla" e envia solicitação para o médico solicitado. |

## Fluxo Alternativo I – [Repassar plantão]
| Ações do Ator                                                          | Ações do Sistema                                                            |
|------------------------------------------------------------------------|-----------------------------------------------------------------------------|
| 3.1. O médico informa plantão que deseja trocar e comentário de troca. |                                                                             |
|                                                                        | 3.2. O sistema valida dados de entrada e cria nova troca do tipo "simples". |

## Fluxo Alternativo II – [Atualizar troca]
| Ações do Ator                                                 | Ações do Sistema                                                                                   |
|---------------------------------------------------------------|----------------------------------------------------------------------------------------------------|
| 1.1. O médico seleciona troca de interesse para atualização.  |                                                                                                    |
|                                                               | 1.2. O sitema exibe dados atuais da troca para edição.                                             |
| 1.3 O médico envia dados atualizados da troca para o sistema. |                                                                                                    |
|                                                               | 1.4 O sistema valida dados de entrada e envia aviso de mudança para o médico solicitado, se tiver. |

## Fluxo Alternativo III – [Excluir troca]
| Ações do Ator                                               | Ações do Sistema                                                            |
|-------------------------------------------------------------|-----------------------------------------------------------------------------|
| 1.1.1. O médico seleciona troca de interesse para exclusão. |                                                                             |
|                                                             | 1.1.2. O sistema valida exclusão da troca e remove dos registros do médico. |

## Fluxo Alternativo IV – [Detalhar troca]
| Ações do Ator                                                              | Ações do Sistema                                                                    |
|----------------------------------------------------------------------------|-------------------------------------------------------------------------------------|
| 1.a. O médico seleciona troca de interesse para ver dados de detalhamento. |                                                                                     |
|                                                                            | 1.b. O sistema resgata informações da troca, plantão e médico solicitado, se tiver. |
| 1.c. O médico visualiza dados reunidos.                                    |                                                                                     |

## Fluxo Alternativo V = [Listar trocas]
| Ações do Ator                                             | Ações do Sistema                                        |
|-----------------------------------------------------------|---------------------------------------------------------|
| 1.a.1. O médico seleciona opção de "Minhas solicitações". |                                                         |
|                                                           | 1.a.2. Sistema resgata trocas feitas pelo médico loado. |

## Fluxo Exceção I - [Atualizar troca confirmada ou recusada]
| Ações do Ator                                                                              | Ações do Sistema                                                                                                                 |
|--------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------|
| 1.3.1. O médico envia dados atualizados da troca já confirmada ou recusada para o sistema. |                                                                                                                                  |
|                                                                                            | 1.3.2. O sistema exibe mensagem de erro informando que não é possível fazer a atualização de uma troca já confimada ou recusada. |

## Fluxo Exceção II - [Excluir troca confirmada ou recusada]
| Ações do Ator                                                                       | Ações do Sistema                                                                                                                 |
|-------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------|
| 1.1.1.1. O médico seleciona troca confimada ou recusada de interesse para exclusão. |                                                                                                                                  |
|                                                                                     | 1.1.1.2. O sistema exibe mensagem de erro informando que não é possível fazer a exclusão de uma troca já confirmada ou recusada. |

## Fluxo Exceção III - [Interação com troca inexistente]
| Ações do Ator                                         | Ações do Sistema                                                                                           |
|-------------------------------------------------------|------------------------------------------------------------------------------------------------------------|
| 3.a. O médico informa plantão inexistente para trocar |                                                                                                            |
|                                                       | 3.b. O sistema exibe mensagem de erro informando que não foi possível encontrar o plantão na base de dados |

## Protótipo

## Diagramas de Atividade

### Criar troca de plantão
<img width="2720" height="1520" alt="CDU - Criar Troca de Plantao" src="https://github.com/user-attachments/assets/9dc3e21f-2f0b-4ab3-9ed4-d6e7e8ff68a9" />

## Diagrama de Interação (Sequência ou Comunicação)

## Diagrama de Classes de Projeto
