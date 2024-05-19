package com.appGestione.GestionePrenotazioni.service;

import com.appGestione.GestionePrenotazioni.model.Edificio;
import com.appGestione.GestionePrenotazioni.repository.EdificioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EdificioService {
    private final EdificioRepository edificioRepository;

    @Autowired
    public EdificioService(EdificioRepository edificioRepository) {
        this.edificioRepository = edificioRepository;
    }

    public Edificio creaEdificio(Edificio edificio) {
        return edificioRepository.save(edificio);
    }

    public Optional<Edificio> trovaEdificio(Long id) {
        return edificioRepository.findById(id);
    }

    public Edificio aggiornaEdificio(Long id, Edificio edificioAggiornato) {
        return edificioRepository.findById(id)
                .map(edificio -> {
                    edificio.setNome(edificioAggiornato.getNome());
                    edificio.setIndirizzo(edificioAggiornato.getIndirizzo());
                    edificio.setCitta(edificioAggiornato.getCitta());
                    return edificioRepository.save(edificio);
                })
                .orElseThrow(() -> new RuntimeException("Edificio non trovato"));
    }

    public void eliminaEdificio(Long id) {
        edificioRepository.deleteById(id);
    }
}
