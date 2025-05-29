# Aplicação Java EE Clientes e Pedidos

## Como executar

1. Configure um datasource JNDI `java:/jdbc/MeuDS` no servidor (WildFly/GlassFish).
2. No terminal, execute:

   ```bash
   mvn clean package
   ```

3. Faça deploy do WAR gerado (`target/aplicacao-jpa-ejb-mvc.war`) no servidor.
4. Acesse no navegador:
   `http://localhost:8080/aplicacao-jpa-ejb-mvc/listarClientes.do`

## Estrutura de Pastas

```cmd
aplicacao-jpa-ejb-mvc/
├── pom.xml
├── README.md
├── src/
│   ├── main/
│   │   ├── java/com/exemplo/
│   │   │   ├── model/Cliente.java
│   │   │   ├── model/Pedido.java
│   │   │   ├── dao/ClienteDAO.java
│   │   │   ├── dao/PedidoDAO.java
│   │   │   ├── service/ClienteService.java
│   │   │   ├── service/PedidoService.java
│   │   │   └── web/
│   │   │       ├── FrontController.java
│   │   │       └── handler/
│   │   │           ├── Handler.java
│   │   │           ├── HandlerFactory.java
│   │   │           ├── ListarClientesHandler.java
│   │   │           ├── FormClienteHandler.java
│   │   │           ├── AdicionarClienteHandler.java
│   │   │           ├── ListarPedidosHandler.java
│   │   │           ├── FormPedidoHandler.java
│   │   │           └── AdicionarPedidoHandler.java
│   │   └── resources/META-INF/persistence.xml
│   └── webapp/
│       ├── clientes.jsp
│       ├── formCliente.jsp
│       ├── pedidos.jsp
│       ├── formPedido.jsp
│       └── sucesso.jsp
```  

### Modelos (JPA Entities)

- Cliente
- Pedido

### Camada DAO (Stateless EJB)

- ClienteDAO
- PedidoDAO

Camada de Serviço (Business Rules)

- ClienteService
- PedidoService

### Front Controller e Handlers

- FrontController
- Handler
- HandlerFactory
- ListarClientesHandler
- FormClienteHandler
- AdicionarClienteHandler
- ListarPedidosHandler
- FormPedidoHandler
- AdicionarPedidoHandler

### JSPs (Views)

- clientes.jsp
- formCliente.jsp
- pedidos.jsp
- formPedido.jsp
- sucesso.jsp
