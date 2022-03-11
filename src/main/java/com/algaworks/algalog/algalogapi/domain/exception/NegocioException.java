package com.algaworks.algalog.algalogapi.domain.exception;

/**
 * @Autor Jairo Nascimento
 * @Created 11/03/2022 - 16:22
 */
public class NegocioException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public NegocioException(String message) {
        super(message);
    }
}
