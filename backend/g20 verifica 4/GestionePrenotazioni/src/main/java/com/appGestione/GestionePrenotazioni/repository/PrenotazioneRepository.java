package com.appGestione.GestionePrenotazioni.repository;

import com.appGestione.GestionePrenotazioni.model.Postazione;
import com.appGestione.GestionePrenotazioni.model.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
    Optional<Prenotazione> findByPostazioneAndData(Postazione postazione, LocalDate data);
}

