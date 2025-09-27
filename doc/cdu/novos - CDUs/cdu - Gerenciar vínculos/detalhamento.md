# CDU00X. Gerenciar vínculo

* **Ator principal**: RH  
* **Atores secundários**: Médico  
* **Resumo**: O RH do hospital pode criar, editar, visualizar e remover vínculos de médicos já cadastrados no sistema, associando-os ao hospital. Somente após esse vínculo o médico passa a ter acesso às escalas, plantões e demais funcionalidades do hospital.  
* **Pré-condição**:  
  - O médico já deve estar previamente cadastrado no sistema.  
  - O hospital deve estar cadastrado no sistema.  
* **Pós-condição**:  
  - O médico estará vinculado (ou desvinculado) ao hospital, podendo ou não ter acesso às funcionalidades relacionadas ao hospital.  

### Fluxo Principal

| Ações do RH                                                                 | Ações do Sistema                                                                                                                                                                                   |
| ---------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **1 - Seleciona** a opção "Médicos" no menu administrativo do hospital |                                                                                                                                                                                                    |
|                                                                              | **2 - O sistema exibe** a lista de médicos vinculados aos hospital, com opções para criar, editar ou remover vínculos.                                                      |
| **3 - Escolhe** a ação "Criar vínculo"                                       |                                                                                                                                                                                                    |
|                                                                              | **4 - O sistema exibe** formulário com campos: seleção do médico (lista de médicos cadastrados), tipo de contratação (CLT, parceiro, etc.), data de início e status do vínculo.                     |
| **5 - Preenche** as informações e confirma                                   |                                                                                                                                                                                                    |
|                                                                              | **6 - O sistema salva** o vínculo e atualiza a lista exibindo o novo vínculo do médico ao hospital.                                                                                                 |

---

### Fluxo Alternativo FA1 - Editar vínculo existente

| Ações do RH                                            | Ações do Sistema                                      |
| ------------------------------------------------------ | ----------------------------------------------------- |
| **1 - Seleciona** um vínculo já criado                 |                                                       |
|                                                        | **2 - O sistema exibe** formulário com os dados atuais |
| **3 - Edita** os dados desejados e confirma            |                                                       |
|                                                        | **4 - O sistema atualiza** o vínculo na lista          |

---

### Fluxo Alternativo FA2 - Remover vínculo

| Ações do RH                                            | Ações do Sistema                                        |
| ------------------------------------------------------ | ------------------------------------------------------- |
| **1 - Seleciona** um vínculo da lista                  |                                                         |
|                                                        | **2 - O sistema solicita** confirmação da remoção        |
| **3 - Confirma** a exclusão                            |                                                         |
|                                                        | **4 - O sistema remove** o vínculo e atualiza a lista    |

---

## Protótipo


> Obs. as seções a seguir apenas serão utilizadas na segunda unidade do PDSWeb (segundo orientações do gerente do projeto).

## Diagrama de Interação (Sequência ou Comunicação)



## Diagrama de Classes de Projeto

