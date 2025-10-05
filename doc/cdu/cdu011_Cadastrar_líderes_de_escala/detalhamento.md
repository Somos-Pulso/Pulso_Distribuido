# CDU011. Cadastrar Líderes de Escala

* **Ator principal**: RH da instituição
* **Atores secundários**: Sistema
* **Resumo**: O RH do hospital pode cadastrar líderes de escala no sistema se a pessoa ainda não possuir cadastro. O sistema cria automaticamente a conta, marcando-a como líder de escala, gerando uma senha inicial que poderá ser redefinida pelo próprio líder, com acesso as funcionalidades de líder.
* **Pré-condição**: O hospital deve estar previamente cadastrado no sistema.  
* **Pós-condição**: O líder de escala estará vinculado ao hospital e as especialidades definidas, com conta ativa no sistema.

## Fluxo Principal

| Ações do Ator                                                                                 | Ações do Sistema                                                                |
| --------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| 1 - Seleciona a opção "Cadastrar novo líder de escala" no menu administrativo da instituição. |                                                                                 |
|                                                                                               | 2 - Exibe o formulário de criação de usuário.                                   |
| 3 - Informa informações básicas do usuário e envia.                                           |                                                                                 |
|                                                                                               | 4 - Valida entradas, cria usuário, líder de escala e vínculo com a instituição. |

---

## Fluxos Exceção

### Fluxo Exceção I - [Dados incorretos]

| Ações do Ator                                          | Ações do Sistema                                                                       |
| ------------------------------------------------------ | -------------------------------------------------------------------------------------- |
| 3.1 - Seleciona um líder de escala já cadastrado.      |                                                                                        |
|                                                        | 3.2 - Exibe erro informando que não foi possível cadastrar líder por dados incorretos. |

---

## Protótipo

## Diagrama de Interação (Sequência ou Comunicação)

## Diagrama de Classes de Projeto