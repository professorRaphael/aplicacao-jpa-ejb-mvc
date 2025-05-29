package com.exemplo.service;

import com.exemplo.dao.PedidoDAO;
import com.exemplo.model.Pedido;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import java.util.List;

@Stateless
public class PedidoService {

    @Inject
    private PedidoDAO dao;

    public void cadastrarPedido(String descricao, int quantidade, double valorUnitario) {
        Pedido p = new Pedido();
        p.setDescricao(descricao);
        p.setQuantidade(quantidade);
        p.setValorUnitario(valorUnitario);
        dao.salvar(p);
    }

    public List<Pedido> listarPedidos() {
        return dao.listar();
    }
}