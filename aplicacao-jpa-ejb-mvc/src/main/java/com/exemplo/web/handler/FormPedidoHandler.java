package com.exemplo.web.handler;

import jakarta.servlet.http.*;

public class FormPedidoHandler implements Handler {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) {
        return "/formPedido.jsp";
    }
}