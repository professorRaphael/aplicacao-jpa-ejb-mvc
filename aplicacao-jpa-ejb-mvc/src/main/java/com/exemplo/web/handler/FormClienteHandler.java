package com.exemplo.web.handler;

import jakarta.servlet.http.*;

public class FormClienteHandler implements Handler {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) {
        return "/formCliente.jsp";
    }
}