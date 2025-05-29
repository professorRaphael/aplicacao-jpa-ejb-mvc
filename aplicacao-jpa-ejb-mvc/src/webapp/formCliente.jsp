<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
    <h2>Novo Cliente</h2>
    <form action="adicionarCliente.do" method="post">
        Nome: <input type="text" name="nome"/><br/>
        Email: <input type="email" name="email"/><br/>
        <input type="submit" value="Salvar"/>
    </form>
    <a href="listarClientes.do">Voltar</a>
</body>
</html>