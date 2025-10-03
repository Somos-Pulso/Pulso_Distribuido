# CDU00X. Gerenciar setores

* **Ator principal**: RH  
* **Atores secundários**: —  
* **Resumo**: O RH do hospital pode criar, editar, visualizar e remover setores do hospital. Esses setores representam áreas específicas (ex.: UTI, Emergência, Pediatria, Clínica Geral) e são utilizados para organizar escalas, plantões e alocação de médicos.  
* **Pré-condição**:  
  - O hospital deve estar previamente cadastrado no sistema.  
* **Pós-condição**:  
  - O setor estará cadastrado (ou atualizado/removido) e poderá ser utilizado nos plantões, escalas e outras funcionalidades do sistema.  

### Fluxo Principal

| Ações do RH                                                        | Ações do Sistema                                                                                                        |
| ------------------------------------------------------------------ | ----------------------------------------------------------------------------------------------------------------------- |
| **1 - Seleciona** a opção "Setores" no menu administrativo do hospital |                                                                                                                         |
|                                                                    | **2 - O sistema exibe** a lista de setores já cadastrados no hospital, com opções para criar, editar ou remover registros |
| **3 - Escolhe** a ação "Criar setor"                               |                                                                                                                         |
|                                                                    | **4 - O sistema exibe** formulário solicitando: nome do setor, descrição e status (ativo/inativo).                       |
| **5 - Preenche** as informações e confirma                         |                                                                                                                         |
|                                                                    | **6 - O sistema salva** o setor e atualiza a lista exibindo o novo registro.                                             |

---

### Fluxo Alternativo FA1 - Editar setor

| Ações do RH                                        | Ações do Sistema                                      |
| -------------------------------------------------- | ----------------------------------------------------- |
| **1 - Seleciona** um setor já cadastrado           |                                                       |
|                                                    | **2 - O sistema exibe** formulário com os dados atuais |
| **3 - Edita** as informações desejadas e confirma  |                                                       |
|                                                    | **4 - O sistema atualiza** o setor na lista            |

---

### Fluxo Alternativo FA2 - Remover setor

| Ações do RH                                        | Ações do Sistema                                        |
| -------------------------------------------------- | ------------------------------------------------------- |
| **1 - Seleciona** um setor da lista                |                                                         |
|                                                    | **2 - O sistema solicita** confirmação da remoção        |
| **3 - Confirma** a exclusão                        |                                                         |
|                                                    | **4 - O sistema remove** o setor e atualiza a lista      |

---

## Protótipo


> Obs. as seções a seguir apenas serão utilizadas na segunda unidade do PDSWeb (segundo orientações do gerente do projeto).

## Diagrama de Interação (Sequência ou Comunicação)


## Diagrama de Classes de Projeto

