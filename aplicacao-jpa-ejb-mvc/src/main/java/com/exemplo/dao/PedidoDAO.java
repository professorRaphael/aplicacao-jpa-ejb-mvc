package com.exemplo.dao;

import com.exemplo.model.Pedido;
import jakarta.ejb.Stateless;
import jakarta.persistence.*;
import java.util.List;

@Stateless
public class PedidoDAO {

    @PersistenceContext
    private EntityManager em;

    public void salvar(Pedido p) {
        em.persist(p);
    }

    public List<Pedido> listar() {
        return em.createQuery("SELECT p FROM Pedido p", Pedido.class)
                .getResultList();
    }
}