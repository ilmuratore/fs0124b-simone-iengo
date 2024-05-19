package com.appGestione.GestionePrenotazioni.repository;

import com.appGestione.GestionePrenotazioni.model.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtenteRepository extends JpaRepository<Utente, Long> {}
