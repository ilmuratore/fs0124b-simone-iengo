package com.appGestione.GestionePrenotazioni.controller;

import com.appGestione.GestionePrenotazioni.model.Utente;
import com.appGestione.GestionePrenotazioni.service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/utenti")
public class UtenteController {
    private final UtenteService utenteService;

    @Autowired
    public UtenteController(UtenteService utenteService) {
        this.utenteService = utenteService;
    }

    @PostMapping("/crea")
    public Utente creaUtente(@RequestBody Utente utente) {
        return utenteService.creaUtente(utente);
    }

    @GetMapping("/{id}")
    public Utente trovaUtente(@PathVariable Long id) {
        return utenteService.trovaUtente(id)
                .orElseThrow(() -> new RuntimeException("Utente non trovato"));
    }

    @PutMapping("/aggiorna/{id}")
    public Utente aggiornaUtente(@PathVariable Long id, @RequestBody Utente utenteAggiornato) {
        return utenteService.aggiornaUtente(id, utenteAggiornato);
    }

    @DeleteMapping("/elimina/{id}")
    public void eliminaUtente(@PathVariable Long id) {
        utenteService.eliminaUtente(id);
    }
}
