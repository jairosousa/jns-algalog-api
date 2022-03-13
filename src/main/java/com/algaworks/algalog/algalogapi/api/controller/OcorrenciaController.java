package com.algaworks.algalog.algalogapi.api.controller;

import com.algaworks.algalog.algalogapi.api.assembler.OcorrenciaAssembler;
import com.algaworks.algalog.algalogapi.api.model.EntregaModel;
import com.algaworks.algalog.algalogapi.api.model.OcorrenciaModel;
import com.algaworks.algalog.algalogapi.api.model.input.OcorrenciaInput;
import com.algaworks.algalog.algalogapi.domain.model.Ocorrencia;
import com.algaworks.algalog.algalogapi.domain.service.RegistroOcorrenciaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @Autor Jairo Nascimento
 * @Created 13/03/2022 - 17:44
 */
@AllArgsConstructor
@RestController
@RequestMapping("/entregas/{entregaId}/ocorrencias")
public class OcorrenciaController {

    private RegistroOcorrenciaService registroOcorrenciaService;
    private OcorrenciaAssembler ocorrenciaAssembler;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OcorrenciaModel registrar(@PathVariable Long entregaId,
                                     @Valid @RequestBody OcorrenciaInput ocorrenciaInput) {
        Ocorrencia registrar = registroOcorrenciaService
                .registrar(entregaId, ocorrenciaInput.getDescricao());
        return ocorrenciaAssembler.toModel(registrar);
    }

    @GetMapping
    public List<OcorrenciaModel> listar(@PathVariable Long entregaId) {

        return ocorrenciaAssembler.toCollectionModel(registroOcorrenciaService.buscar(entregaId));
    }
}
