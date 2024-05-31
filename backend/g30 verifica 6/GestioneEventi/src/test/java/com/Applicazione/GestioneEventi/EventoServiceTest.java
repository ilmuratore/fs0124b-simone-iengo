package com.Applicazione.GestioneEventi;

import model.Evento;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import repository.EventoRepository;
import service.EventoService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
public class EventoServiceTest {

    @Autowired
    private EventoService eventoService;

    @MockBean
    private EventoRepository eventoRepository;

    @Test
    public void testFindEventoById() {
        Evento evento = new Evento();
        evento.setId(1L);
        evento.setTitolo("Titolo dell'evento");

        when(eventoRepository.findById(1L)).thenReturn(java.util.Optional.of(evento));

        Evento foundEvento = eventoService.findEventoById(1L);

        assertEquals(1L, foundEvento.getId());
        assertEquals("Titolo dell'evento", foundEvento.getTitolo());
    }


}
