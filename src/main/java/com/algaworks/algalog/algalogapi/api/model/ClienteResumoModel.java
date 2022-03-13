package com.algaworks.algalog.algalogapi.api.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @Autor Jairo Nascimento
 * @Created 13/03/2022 - 16:54
 */
@Getter
@Setter
public class ClienteResumoModel {

    private Long id;
    private String nome;
}
