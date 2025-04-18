package com.Applicazione.GestioneEventi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(EventoNonTrovatoException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void handleEventoNonTrovatoException(EventoNonTrovatoException e) {
    }
}
