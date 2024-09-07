package com.appGestione.GestionePrenotazioni.controller;

import com.appGestione.GestionePrenotazioni.exception.PostazioneNonTrovataException;
import com.appGestione.GestionePrenotazioni.model.Postazione;
import com.appGestione.GestionePrenotazioni.service.PostazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/postazioni")
public class PostazioneController {
    private final PostazioneService postazioneService;

    @Autowired
    public PostazioneController(PostazioneService postazioneService) {
        this.postazioneService = postazioneService;
    }

    @PostMapping("/crea")
    public Postazione creaPostazione(@RequestBody Postazione postazione) {
        return postazioneService.creaPostazione(postazione);
    }

    @GetMapping("/{id}")
    public Postazione trovaPostazione(@PathVariable Long id) {
        Optional<Postazione> optionalPostazione = Optional.ofNullable(postazioneService.trovaPostazione(id));
        if (optionalPostazione.isPresent()) {
            return optionalPostazione.get();
        } else {
            throw new PostazioneNonTrovataException("Postazione con ID " + id + " non trovata");
        }
    }

    @PutMapping("/aggiorna/{id}")
    public Postazione aggiornaPostazione(@PathVariable Long id, @RequestBody Postazione postazioneAggiornata) {
        return postazioneService.aggiornaPostazione(id, postazioneAggiornata);
    }

    @DeleteMapping("/elimina/{id}")
    public void eliminaPostazione(@PathVariable Long id) {
        postazioneService.eliminaPostazione(id);
    }
}
