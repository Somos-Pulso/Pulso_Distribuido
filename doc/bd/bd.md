# Modelo de Dados

## Diagrama ER
<img width="2001" height="1061" alt="pulsodistribuido drawio" src="https://github.com/user-attachments/assets/c01deec7-ae9e-4a55-8cf1-355f4fe6b216" />

## Modelo Relacional
<img width="6276" height="2892" alt="erdplus (1)" src="https://github.com/user-attachments/assets/973b8109-799a-4303-896f-ed00b721d468" />

## Dicionário de Dados

---

### Tabela : Usuário

**Descrição** : Representa contas de acesso ao sistema, usadas tanto por pessoas quanto por instituições. Contém dados de autenticação e permissões.

| Colunas       | Descrição                                                  | Tipo de Dado | Tamanho | Null | PK | FK | Unique | Identity | Default | Check    |
| ------------- | ---------------------------------------------------------- | ------------ | ------- | ---- | -- | -- | ------ | -------- | ------- | -------- |
| id_usuario    | Identificador único do usuário                             | \[int]       |         | ☐    | ☑  | ☐  | ☐      | ☑        |         | Not null |
| nome          | Nome do usuário                                            | \[varchar]   | 100     | ☐    | ☐  | ☐  | ☐      | ☐        |         | Not null |
| matricula     | Matrícula específica para realização do login do usuário   | \[char]      | 14      | ☐    | ☐  | ☐  | ☑      | ☐        |         | Not null |
| email         | E-mail para contato com o usuário                          | \[varchar]   | 100     | ☐    | ☐  | ☐  | ☐      | ☐        |         | Not null |
| telefone      | Telefone para contato com o usuário                        | \[varchar]   | 14      | ☐    | ☐  | ☐  | ☐      | ☐        |         | Not null |
| foto_perfil   | Foto de perfil do usuário                                  | \[varchar]   | 255     | ☐    | ☐  | ☐  | ☐      | ☐        |         | Not null |
| senha         | Senha para realização do login do usuário                  | \[varchar]   | 255     | ☐    | ☐  | ☐  | ☐      | ☐        |         | Not null |
| ativo         | Confirmador se é um usuário ativo no sistema               | \[boolean]   |         | ☐    | ☐  | ☐  | ☐      | ☐        | True    | Not null |
| ultimo_login  | Data guardando o ultimo login do usuário                   | \[timestamp] |         | ☐    | ☐  | ☐  | ☐      | ☐        | today   | Not null |
| criado_em     | Data guardando quando a conta de usuário foi criada        | \[timestanp] |         | ☐    | ☐  | ☐  | ☐      | ☐        | today   | Not null |
| atualizado_em | Data guardando o último registro de atualização do usuário | \[timestamp] |         | ☐    | ☐  | ☐  | ☐      | ☐        | today   | Not null |

---

### Tabela: Líder de Escala

**Descrição** : Representa o profissional responsável pela criação e gestão de escalas em uma instituição.

| Colunas            | Descrição                                    | Tipo de Dado | Tamanho | Null | PK | FK | Unique | Identity | Default | Check    |
| ------------------ | -------------------------------------------- | ------------ | ------- | ---- | -- | -- | ------ | -------- | ------- | -------- |
| id_lider_escala    | Identificador único do lider de escala       | \[int]       |         | ☐    | ☑  | ☐  | ☐      | ☑        |         | Not null |
| id_usuario         | Chave ligando lider de escala ao seu usuário | \[int]       |         | ☐    | ☐  | ☑  | ☐      | ☐        |         | Not null |
| id_vinculo         | Chave ligando líder de escala ao seu vínculo | \[int]       |         | ☐    | ☐  | ☑  | ☐      | ☐        |         | Not null |

---

### Tabela: Profissional

**Descrição** : Representa indivíduos que atuam como profissionais de saúde cadastrados no sistema, podendo assumir vínculos em diferentes instituições.

| Colunas            | Descrição                                           | Tipo de Dado | Tamanho | Null | PK | FK | Unique | Identity | Default | Check    |
| ------------------ | --------------------------------------------------- | ------------ | ------- | ---- | -- | -- | ------ | -------- | ------- | -------- |
| id_profissional    | Identificador único do profissional                 | \[int]       |         | ☐    | ☑  | ☐  | ☐      | ☑        |         | Not null |
| ano_formacao       | Data guardando o ano de formação do profissional    | \[timestamp] |         | ☐    | ☐  | ☐  | ☐      | ☐        |         | Not null |
| pix                | Pix do profissional para pagamentos                 | \[varchar]   | 50      | ☑    | ☐  | ☐  | ☐      | ☐        |         |          |
| tipo_pix           | Qual o tipo do pix do profissional                  | \[TipoPix]   |         | ☑    | ☐  | ☐  | ☐      | ☐        |         |          |
| crm                | CRM do profissional                                 | \[varchar]   | 8       | ☐    | ☐  | ☐  | ☐      | ☐        |         | Not null |
| data_nasc          | Data guardando a data de nascimento do profissional | \[timestamp] |         | ☐    | ☐  | ☐  | ☐      | ☐        |         | Not null |
| id_usuario         | Chave ligando profissional ao seu usuário           | \[int]       |         | ☐    | ☐  | ☑  | ☐      | ☐        |         | Not null |

