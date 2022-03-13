package com.algaworks.algalog.algalogapi.api.model;

import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

/**
 * @Autor Jairo Nascimento
 * @Created 13/03/2022 - 17:43
 */

@Getter
@Setter
public class OcorrenciaModel {

    private Long id;
    private String descricao;
    private OffsetDateTime dataRegistro;
}
