package com.exemplo.web.handler;

import com.exemplo.service.PedidoService;
import jakarta.ejb.EJB;
import jakarta.servlet.http.*;
import jakarta.servlet.ServletException;
import java.io.IOException;

public class AdicionarPedidoHandler implements Handler {

    @EJB
    private PedidoService service;

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        int qtd = Integer.parseInt(req.getParameter("quantidade"));
        double val = Double.parseDouble(req.getParameter("valorUnitario"));
        service.cadastrarPedido(req.getParameter("descricao"), qtd, val);
        return "/sucesso.jsp";
    }
}