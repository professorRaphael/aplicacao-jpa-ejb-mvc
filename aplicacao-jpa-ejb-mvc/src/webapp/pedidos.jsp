<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
    <h2>Lista de Pedidos</h2>
    <a href="formPedido.do">Novo Pedido</a>
    <table border="1">
        <tr><th>ID</th><th>Descrição</th><th>Quantidade</th><th>Valor Unitário</th><th>Total</th></tr>
        <c:forEach items="${pedidos}" var="p">
            <tr>
                <td>${p.id}</td><td>${p.descricao}</td>
                <td>${p.quantidade}</td><td>${p.valorUnitario}</td>
                <td>${p.total}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="listarClientes.do">Ver Clientes</a>
</body>
</html>