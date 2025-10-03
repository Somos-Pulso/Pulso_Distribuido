# CDU003. Publicar Escala

* **Ator principal**: Líder de escala
* **Atores secundários**: Sistema e Médicos
* **Resumo**: Permite ao líder de escala publicar uma escala finalizada. O sistema altera o status da escala de "rascunho" para "publicada" e notifica os médicos alocados, permitindo que visualizem seus plantões.
* **Pré-condição**: O líder de escala está autenticado e acessou a tela de detalhamento de uma escala ainda em rascunho.
* **Pós-condição**: A escala passa a estar publicada e visível para os médicos nos seus respectivos plantões.

## Fluxo Principal

|                Ações do Ator                 |                                  Ações do Sistema                                                                  |
| :------------------------------------------: | :----------------------------------------------------------------------------------------------------------------: |
| 0 - Acessa a tela de detalhamento da escala. |                                                                                                                    |
|        1 - Clica no botão "Publicar".        |                                                                                                                    |
|                                              |           2 - Busca escala selecionada, confere dados e atualiza o status de "rascunho" para "publicada".          |
|                                              |          3 - Notifica todos os médicos alocados sobre seus novos plantões.                                         |
| 4 - Visualiza escala agora publicada.        |                                                                                                                    |

## Fluxo Exceção I - [Publicar escala já publicada]

| Ações do Ator | Ações do Sistema                                                                             |
| :-----------: | :------------------------------------------------------------------------------------------: |
|               | 2.1 - Busca escala selecionada e confere dados.                                              |
|               | 2.2 - Exibe mensagem de erro informando que não é possível públicar uma escala já publicada. |

## Fluxo Exceção II - [Publicar escala inexistente]

| Ações do Ator | Ações do Sistema                                                                             |
| :-----------: | :------------------------------------------------------------------------------------------: |
|               | 2.a - Busca escala selecionada e confere dados.                                              |
|               | 2.b - Exibe mensagem de erro informando que não foi possível encontrar a escala selecionada. |

## Protótipo

## Diagrama de Interação (Sequência ou Comunicação)

## Diagrama de Classes de Projeto