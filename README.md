# DESAFIO-API-REST-camadas-CRUD-excecoes-validações

# Client CRUD API

Projeto desenvolvido para o desafio de CRUD de clientes, proposto no módulo de Backend da Formação Desenvolvedor Moderno da DevSuperior.

## Tecnologias usadas

- Java 17+
- Spring Boot
- Spring Data JPA
- Maven
- Banco de dados H2
- JPA Validation
- Postman (para testes)

## Funcionalidades

- **Busca paginada de clientes**  
  `GET /clients?page=0&size=6&sort=name`

- **Busca de cliente por ID**  
  `GET /clients/{id}`

- **Inserção de novo cliente**  
  `POST /clients`  
  Exemplo de JSON para inserção:
  ```json
  {
    "name": "Maria Silva",
    "cpf": "12345678901",
    "income": 6500.0,
    "birthDate": "1994-07-20",
    "children": 2
  }
  ```

- **Atualização de cliente**  
  `PUT /clients/{id}`  
  Exemplo de JSON para atualização:
  ```json
  {
    "name": "Maria Silvaaa",
    "cpf": "12345678901",
    "income": 6500.0,
    "birthDate": "1994-07-20",
    "children": 2
  }
  ```

- **Deleção de cliente**  
  `DELETE /clients/{id}`

## Regras de Validação

- **Nome:** não pode ser vazio.
- **Data de nascimento:** não pode ser uma data futura.

## Tratamento de Exceções

- **ID não encontrado:** retorna erro 404 (Not Found).
- **Dados inválidos:** retorna erro 422 (Unprocessable Entity) com mensagens de validação personalizadas.

## Como rodar o projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/clientcrud.git
   ```

2. Abra o projeto na sua IDE (IntelliJ, Eclipse ou VS Code).

3. Execute a aplicação (`ClientcrudApplication`).

4. Teste as rotas usando o Postman ou outro cliente REST.

## Checklist de Testes

- [x] Busca de cliente por ID existente
- [x] Busca de cliente por ID inexistente retorna 404
- [x] Busca paginada de clientes
- [x] Inserção de cliente válido
- [x] Inserção de cliente inválido retorna 422
- [x] Atualização de cliente existente
- [x] Atualização de cliente inexistente retorna 404
- [x] Atualização de cliente inválido retorna 422
- [x] Deleção de cliente existente
- [x] Deleção de cliente inexistente retorna 404

## Autor

Feito por **Bruno Garbero**.
