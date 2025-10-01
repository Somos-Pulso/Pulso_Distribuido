# CDU011. Trocar Plantão CLT

- **Ator principal**: Médico CLT  
- **Atores secundários**: Líder de Escala, Médico CLT  
- **Resumo**: Permite que médicos CLT solicitem a troca de um plantão em que já estão alocados. A solicitação deve conter obrigatoriamente uma **justificativa (ex.: atestado médico, motivo pessoal, documento comprobatório)** e é enviada ao Líder de Escala, que pode aprovar ou reprovar. Caso aprovada, o plantão fica disponível para que outro médico o assuma.  
- **Pré-condição**: O médico CLT está autenticado no sistema, acessou "Meus plantões", clicou em "Detalhar plantão" e selecionou a opção "Solicitar troca".  
- **Pós-condição**: O plantão pode ser transferido para outro médico, ou a solicitação é encerrada sem troca (em caso de reprovação).  

---

## 📌 Fluxo Principal

| Ações do Ator (Médico) | Ações do Sistema |
|-------------------------|------------------|
| 1. O médico acessa "Meus plantões". | |
| | 2. O sistema exibe a lista de plantões alocados. |
| 3. O médico seleciona um plantão e clica em "Detalhar plantão". | |
| | 4. O sistema exibe as informações do plantão (data, horário, local, status). |
| 5. O médico clica em "Solicitar troca". | |
| | 6. O sistema abre o formulário de solicitação de troca. |
| 7. O médico insere uma justificativa obrigatória (texto e/ou anexo). | |
| 8. O médico confirma o envio da solicitação. | |
| | 9. O sistema valida a justificativa, registra a solicitação e envia notificação ao Líder de Escala. |
| | 10. O sistema atualiza o status do plantão para "Troca pendente de aprovação". |

---

## 🔄 Fluxos Alternativos

### FA01 – Solicitação cancelada antes do envio
| Ações do Ator | Ações do Sistema |
|---------------|------------------|
| 8a. O médico desiste da troca e cancela o envio. | |
| | 9a. O sistema retorna à tela de detalhes do plantão sem registrar solicitação. |

### FA02 – Aprovação pelo Líder de Escala
| Ações do Ator (Líder de Escala) | Ações do Sistema |
|--------------------------------|------------------|
| 1. O Líder de Escala recebe a solicitação. | |
| | 2. O sistema exibe os detalhes da troca, incluindo justificativa do médico. |
| 3. O Líder aprova a solicitação. | |
| | 4. O sistema muda o status do plantão para "Disponível para troca" e envia notificação aos médicos. |

### FA03 – Reprovação pelo Líder de Escala
| Ações do Ator (Líder de Escala) | Ações do Sistema |
|--------------------------------|------------------|
| 1. O Líder de Escala recebe a solicitação. | |
| | 2. O sistema exibe os detalhes da troca, incluindo justificativa do médico. |
| 3. O Líder reprova a solicitação. | |
| | 4. O sistema muda o status do plantão de volta para "Confirmado" e envia notificação ao médico solicitante. |

---

## ⚠️ Fluxos de Exceção

### Exceção E01 – Justificativa não informada
| Ações do Ator | Ações do Sistema |
|---------------|------------------|
| 1. O médico tenta enviar a solicitação sem justificativa. | |
| | 2. O sistema bloqueia o envio e exibe a mensagem: *"É obrigatório informar uma justificativa para solicitar a troca."* |

### Exceção E02 – Plantão já iniciado
| Ações do Ator | Ações do Sistema |
|---------------|------------------|
| 1. O médico tenta solicitar troca para um plantão que já começou. | |
| | 2. O sistema bloqueia a solicitação e exibe a mensagem: *"Não é possível solicitar troca de plantões já iniciados."* |

### Exceção E03 – Médico indisponível
| Ações do Ator | Ações do Sistema |
|---------------|------------------|
| 1. Um médico tenta assumir o plantão liberado. | |
| | 2. O sistema detecta conflito de horários e exibe a mensagem: *"Você já possui um plantão nesse horário."* |

---

## Protótipo

> Obs. as seções a seguir apenas serão utilizadas na segunda unidade do PDSWeb (segundo orientações do gerente do projeto).

## Diagrama de Interação (Sequência ou Comunicação)

## Diagrama de Classes de Projeto
