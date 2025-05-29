package com.exemplo.web.handler;

import com.exemplo.service.PedidoService;
import com.exemplo.model.Pedido;
import jakarta.ejb.EJB;
import jakarta.servlet.http.*;
import java.util.List;

public class ListarPedidosHandler implements Handler {

    @EJB
    private PedidoService service;

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) {
        List<Pedido> pedidos = service.listarPedidos();
        req.setAttribute("pedidos", pedidos);
        return "/pedidos.jsp";
    }
}