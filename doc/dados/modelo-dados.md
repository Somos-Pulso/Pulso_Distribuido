# 📌 Documentação do Modelo de Dados — Sistema Pulso

## 🎯 Objetivo
Descrever as tabelas do banco de dados, seus atributos e relacionamentos conforme o diagrama ER.

---

## 🧑 Usuário

### Tabela: `usuario`
| Campo       | Tipo       | Chave | Descrição                        |
|-------------|-----------|-------|----------------------------------|
| id_usuario  | INT (PK)  | PK    | Identificador único do usuário    |
| nome        | VARCHAR   |       | Nome completo do usuário          |
| email       | VARCHAR   | U     | Email único                      |
| telefone    | VARCHAR   | O     | Telefone (opcional)               |
| senha       | VARCHAR   |       | Senha de acesso                   |
| foto_perfil | VARCHAR   | O     | Caminho/URL da foto (opcional)    |
| data_nasc   | DATE      | O     | Data de nascimento (opcional)     |

**Relacionamentos**
- (1:N) → `instituicao`
- (1:N) → `profissional`
- (1:N) → `lider_de_escala`

---

## 🏥 Instituição

### Tabela: `instituicao`
| Campo        | Tipo       | Chave | Descrição                           |
|--------------|-----------|-------|-------------------------------------|
| id_instituicao | INT (PK) | PK    | Identificador único da instituição  |
| cnpj         | VARCHAR   | U     | CNPJ único                          |
| endereco     | VARCHAR   |       | Endereço físico                     |
| url_maps     | VARCHAR   |       | Link para localização no Maps        |
| id_usuario   | INT (FK)  | FK    | Responsável cadastrado (usuário)     |

**Relacionamentos**
- (1:N) → `setor`
- (1:N) → `vinculo`
- (1:N) → `lider_de_escala`

---

## 🏢 Setor

### Tabela: `setor`
| Campo        | Tipo       | Chave | Descrição                          |
|--------------|-----------|-------|------------------------------------|
| id_setor     | INT (PK)  | PK    | Identificador único do setor        |
| nome         | VARCHAR   |       | Nome do setor                       |
| id_instituicao | INT (FK) | FK   | Instituição a que o setor pertence |

**Relacionamentos**
- (1:N) → `escala`
- (N:M) → `lider_de_escala` (via `lider_de_escala_setor`)

---

## 📅 Escala

### Tabela: `escala`
| Campo            | Tipo       | Chave | Descrição                              |
|------------------|-----------|-------|----------------------------------------|
| id_escala        | INT (PK)  | PK    | Identificador único da escala           |
| nome             | VARCHAR   |       | Nome da escala                          |
| data_inicio      | DATE      |       | Data de início                          |
| data_fim         | DATE      |       | Data de fim                             |
| status           | VARCHAR   |       | Status (ativa, encerrada, etc.)         |
| id_setor         | INT (FK)  | FK    | Setor vinculado                         |
| data_criacao     | TIMESTAMP |       | Quando foi criada                       |
| data_atualizacao | TIMESTAMP |       | Última modificação                      |

**Relacionamentos**
- (N:1) → `setor`

---

## 🕒 Plantão

### Tabela: `plantao`
| Campo        | Tipo       | Chave | Descrição                        |
|--------------|-----------|-------|----------------------------------|
| id_plantao   | INT (PK)  | PK    | Identificador único do plantão    |
| data         | DATE      |       | Data do plantão                   |
| hora_entrada | TIME      |       | Horário de entrada                 |
| hora_saida   | TIME      |       | Horário de saída                   |
| valor        | DECIMAL   |       | Valor do plantão                   |
| comentario   | TEXT      | O     | Comentário adicional (opcional)   |

---

## 👨‍⚕️ Profissional

### Tabela: `profissional`
| Campo         | Tipo       | Chave | Descrição                          |
|---------------|-----------|-------|------------------------------------|
| id_profissional | INT (PK) | PK    | Identificador único do profissional|
| pix           | VARCHAR   | O     | Chave PIX (opcional)                |
| registro      | VARCHAR   | U     | Registro profissional (ex: CRM)    |
| id_usuario    | INT (FK)  | FK    | Referência ao usuário               |
| id_formacao   | INT (FK)  | FK    | Formação acadêmica                  |

**Relacionamentos**
- (N:M) → `especialidade` (via `especialidade_profissional`)
- (1:N) → `vinculo`

---

## 🎓 Formação

### Tabela: `formacao`
| Campo        | Tipo       | Chave | Descrição                          |
|--------------|-----------|-------|------------------------------------|
| id_formacao  | INT (PK)  | PK    | Identificador único da formação     |
| nome         | VARCHAR   |       | Nome do curso/formação             |

**Relacionamentos**
- (1:N) → `profissional`

---

## 🏷 Especialidade

### Tabela: `especialidade`
| Campo           | Tipo       | Chave | Descrição                          |
|-----------------|-----------|-------|------------------------------------|
| id_especialidade| INT (PK)  | PK    | Identificador único da especialidade|
| nome            | VARCHAR   |       | Nome da especialidade               |

**Relacionamentos**
- (N:M) → `profissional` (via `especialidade_profissional`)

### Tabela: `especialidade_profissional`
| Campo                     | Tipo       | Chave | Descrição                          |
|---------------------------|-----------|-------|------------------------------------|
| id_especialidade_profissional | INT (PK) | PK | Identificador único                 |
| id_especialidade          | INT (FK)  | FK    | Especialidade vinculada             |
| id_profissional           | INT (FK)  | FK    | Profissional vinculado              |

---

## 🔗 Vínculo

### Tabela: `vinculo`
| Campo        | Tipo       | Chave | Descrição                            |
|--------------|-----------|-------|--------------------------------------|
| id_vinculo   | INT (PK)  | PK    | Identificador único do vínculo        |
| tipo_vinculo | VARCHAR   |       | Tipo de vínculo (CLT, PJ, etc.)       |
| data_inicio  | DATE      |       | Data de início                        |
| data_fim     | DATE      |       | Data de término (opcional)            |
| id_profissional | INT (FK) | FK   | Profissional vinculado                |
| id_instituicao | INT (FK) | FK   | Instituição vinculada                 |

---

## 👨‍💼 Líder de Escala

### Tabela: `lider_de_escala`
| Campo          | Tipo       | Chave | Descrição                          |
|----------------|-----------|-------|------------------------------------|
| id_lider_de_escala | INT (PK) | PK | Identificador único do líder        |
| id_usuario     | INT (FK)  | FK    | Usuário referente ao líder          |
| id_instituicao | INT (FK)  | FK    | Instituição vinculada               |

### Tabela: `lider_de_escala_setor`
| Campo              | Tipo       | Chave | Descrição                          |
|--------------------|-----------|-------|------------------------------------|
| id_lider_de_escala_setor | INT (PK) | PK | Identificador da relação            |
| id_setor           | INT (FK)  | FK    | Setor vinculado                     |
| id_lider_de_escala | INT (FK)  | FK    | Líder vinculado                     |

**Relacionamentos**
- (N:M) → `setor` ↔ `lider_de_escala`

---

# ✅ Conclusão
- O modelo cobre usuários, instituições, profissionais, especialidades, setores, escalas e plantões.  
- Para **auditoria**, é recomendável adicionar campos `data_criacao` e `data_atualizacao` em tabelas principais.  
- Se for necessário manter **histórico completo** (ex: em `escala`, `plantao`, `vinculo`), pode-se criar tabelas de histórico adicionais.
