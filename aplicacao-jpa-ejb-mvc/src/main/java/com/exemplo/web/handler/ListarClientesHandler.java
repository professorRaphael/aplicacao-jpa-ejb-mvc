package com.exemplo.web.handler;

import com.exemplo.service.ClienteService;
import com.exemplo.model.Cliente;
import jakarta.ejb.EJB;
import jakarta.servlet.http.*;
import java.util.List;

public class ListarClientesHandler implements Handler {

    @EJB
    private ClienteService service;

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) {
        List<Cliente> clientes = service.listarClientes();
        req.setAttribute("clientes", clientes);
        return "/clientes.jsp";
    }
}