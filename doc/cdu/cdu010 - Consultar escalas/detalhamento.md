# CDU010. Consultar Escalas

- **Ator principal**: Médico CLT  
- **Atores secundários**: Sistema  
- **Resumo**: Permite que o médico CLT visualize as escalas dos plantões nos quais está alocado, incluindo informações como nome da escala, período, setor, status, cobertura e eventuais alertas de conflito.  
- **Pré-condição**: O médico CLT está autenticado e selecionou a opção "Minhas Escalas".  
- **Pós-condição**: A lista de escalas do médico é exibida com todos os dados relevantes e pronta para possíveis interações adicionais, como visualização de detalhes.  

## Fluxo Principal
| Ações do ator | Ações do sistema |
| :-----------: | :--------------: |
| 0 - Seleciona a opção "Minhas Escalas" | |
| | 1 - O sistema carrega a lista de escalas associadas ao médico CLT |
| 2 - Visualiza as escalas listadas | |
| |3 - Exibe as escalas com informações de nome, período, setor, status, cobertura e alertas |

## Fluxo Alternativo I - [Filtragem ou busca de escalas]
| Ações do ator | Ações do sistema |
| :-----------: | :--------------: |
| 1.1 - Aplica filtros ou busca uma escala específica ||
|| 1.2 - Atualiza a lista de escalas de acordo com os critérios informados |

## Fluxo Exceção I - [Nenhuma escala associada]
| Ações do ator | Ações do sistema |
| :-----------: | :--------------: |
| 0.1 - Acessa a tela "Minhas Escalas" ||
|| 0.2 - Exibe mensagem: “Você não possui escalas cadastradas no momento.” |

## Fluxo Exceção II - [Falha no carregamento das escalas]
| Ações do ator | Ações do sistema |
| :-----------: | :--------------: |
| 0.a - Acessa a tela "Minhas Escalas" ||
|| 0.b - Exibe mensagem de erro: “Ocorreu um erro ao carregar suas escalas. Tente novamente mais tarde.” |

## Protótipo

> Obs. as seções a seguir apenas serão utilizadas na segunda unidade do PDSWeb (segundo orientações do gerente do projeto).

## Diagrama de Interação (Sequência ou Comunicação)

## Diagrama de Classes de Projeto