---

### Tabela: Instituição

**Descrição** : Representa organizações de saúde, como hospitais, clínicas ou cooperativas, que oferecem especialidades, setores e escalas de plantões.

| Colunas            | Descrição                                                  | Tipo de Dado | Tamanho | Null | PK | FK | Unique | Identity | Default | Check    |
| ------------------ | ---------------------------------------------------------- | ------------ | ------- | ---- | -- | -- | ------ | -------- | ------- | -------- |
| id_instituição     | Identificador único da instituição                         | \[int]       |         | ☐    | ☑  | ☐  | ☐      | ☑        |         | Not null |
| endereco           | Endereco atual da instituição                              | \[varchar]   | 255     | ☐    | ☐  | ☐  | ☑      | ☐        |         | Not null |
| cnpj               | CNPJ da instituição                                        | \[varchar]   | 14      | ☐    | ☐  | ☐  | ☑      | ☐        |         | Not null |
| exige_vinculo      | Confirmador se é exigido vínculo para atuar na instituição | \[boolean]   |         | ☐    | ☐  | ☐  | ☐      | ☐        | False   | Not null |
| id_usuario         | Chave ligando instituição ao seu usuário                   | \[varchar]   | 8       | ☐    | ☐  | ☑  | ☐      | ☐        |         | Not null |

---

### Tabela: Especialidade

**Descrição** : Representa áreas de atuação médica, podendo estar ligadas a profissionais e a instituições.

| Colunas            | Descrição                            | Tipo de Dado | Tamanho | Null | PK | FK | Unique | Identity | Default | Check    |
| ------------------ | ------------------------------------ | ------------ | ------- | ---- | -- | -- | ------ | -------- | ------- | -------- |
| id_especialidade   | Identificador único da especialidade | \[int]       |         | ☐    | ☑  | ☐  | ☐      | ☑        |         | Not null |
| nome               | Nome específico da especialidade     | \[varchar]   | 100     | ☐    | ☐  | ☐  | ☑      | ☐        |         | Not null |

---

### Tabela: Setor

**Descrição** : Representa divisões internas de uma instituição dentro de uma especialidade, utilizadas para organização de escalas e plantões.

| Colunas            | Descrição                               | Tipo de Dado | Tamanho | Null | PK | FK | Unique | Identity | Default | Check    |
| ------------------ | --------------------------------------- | ------------ | ------- | ---- | -- | -- | ------ | -------- | ------- | -------- |
| id_setor           | Identificador único do setor            | \[int]       |         | ☐    | ☑  | ☐  | ☐      | ☑        |         | Not null |
| nome               | Nome do setor em questão                | \[varchar]   | 100     | ☐    | ☐  | ☐  | ☐      | ☐        |         | Not null |
| id_instituicao     | Chave ligando setor a sua instituição   | \[int]       |         | ☐    | ☐  | ☑  | ☐      | ☐        |         | Not null |
| id_especialidade   | Chave ligando setor a sua especialidade | \[int]       |         | ☐    | ☐  | ☑  | ☐      | ☐        |         | Not null |

---

### Tabela: Líder_Especialidade

**Descrição** : Representa a ligação entre um líder de escala e sua especialidade.

| Colunas                | Descrição                                  | Tipo de Dado | Tamanho | Null | PK | FK | Unique | Identity | Default | Check    |
| ---------------------- | ------------------------------------------ | ------------ | ------- | ---- | -- | -- | ------ | -------- | ------- | -------- |
| id_lider_especialidade | Identificador único do lider_especialidade | \[int]       |         | ☐    | ☑  | ☐  | ☐      | ☑        |         | Not null |
| id_lider_escala        | Chave ligando ao lider de escala           | \[int]       |         | ☐    | ☐  | ☑  | ☑      | ☐        |         | Not null |
| id_especialidade       | Chave ligando a especialidade              | \[int]       |         | ☐    | ☐  | ☑  | ☑      | ☐        |         | Not null |

---

### Tabela: Prof_Especialidade

**Descrição** : Representa a ligação entre um profissional e a sua especialidade.

