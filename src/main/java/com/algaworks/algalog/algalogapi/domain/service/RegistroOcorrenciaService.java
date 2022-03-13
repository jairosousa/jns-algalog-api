package com.algaworks.algalog.algalogapi.domain.service;

import com.algaworks.algalog.algalogapi.domain.exception.NegocioException;
import com.algaworks.algalog.algalogapi.domain.model.Entrega;
import com.algaworks.algalog.algalogapi.domain.model.Ocorrencia;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Autor Jairo Nascimento
 * @Created 13/03/2022 - 17:27
 */
@AllArgsConstructor
@Service
public class RegistroOcorrenciaService {

    private BuscaEntregaService buscaEntregaService;

    @Transactional
    public Ocorrencia registrar(Long entregaId, String descricao) {
        Entrega entrega = buscaEntregaService.buscar(entregaId);
        Ocorrencia ocorrenciaRegistrada = entrega.adicionarOcorrencia(descricao);
        return ocorrenciaRegistrada;
    }

    public List<Ocorrencia> buscar(Long entregaId) {
        Entrega entrega = buscaEntregaService.buscar(entregaId);

        return entrega.getOcorrencias();
    }
}
