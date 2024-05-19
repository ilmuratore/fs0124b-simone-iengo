package com.appGestione.GestionePrenotazioni.controller;

import com.appGestione.GestionePrenotazioni.model.Edificio;
import com.appGestione.GestionePrenotazioni.service.EdificioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/edifici")
public class EdificioController {
    private final EdificioService edificioService;

    @Autowired
    public EdificioController(EdificioService edificioService) {
        this.edificioService = edificioService;
    }

    @PostMapping("/crea")
    public Edificio creaEdificio(@RequestBody Edificio edificio) {
        return edificioService.creaEdificio(edificio);
    }

    @GetMapping("/{id}")
    public Edificio trovaEdificio(@PathVariable Long id) {
        return edificioService.trovaEdificio(id)
                .orElseThrow(() -> new RuntimeException("Edificio non trovato"));
    }

    @PutMapping("/aggiorna/{id}")
    public Edificio aggiornaEdificio(@PathVariable Long id, @RequestBody Edificio edificioAggiornato) {
        return edificioService.aggiornaEdificio(id, edificioAggiornato);
    }

    @DeleteMapping("/elimina/{id}")
    public void eliminaEdificio(@PathVariable Long id) {
        edificioService.eliminaEdificio(id);
    }
}
