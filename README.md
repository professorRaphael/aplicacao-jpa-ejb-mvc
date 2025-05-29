# Sistema de Gerenciamento de Clientes e Pedidos

**Disciplina:** PADRÕES DE PROJETOS DE SOFTWARE COM JAVA

Este projeto foi desenvolvido como exemplo prático para a disciplina de **Padrões de Projetos de Software com Java**. Ele demonstra a construção de uma aplicação web simples usando **Jakarta EE** (JPA + EJB), **Arquitetura MVC** e o padrão **Front Controller**, tudo organizado em módulos claros para CRUD de **Clientes** e **Pedidos**.

## Funcionalidades

- **Adicionar Cliente**: Formulário para cadastrar novo cliente (nome, e-mail).  
- **Listar Clientes**: Exibe todos os clientes cadastrados.  
- **Adicionar Pedido**: Formulário para cadastrar pedido (descrição, quantidade, valor unitário).  
- **Listar Pedidos**: Exibe todos os pedidos, com cálculo automático do total.  

## Tecnologias Utilizadas

- **Java 11+ / Jakarta EE 8**: Plataforma de desenvolvimento.  
- **JPA (Hibernate)**: Mapeamento objeto-relacional e operações CRUD.  
- **EJB Stateless**: Camada de negócio e persistência.  
- **Servlet + JSP + JSTL**: Implementação MVC e views.  
- **Front Controller**: Centralização do fluxo de requisições (`*.do`).  
- **Maven**: Gerenciamento de dependências e build.

## Estrutura do Projeto

```bash
aplicacao-jpa-ejb-mvc/
├── pom.xml                     # Configuração Maven
├── README.md                   # Este arquivo
├── src/
│   ├── main/
│   │   ├── java/com/exemplo/
│   │   │   ├── model/          # Entidades JPA (Cliente, Pedido)
│   │   │   ├── dao/            # DAOs como Stateless EJBs
│   │   │   ├── service/        # Serviços de negócio (EJBs)
│   │   │   └── web/handler/     # Handlers do Front Controller
│   │   │       ├── Handler.java
│   │   │       ├── HandlerFactory.java
│   │   │       └── ...  
│   │   └── resources/
│   │       └── META-INF/
│   │           └── persistence.xml  # Configuração JPA / DataSource JNDI
│   └── webapp/
│       ├── formCliente.jsp
│       ├── clientes.jsp
│       ├── formPedido.jsp
│       ├── pedidos.jsp
│       └── sucesso.jsp
└── target/                     # Artefatos gerados pelo Maven
````

## Como Executar o Projeto

### Pré-requisitos

- **JDK 11+**
- **Maven 3.6+**
- **Servidor Java EE** (WildFly, GlassFish, etc.) com um DataSource JNDI configurado `java:/jdbc/MeuDS`

### Passo a Passo

1. **Clonar o repositório**

   ```bash
   git clone https://github.com/professorRaphael/aplicacao-jpa-ejb-mvc.git
   cd aplicacao-jpa-ejb-mvc
   ```

2. **Build com Maven**

   ```bash
   mvn clean package
   ```

3. **Deploy**

   - Copie o WAR gerado (`target/aplicacao-jpa-ejb-mvc.war`) para o seu servidor Java EE.
   - Certifique-se de que o DataSource JNDI `java:/jdbc/MeuDS` está disponível.

4. **Acessar**
   Abra no navegador:

   ```bash
   http://localhost:8080/aplicacao-jpa-ejb-mvc/listarClientes.do
   ```

## Endpoints Disponíveis

| URL                    | Descrição                      |
| ---------------------- | ------------------------------ |
| `/listarClientes.do`   | Lista todos os clientes        |
| `/formCliente.do`      | Formulário de cadastro Cliente |
| `/adicionarCliente.do` | Ação de salvar Cliente         |
| `/listarPedidos.do`    | Lista todos os pedidos         |
| `/formPedido.do`       | Formulário de cadastro Pedido  |
| `/adicionarPedido.do`  | Ação de salvar Pedido          |

## Objetivos Pedagógicos

- **Padrões de Projeto**: Aplicação do **Front Controller**, **DAO**, **Service**, **MVC**, **EJB** e **JPA**.
- **Arquitetura em Camadas**: Separação clara entre apresentação, negócio e persistência.
- **Injeção de Dependências**: Uso de `@PersistenceContext`, `@EJB` e `@Inject`.
- **Boas Práticas Java EE**: Configuração JNDI, transaction-management e modularização.

## Contribuindo

Contribuições são bem-vindas!
Abra uma *issue* ou envie *pull requests* para melhorar este exemplo e ajudar outros estudantes.

---

**Professor Raphael Mauricio Sanches de Jesus** - Universidade Estácio de Sá - Curso: Padrões de Projetos de Software com Java
