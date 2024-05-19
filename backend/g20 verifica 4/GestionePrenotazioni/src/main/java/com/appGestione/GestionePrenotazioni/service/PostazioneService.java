package com.appGestione.GestionePrenotazioni.service;

import com.appGestione.GestionePrenotazioni.exception.PostazioneNonTrovataException;
import com.appGestione.GestionePrenotazioni.model.Postazione;
import com.appGestione.GestionePrenotazioni.repository.PostazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostazioneService {
    private final PostazioneRepository postazioneRepository;

    @Autowired
    public PostazioneService(PostazioneRepository postazioneRepository) {
        this.postazioneRepository = postazioneRepository;
    }


    public Postazione creaPostazione(Postazione postazione) {
        return postazioneRepository.save(postazione);
    }

    public Postazione trovaPostazione(Long id) {
        return postazioneRepository.findById(id)
                .orElseThrow(() -> new PostazioneNonTrovataException("Postazione con ID " + id + " non trovata"));
    }

    public Postazione aggiornaPostazione(Long id, Postazione postazioneAggiornata) {
        return postazioneRepository.findById(id)
                .map(postazione -> {
                    postazione.setCodice(postazioneAggiornata.getCodice());
                    postazione.setDescrizione(postazioneAggiornata.getDescrizione());
                    postazione.setTipo(postazioneAggiornata.getTipo());
                    postazione.setMaxOccupanti(postazioneAggiornata.getMaxOccupanti());
                    return postazioneRepository.save(postazione);
                })
                .orElseThrow(() -> new RuntimeException("Postazione non trovata"));
    }

    public void eliminaPostazione(Long id) {
        postazioneRepository.deleteById(id);
    }
}
