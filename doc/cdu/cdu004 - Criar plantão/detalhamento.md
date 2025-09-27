# CDU004. Criar plantão

* **Ator principal**: Líder de escala
* **Atores secundários**: Médicos CLT's
* **Resumo**: O líder de escala, ao escolher uma data, cria um plantão, informando horário de início e fim, alocando médicos para esse plantão.
* **Pré-condição**: Deve existir uma escala previamente criada e médicos cadastrados no sistema.
* **Pós-condição**: O plantão é criado e inserido corretamente na escala da data escolhida, com os médicos devidamente alocados.

### Fluxo Principal

| Ações do líder de escala                                                                           | Ações do Sistema                                                                                                                                                                                                                    |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **1 - Seleciona** o dia específico na escala                                       |                                                                                                                                                                                                                                     |
|                                                                                           | **2 - O sistema exibe** o formulário para criação do plantão, com campos para horário de início, horário de término, seleção do(s) médico(s) e descrição. Campos como data, hospital, setor e líder de escala já vêm preenchidos automaticamente. |
| **3 - O líder de escala preenche** os horários de entrada e saída e seleciona o(s) médico(s) desejado(s) caso já definidos |                                                                                                                                                                                                                                     |
|                                                                                           | **4 - O sistema salva** o plantão no calendário da escala.       



## Protótipo


> Obs. as seções a seguir apenas serão utilizadas na segunda unidade do PDSWeb (segundo orientações do gerente do projeto).

## Diagrama de Interação (Sequência ou Comunicação)



## Diagrama de Classes de Projeto

