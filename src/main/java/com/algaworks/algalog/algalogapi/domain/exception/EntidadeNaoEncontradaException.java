package com.algaworks.algalog.algalogapi.domain.exception;

/**
 * @Autor Jairo Nascimento
 * @Created 13/03/2022 - 17:57
 */
public class EntidadeNaoEncontradaException extends NegocioException{

    private static final long serialVersionUID = 1L;

    public EntidadeNaoEncontradaException(String message) {
        super(message);
    }
}
