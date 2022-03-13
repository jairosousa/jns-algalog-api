package com.algaworks.algalog.algalogapi.api.exeptionhandler;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * @Autor Jairo Nascimento
 * @Created 11/03/2022 - 13:47
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class Problema {
    private Integer status;
    private OffsetDateTime dataHora;
    private String titulo;
    private List<Campo> campos;

    @AllArgsConstructor
    @Getter
    public static class Campo {
        private String nome;
        private String mensagem;
    }
}
