package com.exemplo.service;

import com.exemplo.dao.ClienteDAO;
import com.exemplo.model.Cliente;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import java.util.List;

@Stateless
public class ClienteService {

    @Inject
    private ClienteDAO dao;

    public void cadastrarCliente(String nome, String email) {
        Cliente c = new Cliente();
        c.setNome(nome);
        c.setEmail(email);
        dao.salvar(c);
    }

    public List<Cliente> listarClientes() {
        return dao.listar();
    }
}