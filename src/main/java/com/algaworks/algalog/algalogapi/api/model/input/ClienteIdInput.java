package com.algaworks.algalog.algalogapi.api.model.input;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
 * @Autor Jairo Nascimento
 * @Created 13/03/2022 - 16:59
 */
@Getter
@Setter
public class ClienteIdInput {

    @NotNull
    private Long id;
}
