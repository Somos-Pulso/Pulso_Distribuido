# CDU015. Demonstrar Interesse em Plantão

* **Ator principal**: Médico PJ ou CLT
* **Atores secundários**: Líder de escala (quando necessário para aprovar)
* **Resumo**: O médico devidamente logado acessa o feed de plantões disponíveis para repasse, verifica os requisitos de especialidade e solicita assumir o plantão desejado. O sistema também valida se não há conflito de horários com outros plantões do médico,
* garantindo que a cobertura seja mantida.
* **Pré-condição**: Deve existir pelo menos um plantão disponível para repasse no feed e o médico deve possuir a especialidade necessária para assumir o plantão.
* **Pós-condição**: O sistema registra a solicitação de repasse do plantão e, após aprovação (do médico inicialmente responsável pelo plantão ou do líder de escala, conforme regra definida), o médico passa a ser o responsável pelo plantão.


### Fluxo Principal – Demonstrar Interesse em Plantão

| Ações do Médico Interessado | Ações do Sistema                                                                                                                                |
|-----------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------|
| **1 - O médico acessa** o feed de plantões disponíveis. |                                                                                                                                                 |
| **2 - Seleciona** o plantão que deseja assumir. |                                                                                                                                                 |
| **3 - Verifica** se possui a especialidade exigida para o plantão. | **4 - O sistema valida** se o médico possui a especialidade exigida e se não há conflito de horários com outros plantões já alocados.           |
| **5 - Solicita** assumir o plantão. | **6 - O sistema registra** a solicitação e aguarda aprovação (automática, aprovada pelo médico inicialmente responsável ou do líder de escala). |
| | **7 - Atualiza** o status do plantão para “Solicitação em andamento”.                                                                           |




## Protótipo


> Obs. as seções a seguir apenas serão utilizadas na segunda unidade do PDSWeb (segundo orientações do gerente do projeto).

## Diagrama de Interação (Sequência ou Comunicação)



## Diagrama de Classes de Projeto

