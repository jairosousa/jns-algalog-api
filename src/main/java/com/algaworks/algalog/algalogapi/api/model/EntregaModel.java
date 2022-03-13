package com.algaworks.algalog.algalogapi.api.model;

import com.algaworks.algalog.algalogapi.domain.model.Cliente;
import com.algaworks.algalog.algalogapi.domain.model.Destinatario;
import com.algaworks.algalog.algalogapi.domain.model.StatusEntrega;
import com.algaworks.algalog.algalogapi.domain.model.ValidationGroups;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.groups.ConvertGroup;
import javax.validation.groups.Default;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

/**
 * @Autor Jairo Nascimento
 * @Created 13/03/2022 - 12:00
 */
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntregaModel {

    private Long id;

    private ClienteResumoModel cliente;

    private DestinatarioModel destinatario;

    private BigDecimal taxa;

    private StatusEntrega status;

    private OffsetDateTime dataPedido;

    private OffsetDateTime dataFinalizacao;
}
