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

### Tabela: Vínculo

**Descrição** : Representa a relação entre um profissional e uma instituição, permitindo que o profissional atue nos plantões daquela instituição.

---

### Tabela: Escala

**Descrição** : Representa um conjunto organizado de plantões dentro de um período específico, associado a um setor e gerido por um líder de escala.

---

### Tabela: Plantão

**Descrição** : Representa um turno de atendimento médico com data e duração definidas, pertencente a uma escala e associado a um ou mais profissionais.

---

### Tabela: Troca

**Descrição** : Representa operações de repasse ou troca de plantões entre profissionais, podendo envolver um ou mais plantões e participantes.

---

### Tabela: Notificação

**Descrição** : Representa mensagens enviadas a usuários do sistema, como alertas de escala, confirmações de plantões ou avisos de troca.

---
