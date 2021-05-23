package com.algaworks.algalog.algalogapi.controller;

import com.algaworks.algalog.algalogapi.domain.model.Cliente;
import java.util.Arrays;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("clientes")
public class ClienteController {

  @PersistenceContext
  private EntityManager manager;

  @GetMapping
  public List<Cliente> listar() {
    return manager.createQuery("from Cliente",  Cliente.class)
        .getResultList();
  }
}
