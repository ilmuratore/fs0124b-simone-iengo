package exception;

public class EventoNonTrovatoException extends RuntimeException {

    public EventoNonTrovatoException(Long id) {
        super("Non è stato possibile trovare l'evento con l'ID " + id);
    }
}
