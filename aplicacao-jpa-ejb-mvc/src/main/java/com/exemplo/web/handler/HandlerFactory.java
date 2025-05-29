package com.exemplo.web.handler;

import java.util.HashMap;
import java.util.Map;

public class HandlerFactory {

    private static final Map<String, Handler> handlers = new HashMap<>();

    static {
        handlers.put("/listarClientes.do", new ListarClientesHandler());
        handlers.put("/formCliente.do", new FormClienteHandler());
        handlers.put("/adicionarCliente.do", new AdicionarClienteHandler());
        handlers.put("/listarPedidos.do", new ListarPedidosHandler());
        handlers.put("/formPedido.do", new FormPedidoHandler());
        handlers.put("/adicionarPedido.do", new AdicionarPedidoHandler());
    }

    public static Handler getHandler(String action) {
        return handlers.getOrDefault(action, (req, resp) -> "/sucesso.jsp");
    }
}