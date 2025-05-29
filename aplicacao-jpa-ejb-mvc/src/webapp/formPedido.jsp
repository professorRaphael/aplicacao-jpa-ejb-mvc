<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
    <h2>Novo Pedido</n2>
    <form action="adicionarPedido.do" method="post">
        Descrição: <input type="text" name="descricao"/><br/>
        Quantidade: <input type="number" name="quantidade"/><br/>
        Valor Unitário: <input type="text" name="valorUnitario"/><br/>
        <input type="submit" value="Salvar"/>
    </form>
    <a href="listarPedidos.do">Voltar</a>
</body>
</html>