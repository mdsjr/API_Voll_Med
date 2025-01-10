# API Voll.med

## Descrição

API REST desenvolvida para a aplicação **Voll.med**, destinada à gestão de dados médicos. O projeto foi implementado utilizando o framework Spring Boot, com suporte a JPA para persistência de dados, validação, migrações de banco de dados com Flyway, e conectividade com MySQL.

---

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.4.1**
  - Spring Boot Starter Web
  - Spring Boot Starter Data JPA
  - Spring Boot Starter Validation
  - Spring Boot DevTools
- **Lombok**
- **Flyway**
- **MySQL**

---

## Configuração do Ambiente

### Pré-requisitos

- **Java 17+**
- **Maven**
- **MySQL**

### Configuração do Banco de Dados

Certifique-se de que o MySQL está rodando localmente e crie um banco de dados chamado `vollmed_api`:

```sql
CREATE DATABASE vollmed_api;

````

Atualize as credenciais de acesso ao banco de dados no arquivo application.properties:
````
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/vollmed_api
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA

`````

### Migrações de Banco de Dados

O Flyway será executado automaticamente ao iniciar a aplicação, garantindo que as tabelas necessárias sejam criadas no banco de dados.

----

### Entidades

Medico: Representa os médicos cadastrados na aplicação.
Campos:
id (Long): Identificador único.
nome (String): Nome do médico.
email (String): E-mail do médico.
crm (String): Registro no Conselho Regional de Medicina.
especialidade (Enum): Especialidade médica.
endereco (Embedded): Dados do endereço do médico.

### Configuração do Lombok
Para utilizar o Lombok, certifique-se de que seu IDE está configurado para reconhecer as anotações do Lombok. Para isso, instale o plugin do Lombok e habilite a configuração de annotation processing.

### Como Executar

1. Clone o repositório:
````
git clone https://github.com/SEU_USUARIO/vollmed-api.git
cd vollmed-api
````
2. Compile e execute a aplicação:
````
mvn spring-boot:run
````
3. Acesse a aplicação no endereço: http://localhost:8080

-----
### Licença
Este projeto está licenciado sob os termos da licença MIT.




