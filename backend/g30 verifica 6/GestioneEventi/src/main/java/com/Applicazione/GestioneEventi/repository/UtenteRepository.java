package com.Applicazione.GestioneEventi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Applicazione.GestioneEventi.model.Utente;

public interface UtenteRepository extends JpaRepository<Utente, Long> {
    Utente findByEmail(String email);
}
