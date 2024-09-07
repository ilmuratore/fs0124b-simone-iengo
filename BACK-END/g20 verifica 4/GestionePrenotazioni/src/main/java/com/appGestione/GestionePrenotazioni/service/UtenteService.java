package com.appGestione.GestionePrenotazioni.service;

import com.appGestione.GestionePrenotazioni.model.Utente;
import com.appGestione.GestionePrenotazioni.repository.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UtenteService {
    private final UtenteRepository utenteRepository;

    @Autowired
    public UtenteService(UtenteRepository utenteRepository) {
        this.utenteRepository = utenteRepository;
    }

    public Utente creaUtente(Utente utente) {
        return utenteRepository.save(utente);
    }

    public Optional<Utente> trovaUtente(Long id) {
        return utenteRepository.findById(id);
    }

    public Utente aggiornaUtente(Long id, Utente utenteAggiornato) {
        return utenteRepository.findById(id)
                .map(utente -> {
                    utente.setUsername(utenteAggiornato.getUsername());
                    utente.setNomeCompleto(utenteAggiornato.getNomeCompleto());
                    utente.setEmail(utenteAggiornato.getEmail());
                    return utenteRepository.save(utente);
                })
                .orElseThrow(() -> new RuntimeException("Utente non trovato"));
    }

    public void eliminaUtente(Long id) {
        utenteRepository.deleteById(id);
    }
}
