package com.Applicazione.GestioneEventi.repository;

import com.Applicazione.GestioneEventi.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EventoRepository extends JpaRepository<Evento, Long> {
}
