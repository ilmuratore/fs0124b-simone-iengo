package com.Gestione.GestioneDispositivi.service;

import com.Gestione.GestioneDispositivi.entity.Dipendente;
import com.Gestione.GestioneDispositivi.entity.Dispositivo;
import com.Gestione.GestioneDispositivi.exception.CustomException;
import com.Gestione.GestioneDispositivi.repository.DipendenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;
import com.Gestione.GestioneDispositivi.repository.DispositivoRepository;
import java.util.List;

@Service
public class DispositivoService {
    @Autowired
    private DispositivoRepository dispositivoRepository;
    @Autowired
    private DipendenteRepository dipendenteRepository;

    public List<Dispositivo> getAllDispositivi() {
        return dispositivoRepository.findAll();
    }

    public Dispositivo getDispositivoById(Long id) {
        return dispositivoRepository.findById(id).orElse(null);
    }

    public Dispositivo createDispositivo(Dispositivo dispositivo) {
        return dispositivoRepository.save(dispositivo);
    }

    public Dispositivo updateDispositivo(Dispositivo dispositivo) {
        return dispositivoRepository.save(dispositivo);
    }

    public void deleteDispositivo(Long id) {
        dispositivoRepository.deleteById(id);
    }

    public Dispositivo assegnaDispositivo(String username, Long id) {
        Dipendente dipendente = dipendenteRepository.findById(username)
                .orElseThrow(() -> new CustomException("Dipendente non trovato"));
        Dispositivo dispositivo = dispositivoRepository.findById(id)
                .orElseThrow(() -> new CustomException("Dispositivo non trovato"));

        dispositivo.setDipendente(dipendente);
        return dispositivoRepository.save(dispositivo);
    }


}
