package com.algaworks.algalog.algalogapi.api.assembler;

import com.algaworks.algalog.algalogapi.api.model.EntregaModel;
import com.algaworks.algalog.algalogapi.api.model.input.EntregaInput;
import com.algaworks.algalog.algalogapi.domain.model.Entrega;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Autor Jairo Nascimento
 * @Created 13/03/2022 - 16:41
 */
@AllArgsConstructor
@Component
public class EntregaAssembler {

    private ModelMapper modelMapper;

    public EntregaModel toModel(Entrega entrega) {
        return modelMapper.map(entrega, EntregaModel.class);
    }

    public List<EntregaModel> toCollectionModel(List<Entrega> entregas) {
        return entregas.stream()
                .map(this::toModel)
                .collect(Collectors.toList());
    }

    public Entrega toEntity(EntregaInput entregaInput) {
        return modelMapper.map(entregaInput, Entrega.class);
    }
}
