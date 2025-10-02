# CDU007. Publicar Escala

* **Ator principal**: Líder de escala
* **Atores secundários**: Sistema, Médicos
* **Resumo**: Permite ao líder de escala publicar uma escala finalizada. O sistema altera o status da escala de "rascunho" para "publicada" e notifica os médicos alocados, permitindo que visualizem seus plantões.
* **Pré-condição**: O líder de escala está autenticado e acessou a tela de detalhamento de uma escala ainda em rascunho.
* **Pós-condição**: A escala passa a estar publicada e visível para os médicos nos seus respectivos plantões.


## Fluxo Principal

|                Ações do ator                |                                  Ações do sistema                                 |
| :-----------------------------------------: | :-------------------------------------------------------------------------------: |
| 0 - Acessa a tela de detalhamento da escala |                                                                                   |
|        1 - Clica no botão "Publicar"        |                                                                                   |
|                                             |           2 - Atualiza o status da escala de "rascunho" para "publicada"          |
|                                             |          3 - Notifica todos os médicos alocados sobre seus novos plantões         |
|                                             | 4 - Disponibiliza os plantões da escala publicada para visualização pelos médicos |



## Protótipo



## Diagrama de Interação (Sequência ou Comunicação)



## Diagrama de Classes de Projeto
