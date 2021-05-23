package com.algaworks.algalog.algalogapi.controller;

import com.algaworks.algalog.algalogapi.domain.model.Cliente;
import com.algaworks.algalog.algalogapi.domain.repository.ClienteRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("clientes")
public class ClienteController {

  private final ClienteRepository clienteRepository;

 @GetMapping
  public List<Cliente> listar() {
    return clienteRepository.findAll();
  }

  @GetMapping("find")
  public List<Cliente> findByNome(@RequestParam String nome) {
   return clienteRepository.findByNomeContaining(nome);
  }
}
