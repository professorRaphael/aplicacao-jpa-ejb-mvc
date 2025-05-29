<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
    <h2>Lista de Clientes</h2>
    <a href="formCliente.do">Novo Cliente</a>
    <table border="1">
        <tr><th>ID</th><th>Nome</th><th>Email</th></tr>
        <c:forEach items="${clientes}" var="c">
            <tr>
                <td>${c.id}</td><td>${c.nome}</td><td>${c.email}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="listarPedidos.do">Ver Pedidos</a>
</body>
</html>