package com.Gestione.GestioneDispositivi.repository;

import com.Gestione.GestioneDispositivi.entity.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DipendenteRepository extends JpaRepository<Dipendente, String> {
}
