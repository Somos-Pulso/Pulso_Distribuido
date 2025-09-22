# CDU001. Ver Escalas

- **Ator principal**: Líder de escala e Médico
- **Atores secundários**: Sistema
- **Resumo**: Permite a visualização a lista de escalas criadas, incluindo informações como nome, período, setor, criador, status, cobertura e alertas de conflito.
- **Pré-condição**: O líder de escala está autenticado e clicou na opção "Escalas".
- **Pós-condição**: A lista de escalas é apresentada com os dados relevantes e pronta para interações adicionais.

## Fluxo Principal
| Ações do ator | Ações do sistema |
| :-----------: | :--------------: |
| 0 - Seleciona a opção de listagem de escalas | ... |
| ... | 1 - O sistema carrega a lista de escalas cadastradas|

## Fluxo Alternativo I - [Filtragem ou busca de escalas]
| Ações do ator | Ações do sistema |
| :-----------: | :--------------: |
| 1.1 - Aplica filtros ou busca uma escala específica | ... |
| ... | 1.2 - Atualiza a lista de escalas com base nos critérios informados |

## Fluxo Exceção I - [Lista de escalas vazia]
| Ações do ator | Ações do sistema |
| :-----------: | :--------------: |
| 0.1 - Acessa a tela de escalas | ... |
| ... | 0.2 - Exibe mensagem: “Nenhuma escala criada até o momento.” |

## Fluxo Exceção II - [Falha no carregamento das escalas]
| Ações do ator | Ações do sistema |
| :-----------: | :--------------: |
| 0.a - Acessa a tela de escalas | ... |
| ... | 0.b - Exibe mensagem de erro: “Ocorreu um erro ao carregar as escalas. Tente novamente mais tarde.” |

## Protótipo


> Obs. as seções a seguir apenas serão utilizadas na segunda unidade do PDSWeb (segundo orientações do gerente do projeto).

## Diagrama de Interação (Sequência ou Comunicação)



## Diagrama de Classes de Projeto

