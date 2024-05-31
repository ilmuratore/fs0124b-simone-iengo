package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import model.Utente;

public interface UtenteRepository extends JpaRepository<Utente, Long> {
    Utente findByEmail(String email);
}
