# CDU002. Criar Escala

- **Ator principal**: Líder de escala
- **Atores secundários**: Médico	 
- **Resumo**: O líder de escala após clicar em um botão, pode criar uma escala.
- **Pré-condição**: O usuário deve ter uma conta do tipo líder de escala e ser autenticado.
- **Pós-Condição**: Feedback de ação bem sucedida ou erro após cada interação.

## Fluxo Principal
| Ações do ator | Ações do sistema |
| :-----------------: | :-----------------: | 
| 1 - O líder de escala acessa a interface de criação de escala. | |  
| | 2 - O sistema mostra a interface da cricação de escala, sendo possível informar o nome, o setor e o periodo da escala. |
| 3 - Preenche os dados obrigatórios (nome, setor, período inicial e príodo final). | |  
| | 4 - O sistema valida os dados e cria a nova escala e então o caso de uso é finalizado | 
| | 5 - O líder de escala é redirecionado para a tela de criação de plantões associados.| 

## Fluxo de Exceção - [Escala duplicada]
| Ações do ator | Ações do sistema |
| :-----------------: | :-----------------: | 
| 2.1 - O líder de escala tenta criar uma escala para um setor e período que já possuem uma escala ativa.| |  
| | 2.2 -  O sistema impede a criação e exibe uma mensagem: “Já existe uma escala para este setor e período.” |  

## Protótipo


> Obs. as seções a seguir apenas serão utilizadas na segunda unidade do PDSWeb (segundo orientações do gerente do projeto).

## Diagrama de Interação (Sequência ou Comunicação)

### Sequência - Etapa 1



### Sequência - Etapa 2



## Diagrama de Classes de Projeto

