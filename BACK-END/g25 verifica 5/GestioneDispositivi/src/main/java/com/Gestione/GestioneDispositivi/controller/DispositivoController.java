package com.Gestione.GestioneDispositivi.controller;

import com.Gestione.GestioneDispositivi.entity.Dispositivo;
import com.Gestione.GestioneDispositivi.model.AssegnaRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.Gestione.GestioneDispositivi.service.DispositivoService;

import java.util.List;

@RestController
@RequestMapping("/dispositivi")
public class DispositivoController {
    @Autowired
    private DispositivoService dispositivoService;

    @GetMapping
    public List<Dispositivo> getAllDispositivi() {
        return dispositivoService.getAllDispositivi();
    }

    @GetMapping("/{id}")
    public Dispositivo getDispositivoById(@PathVariable Long id) {
        return dispositivoService.getDispositivoById(id);
    }

    @PostMapping
    public Dispositivo createDispositivo(@RequestBody Dispositivo dispositivo) {
        return dispositivoService.createDispositivo(dispositivo);
    }

    @PutMapping
    public Dispositivo updateDispositivo(@RequestBody Dispositivo dispositivo) {
        return dispositivoService.updateDispositivo(dispositivo);
    }

    @DeleteMapping("/{id}")
    public void deleteDispositivo(@PathVariable Long id) {
        dispositivoService.deleteDispositivo(id);
    }

    @PostMapping("/assegna")
    public Dispositivo assegnaDispositivo(@RequestBody AssegnaRequest request) {
        return dispositivoService.assegnaDispositivo(request.getUsername(), request.getId());
    }

}
