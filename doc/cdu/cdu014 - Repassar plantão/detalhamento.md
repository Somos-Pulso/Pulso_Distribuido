# CDU014. Repassar plantão

* **Ator principal**: Médico PJ ou CLT
* **Atores secundários**: Líder de escala (quando necessário para aprovar)
* **Resumo**: O médico titular de um plantão disponibiliza sua vaga no feed, para que outro médico possa assumi-la posteriormente, garantindo a manutenção da cobertura do plantão.
* **Pré-condição**: Deve existir um plantão previamente alocado ao médico titular, dentro de uma escala válida, e o sistema deve ter médicos cadastrados.
* **Pós-condição**: O plantão fica marcado como “Disponível para troca” no feed, aguardando que outro médico assuma a vaga.


### Fluxo Principal – Repassar Plantão

| Ações do Médico Titular (que vai repassar)                                        | Ações do Sistema |
|-----------------------------------------------------------------------------------|------------------|
| **1 - O médico titular acessa** o feed e seleciona o plantão que deseja repassar. | |
| **2 - Disponibiliza** o plantão para troca, podendo indicar o pagamento de ágil.  | **3 - O sistema atualiza** o status do plantão no feed, marcando-o como “Disponível para troca”. |


### Fluxos Alternativos – Repassar Plantão

## Fluxo Alternativo I – [Indicar pagamento de ágil opcional]
| Ações do Médico Titular | Ações do Sistema |
|------------------------|-----------------|
| Disponibiliza o plantão e opta por indicar pagamento de ágil | O sistema exibe o valor informado e atualiza o plantão no feed com a informação do ágil, destacando-o para outros médicos. |

## Fluxo Alternativo II – [Plantão parcialmente preenchido]
| Ações do Médico Titular | Ações do Sistema |
|------------------------|-----------------|
| Disponibiliza apenas parte do horário do plantão (ex.: metade do turno) | O sistema atualiza o status do plantão no feed como “Disponível para troca parcial” e ajusta os horários visíveis. |

## Fluxo Alternativo III – [Suspender repasse antes de ser assumido]
| Ações do Médico Titular | Ações do Sistema |
|------------------------|-----------------|
| Decide **retirar** o plantão do feed antes que outro médico o assuma | O sistema atualiza o status do plantão para “Não disponível para troca” e mantém o plantão alocado ao titular. |

## Fluxo Alternativo IV – [Editar informações antes de disponibilizar]
| Ações do Médico Titular | Ações do Sistema |
|------------------------|-----------------|
| Altera dados do plantão (ex.: descrição, observações, horário) antes de disponibilizar | O sistema salva as alterações e atualiza o plantão no feed com as novas informações antes de marcar como disponível para troca. |



## Protótipo


> Obs. as seções a seguir apenas serão utilizadas na segunda unidade do PDSWeb (segundo orientações do gerente do projeto).

## Diagrama de Interação (Sequência ou Comunicação)



## Diagrama de Classes de Projeto

