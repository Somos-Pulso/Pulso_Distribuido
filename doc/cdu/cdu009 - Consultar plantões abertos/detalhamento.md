# CDU09. Consultar Plantões Abertos

* **Ator principal**: Médico
* **Atores secundários**: Sistema
* **Resumo**: O médico acessa o feed de plantões abertos - seja disponiveis por escalas publicadas ou vindas de algum repasse de outro médico. É possivel aplicar filtros ou buscas para visualizar os plantões de seu interesse, como por hospital, localidade, setor, sala ou especialidade.
* **Pré-condição**: Médico logado no sistema e plantões disponíveis vindo de escalas publicadas ou de repasses.
* **Pós-condição**: O sistema exibe a lista de plantões de acordo com os filtros aplicados pelo médico.

## Fluxo Principal

| Ações do Médico                                                                             | Ações do Sistema                                                                      |
|---------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------|
| 1 - Acessa o feed de plantões abertos.                                                      |                                                                                       |
|                                                                                             | 2 - Busca plantões abertos baseados no perfil do médico solicitante e exibe listagem. |
| 3 - Aplica filtros conforme hospital, localidade, setor, sala ou especialidade, se desejar. |                                                                                       |
|                                                                                             | 4 - Atualiza a lista de plantões de acordo com os critérios informados.               |
| 5 - Visualiza os plantões filtrados.                                                        |                                                                                       |

---

## Fluxos de Exceção

### Fluxo Exceção I - [Nenhum plantão disponível]
| Ações do ator                    | Ações do sistema                                                |
| :------------------------------: | :-------------------------------------------------------------: |
| 1.1 - Acessa o feed de plantões. |                                                                 | 
|                                  | 1.2 - Exibe mensagem: “Não há plantões disponíveis no momento.” |

### Fluxo Exceção II - [Filtros não retornam resultados]
| Ações do ator                                               | Ações do sistema                                                               |
| :---------------------------------------------------------: | :----------------------------------------------------------------------------: |
| 3.1 - Aplica filtros que não correspondem a nenhum plantão. |                                                                                | 
|                                                             | 3.2 - Exibe mensagem: “Nenhum plantão encontrado com os critérios informados.” |

### Fluxo Exceção III - [Falha no carregamento do feed]
| Ações do ator                    | Ações do sistema                                                                                    |
| :------------------------------: | :-------------------------------------------------------------------------------------------------: |
| 1.a - Acessa o feed de plantões. |                                                                                                     | 
|                                  | 1.b - Exibe mensagem: “Ocorreu um erro ao carregar o feed de plantões. Tente novamente mais tarde.” |

---

## Protótipo

## Diagrama de Interação (Sequência ou Comunicação)

## Diagrama de Classes de Projeto

