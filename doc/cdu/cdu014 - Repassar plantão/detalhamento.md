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




## Protótipo


> Obs. as seções a seguir apenas serão utilizadas na segunda unidade do PDSWeb (segundo orientações do gerente do projeto).

## Diagrama de Interação (Sequência ou Comunicação)



## Diagrama de Classes de Projeto

