package com.exemplo.dao;

import com.exemplo.model.Cliente;
import jakarta.ejb.Stateless;
import jakarta.persistence.*;
import java.util.List;

@Stateless
public class ClienteDAO {

    @PersistenceContext
    private EntityManager em;

    public void salvar(Cliente c) {
        em.persist(c);
    }

    public Cliente buscar(Long id) {
        return em.find(Cliente.class, id);
    }

    public List<Cliente> listar() {
        return em.createQuery("SELECT c FROM Cliente c", Cliente.class)
                .getResultList();
    }

    public void remover(Long id) {
        Cliente c = buscar(id);
        if (c != null)
            em.remove(c);
    }
}