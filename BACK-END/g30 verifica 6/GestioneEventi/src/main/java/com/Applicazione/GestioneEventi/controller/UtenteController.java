package com.Applicazione.GestioneEventi.controller;

import com.Applicazione.GestioneEventi.model.Utente;
import com.Applicazione.GestioneEventi.service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/utenti")
public class UtenteController {

    @Autowired
    private UtenteService utenteService;

    @PostMapping("/registrazione")
    public Utente registrazione(@RequestBody Utente utente) {
        return utenteService.save(utente);
    }

    @PostMapping("/login")
    public Utente login(@RequestBody Utente utente) {
        return utenteService.findByEmailAndPassword(utente.getEmail(), utente.getPassword());
    }
}
