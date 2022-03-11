package com.algaworks.algalog.algalogapi.domain.repository;

import com.algaworks.algalog.algalogapi.domain.model.Entrega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Autor Jairo Nascimento
 * @Created 11/03/2022 - 17:15
 */
@Repository
public interface EntregaRepository extends JpaRepository<Entrega, Long> {
}
