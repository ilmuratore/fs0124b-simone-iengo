package com.appGestione.GestionePrenotazioni.repository;

import com.appGestione.GestionePrenotazioni.model.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {}
