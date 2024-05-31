package service;


import model.Evento;
import repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoService {

        @Autowired
        private EventoRepository eventoRepository;

        public Evento findEventoById(Long id) {
            return eventoRepository.findById(id).orElse(null);
        }

        public void saveEvento(Evento evento) {
            eventoRepository.save(evento);
        }

    public List<Evento> findAll() {
        return null;
    }

    public Evento save(Evento evento) {
    }

    public Evento findById(Long id) {
    }

    public void deleteById(Long id) {
    }
}
