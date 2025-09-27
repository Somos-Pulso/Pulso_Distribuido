# Modelo de Dados

## Diagrama ER
<img width="2001" height="1061" alt="pulsodistribuido drawio" src="https://github.com/user-attachments/assets/c01deec7-ae9e-4a55-8cf1-355f4fe6b216" />

## Modelo Relacional
<img width="6276" height="2892" alt="erdplus (1)" src="https://github.com/user-attachments/assets/973b8109-799a-4303-896f-ed00b721d468" />

## Dicionário de Dados

---

### Tabela : Usuário

**Descrição** : Representa contas de acesso ao sistema, usadas tanto por pessoas quanto por instituições. Contém dados de autenticação e permissões.

| Colunas      | Descrição                                  | Tipo de Dado | Tamanho | Null | PK | FK | Unique | Identity | Default | Check    |
| ------------ | ------------------------------------------ | ------------ | ------- | ---- | -- | -- | ------ | -------- | ------- | -------- |
| id_usuario   | Identificador único do usuário             | \[int]       |         | ☐    | ☑  | ☐  | ☐      | ☑        |         | Not null |
| cpf          | Cadastro de pessoa física                  | \[char]      | 11      | ☐    | ☐  | ☐  | ☑      | ☐        |         | Not null |
| telefone     | Número do telefone principal               | \[varchar]   | 11      | ☐    | ☐  | ☐  | ☐      | ☐        |         | Not null |
| descrição    | Informação adicional sobre o profissional  | \[text]      |         | ☑    | ☐  | ☐  | ☐      | ☐        |         |          |
| foto\_perfil | URL da Foto de apresentação do profissional| \[varchar]   | 255     | ☑    | ☐  | ☐  | ☐      | ☐        |         |          |

---

### Tabela: Líder de Escala

**Descrição** : Representa o profissional responsável pela criação e gestão de escalas em uma instituição.

---

### Tabela: Profissional

**Descrição** : Representa indivíduos que atuam como profissionais de saúde cadastrados no sistema, podendo assumir vínculos em diferentes instituições.

---

### Tabela: Instituição

**Descrição** : Representa organizações de saúde, como hospitais, clínicas ou cooperativas, que oferecem especialidades, setores e escalas de plantões.

---

### Tabela: Especialidade

**Descrição** : Representa áreas de atuação médica, podendo estar ligadas a profissionais e a instituições.

---

### Tabela: Setor

**Descrição** : Representa divisões internas de uma instituição dentro de uma especialidade, utilizadas para organização de escalas e plantões.

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
