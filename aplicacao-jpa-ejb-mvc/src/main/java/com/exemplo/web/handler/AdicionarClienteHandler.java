package com.exemplo.web.handler;

import com.exemplo.service.ClienteService;
import jakarta.ejb.EJB;
import jakarta.servlet.http.*;
import jakarta.servlet.ServletException;
import java.io.IOException;

public class AdicionarClienteHandler implements Handler {

    @EJB
    private ClienteService service;

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        service.cadastrarCliente(req.getParameter("nome"), req.getParameter("email"));
        return "/sucesso.jsp";
    }
}