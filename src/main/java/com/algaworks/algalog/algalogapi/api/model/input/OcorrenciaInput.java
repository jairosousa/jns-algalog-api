package com.algaworks.algalog.algalogapi.api.model.input;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

/**
 * @Autor Jairo Nascimento
 * @Created 13/03/2022 - 17:44
 */
@Getter
@Setter
public class OcorrenciaInput {

    @NotBlank
    private String descricao;
}
