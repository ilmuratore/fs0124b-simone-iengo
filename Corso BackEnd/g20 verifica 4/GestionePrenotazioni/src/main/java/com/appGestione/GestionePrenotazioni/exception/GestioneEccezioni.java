package com.appGestione.GestionePrenotazioni.exception;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GestioneEccezioni {
    private static final Logger logger = LoggerFactory.getLogger(GestioneEccezioni.class);

    @ExceptionHandler(PostazioneNonTrovataException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void handlePostazioneNonTrovata(PostazioneNonTrovataException e) {
        logger.error("Eccezione PostazioneNonTrovata", e);
    }

    @ExceptionHandler(EdificioNonTrovatoException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void handleEdificioNonTrovato(EdificioNonTrovatoException e) {
        logger.error("Eccezione EdificioNonTrovato", e);
    }

    @ExceptionHandler(UtenteNonTrovatoException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void handleUtenteNonTrovato(UtenteNonTrovatoException e) {
        logger.error("Eccezione UtenteNonTrovato", e);
    }

    @ExceptionHandler(PrenotazioneNonTrovataException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void handlePrenotazioneNonTrovata(PrenotazioneNonTrovataException e) {
        logger.error("Eccezione PrenotazioneNonTrovata", e);

    }
}
