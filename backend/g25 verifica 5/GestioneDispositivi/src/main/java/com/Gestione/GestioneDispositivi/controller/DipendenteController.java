package com.Gestione.GestioneDispositivi.controller;

import com.Gestione.GestioneDispositivi.entity.Dipendente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.Gestione.GestioneDispositivi.service.DipendenteService;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/dipendenti")
public class DipendenteController {
    @Autowired
    private DipendenteService dipendenteService;

    @GetMapping
    public List<Dipendente> getAllDipendenti() {
        return dipendenteService.getAllDipendenti();
    }

    @GetMapping("/{username}")
    public Dipendente getDipendenteByUsername(@PathVariable String username) {
        return dipendenteService.getDipendenteByUsername(username);
    }

    @PostMapping
    public Dipendente createDipendente(@RequestBody Dipendente dipendente) {
        return dipendenteService.createDipendente(dipendente);
    }

    @PutMapping
    public Dipendente updateDipendente(@RequestBody Dipendente dipendente) {
        return dipendenteService.updateDipendente(dipendente);
    }

    @DeleteMapping("/{username}")
    public void deleteDipendente(@PathVariable String username) {
        dipendenteService.deleteDipendente(username);
    }

    @PostMapping("/{username}/uploadImmagine")
    public Dipendente uploadImmagineProfilo(@PathVariable String username, @RequestParam("file") MultipartFile file) {
        return dipendenteService.uploadImage(file, username);
    }


}
