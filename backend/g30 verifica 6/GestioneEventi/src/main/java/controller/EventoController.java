package controller;


import model.Evento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.EventoService;

import java.util.List;

@RestController
@RequestMapping("/eventi")
public class EventoController {

    @Autowired
    private EventoService eventoService;

    @GetMapping
    public List<Evento> getAllEventi() {
        return eventoService.findAll();
    }

    @PostMapping
    public Evento createEvento(@RequestBody Evento evento) {
        return eventoService.save(evento);
    }

    @PutMapping("/{id}")
    public Evento updateEvento(@PathVariable Long id, @RequestBody Evento evento) {
        Evento existingEvento = eventoService.findById(id);
        existingEvento.setTitolo(evento.getTitolo());
        existingEvento.setDescrizione(evento.getDescrizione());
        existingEvento.setData(evento.getData());
        existingEvento.setLuogo(evento.getLuogo());
        existingEvento.setPostiDisponibili(evento.getPostiDisponibili());
        return eventoService.save(existingEvento);
    }

    @DeleteMapping("/{id}")
    public void deleteEvento(@PathVariable Long id) {
        eventoService.deleteById(id);
    }
}