| Colunas                | Descrição                                 | Tipo de Dado | Tamanho | Null | PK | FK | Unique | Identity | Default | Check    |
| ---------------------- | ----------------------------------------- | ------------ | ------- | ---- | -- | -- | ------ | -------- | ------- | -------- |
| id_prof_especialidade  | Identificador único do prof_especialidade | \[int]       |         | ☐    | ☑  | ☐  | ☐      | ☑        |         | Not null |
| id_profissional        | Chave ligando ao profissional             | \[int]       |         | ☐    | ☐  | ☑  | ☐      | ☐        |         | Not null |
| id_especialidade       | Chave ligando a especialidade             | \[int]       |         | ☐    | ☐  | ☑  | ☐      | ☐        |         | Not null |

---

### Tabela: Vínculo

**Descrição** : Representa a relação entre um profissional e uma instituição, permitindo que o profissional atue nos plantões daquela instituição.

| Colunas         | Descrição                                          | Tipo de Dado   | Tamanho | Null | PK | FK | Unique | Identity | Default | Check    |
| --------------- | -------------------------------------------------- | -------------- | ------- | ---- | -- | -- | ------ | -------- | ------- | -------- |
| id_vinculo      | Identificador único do vinculo                     | \[int]         |         | ☐    | ☑  | ☐  | ☐      | ☑        |         | Not null |
| tipo_vinculo    | Qual o tipo de vínculo que está sendo estabelecido | \[TipoVinculo] |         | ☐    | ☐  | ☐  | ☐      | ☐        |         | Not null |
| id_instituicao  | Chave ligando vinculo a instituição                | \[int]         |         | ☐    | ☐  | ☑  | ☐      | ☐        |         | Not null |
| id_profissional | Chave ligando vinculo ao profissional              | \[int]         |         | ☐    | ☐  | ☑  | ☐      | ☐        |         | Not null |

---

### Tabela: Escala

**Descrição** : Representa um conjunto organizado de plantões dentro de um período específico, associado a um setor e gerido por um líder de escala.

| Colunas         | Descrição                                                 | Tipo de Dado    | Tamanho | Null | PK | FK | Unique | Identity | Default | Check    |
| --------------- | --------------------------------------------------------- | --------------- | ------- | ---- | -- | -- | ------ | -------- | ------- | -------- |
| id_escala       | Identificador único da escala                             | \[int]          |         | ☐    | ☑  | ☐  | ☐      | ☑        |         | Not null |
| nome            | Nome da escala                                            | \[varchar]      | 150     | ☐    | ☐  | ☐  | ☐      | ☐        |         | Not null |
| mes_referencia  | Mês ao qual a escala de refere                            | \[timestamp]    |         | ☐    | ☐  | ☐  | ☐      | ☐        | today   | Not null |
| status          | Status atual da escala                                    | \[StatusEscala] |         | ☐    | ☐  | ☐  | ☐      | ☐        |         | Not null |
| data_criacao    | Data guardando o registro de criação da escala            | \[timestamp]    |         | ☐    | ☐  | ☐  | ☐      | ☐        | today   | Not null |
| data_aualizacao | Data guardando o registro de última atualização da escala | \[timestamp]    |         | ☐    | ☐  | ☐  | ☐      | ☐        | today   | Not null |
| id_lider_escala | Chave ligando a escala ao lider de escala que a montou    | \[int]          |         | ☐    | ☐  | ☑  | ☐      | ☐        |         | Not null |
| id_setor        | Chave ligando a escala ao seu setor                       | \[int]          |         | ☐    | ☐  | ☑  | ☐      | ☐        |         | Not null |

---

### Tabela: Plantão

**Descrição** : Representa um turno de atendimento médico com data e duração definidas, pertencente a uma escala e associado a um ou mais profissionais.

| Colunas              | Descrição                                                        | Tipo de Dado      | Tamanho | Null | PK | FK | Unique | Identity | Default | Check    |
| -------------------- | ---------------------------------------------------------------- | ----------------- | ------- | ---- | -- | -- | ------ | -------- | ------- | -------- |
| id_plantao           | Identificador único do plantao                                   | \[int]            |         | ☐    | ☑  | ☐  | ☐      | ☑        |         | Not null |
| hora_entrada         | Hora de entrada do profissional no plantão                       | \[timestamp]      |         | ☐    | ☐  | ☐  | ☐      | ☐        |         | Not null |
| hora_saida           | Hora de saída do profissional do plantão                         | \[timestamp]      |         | ☐    | ☐  | ☐  | ☐      | ☐        |         | Not null |
| estimativa_valor     | Estimativa do valor a ser pago pelo plantão                      | \[numeric]        |         | ☐    | ☐  | ☐  | ☐      | ☐        |         | Not null |
| forma_pagamento      | Qual seria a forma de pagamento pelo plantão                     | \[FormaPagamento] |         | ☑    | ☐  | ☐  | ☐      | ☐        |         |          |
| estimativa_pagamento | Data guardando a estimativa de ate quando o plantão vai ser pago | \[timestamp]      |         | ☑    | ☐  | ☐  | ☐      | ☐        |         |          |
| comentario           | Comentários extras com mais informações sobre o plantão          | \[text]           |         | ☑    | ☐  | ☐  | ☐      | ☐        |         |          |
| qtd_profissionais    | Quantidade de profissionais que podem pegar o plantão            | \[int]            |         | ☐    | ☐  | ☐  | ☐      | ☐        | 1       | Not null |
| data_criacao         | Data guardando o registro de criação do plantão                  | \[timestamp]      |         | ☐    | ☐  | ☐  | ☐      | ☐        | today   | Not null |
| data_atualizacao     | Data guardando o últmo registro de atualização do plantão        | \[timestamp]      |         | ☐    | ☐  | ☐  | ☐      | ☐        | today   | Not null |
| id_escala            | Chave ligando o plantão a sua escala                             | \[int]            |         | ☐    | ☐  | ☑  | ☐      | ☐        |         | Not null |

