package com.appGestione.GestionePrenotazioni.service;

import com.appGestione.GestionePrenotazioni.model.Prenotazione;
import com.appGestione.GestionePrenotazioni.model.TipoPostazione;
import com.appGestione.GestionePrenotazioni.repository.PrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class PrenotazioneService {
    private final PrenotazioneRepository prenotazioneRepository;

    @Autowired
    public PrenotazioneService(PrenotazioneRepository prenotazioneRepository) {
        this.prenotazioneRepository = prenotazioneRepository;
    }

    public Prenotazione creaPrenotazione(Prenotazione prenotazione) {
        return prenotazioneRepository.save(prenotazione);
    }

    public Optional<Prenotazione> trovaPrenotazione(Long id) {
        return prenotazioneRepository.findById(id);
    }

    public Prenotazione aggiornaPrenotazione(Long id, Prenotazione prenotazioneAggiornata) {
        return prenotazioneRepository.findById(id)
                .map(prenotazione -> {
                    prenotazione.setData(prenotazioneAggiornata.getData());
                    return prenotazioneRepository.save(prenotazione);
                })
                .orElseThrow(() -> new RuntimeException("Prenotazione non trovata"));
    }

    public void eliminaPrenotazione(Long id) {
        prenotazioneRepository.deleteById(id);
    }

}
