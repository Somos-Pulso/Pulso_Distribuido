# CDU06. Gerenciar Vínculos

- **Ator principal**: RH da Instituição  
- **Atores secundários**: Médico, Sistema  
- **Resumo**: Permite que o RH gerencie os vínculos dos médicos com a instituição. Existem dois tipos de instituições:  
  1. **Com vínculo obrigatório**: o médico só pode visualizar e concorrer a plantões após o vínculo ser aprovado pelo RH.  
  2. **Sem vínculo obrigatório**: qualquer médico pode visualizar e se candidatar a plantões sem necessidade de vínculo prévio.  

O RH é responsável por **aprovar, reprovar, atualizar e encerrar vínculos**, controlando quais médicos podem atuar em cada instituição.  
- **Pré-condição**: O RH está autenticado no sistema e acessa a área de gerenciamento de vínculos.  
- **Pós-condição**: O vínculo de médicos com a instituição é atualizado conforme aprovação, reprovação ou alteração feita pelo RH.

## Fluxo Principal

| Ações do Ator | Ações do Sistema |
|---------------------|------------------|
| 1. O RH acessa a área "Gerenciar Vínculos". | |
|| 2. O sistema exibe a lista de médicos vinculados e solicitações pendentes. |
| 3. O RH seleciona uma solicitação de vínculo ou um médico existente. ||
|| 4. O sistema exibe os detalhes da solicitação ou do vínculo ativo. |
| 5. O RH escolhe aprovar, reprovar ou editar informações do vínculo. ||
|| 6. O sistema atualiza o status do vínculo no cadastro do médico. |
|  7. O sistema envia notificação ao médico com a decisão do RH. |

---

## Fluxos Alternativos

### Fluxo Alternativo I – [Aprovação de Solicitação de Vínculo]
| Ações do Ator | Ações do Sistema |
|---------------|------------------|
| 1. O RH aprova a solicitação. | |
||2. O sistema muda o status para "Ativo" e concede acesso do médico aos plantões da instituição. |

### Fluxo Alternativo II – [Reprovação de Solicitação de Vínculo]
| Ações do Ator | Ações do Sistema |
|---------------|------------------|
| 1. O RH reprova a solicitação. ||
|| 2. O sistema muda o status para "Reprovado" e notifica o médico. |

### Fluxo Alternativo III – [Encerramento de Vínculo Ativo]
| Ações do Ator | Ações do Sistema |
|---------------|------------------|
| 1. O RH encerra o vínculo de um médico já ativo. ||
|| 2. O sistema muda o status para "Inativo" e bloqueia o acesso do médico a novos plantões na instituição. |

### Fluxo Alternativo IV – [Instituição sem vínculo obrigatório]
| Ações do Ator | Ações do Sistema |
|---------------|------------------|
| - | 1. O sistema permite que médicos visualizem e se candidatem a plantões sem necessidade de vínculo prévio. |

---

## Fluxos Exceção

### Fluxo Exceção I – [Solicitação duplicada]
| Ações do Ator | Ações do Sistema |
|---------------|------------------|
| 1. O médico envia nova solicitação de vínculo já existente. ||
|| 2. O sistema bloqueia a duplicidade e exibe mensagem: *"Você já possui uma solicitação em andamento ou vínculo ativo com esta instituição."* |

### Fluxo Exceção II – [Erro no processamento]
| Ações do Ator | Ações do Sistema |
|---------------|------------------|
| 1. O RH tenta salvar alteração no vínculo. ||
|| 2. O sistema não consegue salvar e exibe mensagem: *"Ocorreu um erro ao atualizar o vínculo. Tente novamente."* |

---

## Protótipo

## Diagrama de Interação (Sequência ou Comunicação)

## Diagrama de Classes de Projeto