---

### Tabela: Profissional_Plantão

**Descrição** : Representa a ligação entre o plantão e o profissional que pegou ele.

| Colunas         | Descrição                                   | Tipo de Dado | Tamanho | Null | PK | FK | Unique | Identity | Default | Check    |
| --------------- | ------------------------------------------- | ------------ | ------- | ---- | -- | -- | ------ | -------- | ------- | -------- |
| id_prof_plantao | Identificador único do profissional_plantao | \[int]       |         | ☐    | ☑  | ☐  | ☐      | ☑        |         | Not null |
| id_plantao      | Chave ligando ao plantao                    | \[int]       |         | ☐    | ☐  | ☑  | ☑      | ☐        |         | Not null |
| id_profissional | Chave ligando ao profissional               | \[int]       |         | ☐    | ☐  | ☑  | ☑      | ☐        |         | Not null |

---

### Tabela: Troca

**Descrição** : Representa operações de repasse ou troca de plantões entre profissionais, podendo envolver um ou mais plantões e participantes.

| Colunas         | Descrição                                          | Tipo de Dado   | Tamanho | Null | PK | FK | Unique | Identity | Default | Check    |
| --------------- | -------------------------------------------------- | -------------- | ------- | ---- | -- | -- | ------ | -------- | ------- | -------- |
| id_troca        | Identificador único da troca                       | \[int]         |         | ☐    | ☑  | ☐  | ☐      | ☑        |         | Not null |
| comentario      | Comentário do motivo da troca                      | \[text]        |         | ☐    | ☐  | ☐  | ☐      | ☐        |         | Not null |
| tipo            | Qual o tipo da troca                               | \[TipoTroca]   |         | ☐    | ☐  | ☐  | ☐      | ☐        |         | Not null |
| status          | Qual o status da troca                             | \[StatusTroca] |         | ☐    | ☐  | ☐  | ☐      | ☐        |         | Not null |
| id_plantao      | Chave ligando a troca ao plantão disponível        | \[int]         |         | ☐    | ☐  | ☑  | ☐      | ☐        |         | Not null |
| id_profissional | Chave ligando ao profissional que fez a requisição | \[int]         |         | ☐    | ☐  | ☑  | ☐      | ☐        |         | Not null |

---

### Tabela: Notificação

**Descrição** : Representa mensagens enviadas a usuários do sistema, como alertas de escala, confirmações de plantões ou avisos de troca.

| Colunas         | Descrição                                       | Tipo de Dado         | Tamanho | Null | PK | FK | Unique | Identity | Default | Check    |
| --------------- | ----------------------------------------------- | -------------------- | ------- | ---- | -- | -- | ------ | -------- | ------- | -------- |
| id_notificacao  | Identificador único da notificação              | \[int]               |         | ☐    | ☑  | ☐  | ☐      | ☑        |         | Not null |
| id_remetente    | Itentificador de quem enviou a notificação      | \[int]               |         | ☑    | ☐  | ☐  | ☐      | ☐        |         |          |
| id_destinatario | Identificador de quem vai receber a notificação | \[imt]               |         | ☐    | ☐  | ☐  | ☐      | ☐        |         | Not null |
| mensagem        | Mensaegm do que se trata a notificação          | \[text]              |         | ☑    | ☐  | ☐  | ☐      | ☐        |         |          |
| tipo            | Tipo da notificação                             | \[TipoNotificacao]   |         | ☐    | ☐  | ☐  | ☐      | ☐        |         | Not null |
| titulo          | Título visível da notificação                   | \[varchar]           | 100     | ☐    | ☐  | ☐  | ☐      | ☐        |         | Not null |
| conteudo        | Conteúdo da notificação                         | \[json]              |         | ☑    | ☐  | ☐  | ☐      | ☐        |         |          |
| status          | Stauts da notificação                           | \[StatusNotificacao] |         | ☐    | ☐  | ☐  | ☐      | ☐        |         | Not null |

---
