# CDU00X. Gerenciar líderes de escala

* **Ator principal**: RH  
* **Atores secundários**: Líder de escala  
* **Resumo**: O RH do hospital pode criar, editar, visualizar e remover líderes de escala no sistema. Ao criar, o RH informa apenas o e-mail (Gmail) do novo líder de escala e associa ele aos setores disponíveis do hospital, e o sistema cria automaticamente a conta, gerando uma senha inicial e enviando-a por e-mail. O líder de escala, após receber o acesso, pode alterar sua senha e utilizar as funcionalidades de gerenciamento de escalas e plantões.  
* **Pré-condição**:  
  - O hospital deve estar previamente cadastrado no sistema.  
* **Pós-condição**:  
  - O líder de escala terá uma conta criada automaticamente, estará vinculado ao hospital e poderá acessar as funcionalidades de gerenciamento de escalas e plantões do devido setor que ele foi associado.  

### Fluxo Principal

| Ações do RH                                                                 | Ações do Sistema                                                                                                                                                                |
| ---------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **1 - Seleciona** a opção "Líderes de escala" no menu administrativo do hospital |                                                                                                                                                                                 |
|                                                                              | **2 - O sistema exibe** a lista de líderes de escala já cadastrados no hospital, com opções para criar, editar ou remover registros.                                             |
| **3 - Escolhe** a ação "Criar líder de escala"                               |                                                                                                                                                                                 |
|                                                                              | **4 - O sistema exibe** formulário solicitando: Gmail do líder de escala, data de início e status da vinculação.                                                                |
| **5 - Informa** o Gmail e os dados do vínculo                                |                                                                                                                                                                                 |
|                                                                              | **6 - O sistema cria** automaticamente a conta do líder de escala, gera uma senha temporária, envia para o Gmail informado e atualiza a lista exibindo o novo cadastro/vínculo. |

---

### Fluxo Alternativo FA1 - Editar líder de escala

| Ações do RH                                            | Ações do Sistema                                      |
| ------------------------------------------------------ | ----------------------------------------------------- |
| **1 - Seleciona** um líder de escala já cadastrado     |                                                       |
|                                                        | **2 - O sistema exibe** formulário com os dados atuais |
| **3 - Edita** as informações desejadas e confirma      |                                                       |
|                                                        | **4 - O sistema atualiza** o registro na lista         |

---

### Fluxo Alternativo FA2 - Remover líder de escala

| Ações do RH                                            | Ações do Sistema                                        |
| ------------------------------------------------------ | ------------------------------------------------------- |
| **1 - Seleciona** um líder de escala da lista          |                                                         |
|                                                        | **2 - O sistema solicita** confirmação da remoção        |
| **3 - Confirma** a exclusão                            |                                                         |
|                                                        | **4 - O sistema remove** o registro e atualiza a lista   |

---

## Protótipo


> Obs. as seções a seguir apenas serão utilizadas na segunda unidade do PDSWeb (segundo orientações do gerente do projeto).

## Diagrama de Interação (Sequência ou Comunicação)



## Diagrama de Classes de Projeto


