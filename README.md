# inventory-service
Este repositório contém o código fonte do serviço de gerenciamento do estoque de produtos.

### Variáveis de ambiente

Para executar esta aplicação é necessário informar as seguintes variáveis de ambiente:

- `APPLICATION_PORT` -> porta onde o servidor da aplicação irá executar
- `JDBC_DATABASE_URL` -> string de conexão com o banco de dados
- `JDBC_DATABASE_USERNAME` -> nome de usuário para se autenticar no banco de dados
- `JDBC_DATABASE_PASSWORD` -> senha para se autenticar no banco de dados
- `PRODUCT_SERVICE_URL` -> endereço do serviço de produtos a qual este serviço se comunica