# CDU016. Consultar Feed de Plantões

* **Ator principal**: Médico PJ ou CLT
* **Atores secundários**: Nenhum
* **Resumo**: O médico acessa o feed de plantões disponíveis e pode aplicar filtros ou buscas para visualizar os plantões de seu interesse, como por hospital, localidade, setor, sala ou especialidade.
* **Pré-condição**: Deve existir plantões cadastrados e disponíveis no feed.
* **Pós-condição**: O sistema exibe a lista de plantões de acordo com os filtros aplicados pelo médico.

---

### Fluxo Principal – Consultar Feed de Plantões

| Ações do Médico | Ações do Sistema |
|-----------------|-----------------|
| **1 - Acessa** o feed de plantões disponíveis. | |
| **2 - Aplica filtros** conforme hospital, localidade, setor, sala ou especialidade, se desejar. | **3 - O sistema atualiza** a lista de plantões de acordo com os critérios informados. |
| **4 - Visualiza** os plantões filtrados e seleciona qualquer plantão de interesse. | |

---

### Fluxos de Exceção

## Fluxo Exceção I - [Nenhum plantão disponível]
| Ações do ator | Ações do sistema |
| :-----------: | :--------------: |
| Acessa o feed de plantões || 
|| Exibe mensagem: “Não há plantões disponíveis no momento.” |

## Fluxo Exceção II - [Filtros não retornam resultados]
| Ações do ator | Ações do sistema |
| :-----------: | :--------------: |
| Aplica filtros que não correspondem a nenhum plantão || 
|| Exibe mensagem: “Nenhum plantão encontrado com os critérios informados.” |

## Fluxo Exceção III - [Falha no carregamento do feed]
| Ações do ator | Ações do sistema |
| :-----------: | :--------------: |
| Acessa o feed de plantões || 
|| Exibe mensagem: “Ocorreu um erro ao carregar o feed de plantões. Tente novamente mais tarde.” |



## Protótipo


> Obs. as seções a seguir apenas serão utilizadas na segunda unidade do PDSWeb (segundo orientações do gerente do projeto).

## Diagrama de Interação (Sequência ou Comunicação)



## Diagrama de Classes de Projeto

