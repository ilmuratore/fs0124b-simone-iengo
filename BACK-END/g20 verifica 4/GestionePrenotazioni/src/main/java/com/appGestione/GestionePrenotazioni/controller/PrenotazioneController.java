package com.appGestione.GestionePrenotazioni.controller;

import com.appGestione.GestionePrenotazioni.model.Prenotazione;
import com.appGestione.GestionePrenotazioni.model.Utente;
import com.appGestione.GestionePrenotazioni.service.PrenotazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/prenotazioni")
public class PrenotazioneController {
    private final PrenotazioneService prenotazioneService;

    @Autowired
    public PrenotazioneController(PrenotazioneService prenotazioneService) {
        this.prenotazioneService = prenotazioneService;
    }

    @PostMapping("/crea")
    public Prenotazione creaPrenotazione(@RequestBody Prenotazione prenotazione) {
        return prenotazioneService.creaPrenotazione(prenotazione);
    }

    @GetMapping("/{id}")
    public Prenotazione trovaPrenotazione(@PathVariable Long id) {
        return prenotazioneService.trovaPrenotazione(id)
                .orElseThrow(() -> new RuntimeException("Prenotazione non trovata"));
    }

    @PutMapping("/aggiorna/{id}")
    public Prenotazione aggiornaPrenotazione(@PathVariable Long id, @RequestBody Prenotazione prenotazioneAggiornata) {
        return prenotazioneService.aggiornaPrenotazione(id, prenotazioneAggiornata);
    }

    @DeleteMapping("/elimina/{id}")
    public void eliminaPrenotazione(@PathVariable Long id) {
        prenotazioneService.eliminaPrenotazione(id);
    }
}
