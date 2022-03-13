package com.algaworks.algalog.algalogapi.api.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

/**
 * @Autor Jairo Nascimento
 * @Created 13/03/2022 - 16:11
 */
@Getter
@Setter
public class DestinatarioModel {

    @NotBlank
    private String nome;

    @NotBlank
    private String logradouro;

    @NotBlank
    private String numero;

    @NotBlank
    private String complemento;

    @NotBlank
    private String bairro;
}
