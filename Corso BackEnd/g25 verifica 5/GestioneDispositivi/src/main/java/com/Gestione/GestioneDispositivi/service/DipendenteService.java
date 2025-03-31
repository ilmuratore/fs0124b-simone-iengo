package com.Gestione.GestioneDispositivi.service;

import com.Gestione.GestioneDispositivi.entity.Dipendente;
import com.Gestione.GestioneDispositivi.exception.CustomException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Gestione.GestioneDispositivi.repository.DipendenteRepository;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class DipendenteService {
    @Autowired
    private DipendenteRepository dipendenteRepository;

    public List<Dipendente> getAllDipendenti() {
        return dipendenteRepository.findAll();
    }

    public Dipendente getDipendenteByUsername(String username) {
        return dipendenteRepository.findById(username).orElse(null);
    }

    public Dipendente createDipendente(Dipendente dipendente) {
        return dipendenteRepository.save(dipendente);
    }

    public Dipendente updateDipendente(Dipendente dipendente) {
        return dipendenteRepository.save(dipendente);
    }

    public void deleteDipendente(String username) {
        dipendenteRepository.deleteById(username);
    }

    public Dipendente uploadImage(MultipartFile file, String username) {
        Dipendente dipendente = dipendenteRepository.findById(username).orElseThrow(() -> new CustomException("Dipendente non trovato"));
        dipendente.setImmagineProfilo(file.getOriginalFilename());
        dipendenteRepository.save(dipendente);
        return dipendente;
    }




}
