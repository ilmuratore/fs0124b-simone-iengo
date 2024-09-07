package test;

import model.Tessera;
import dao.TesseraDAO;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TesseraDAOTest {
    @Test
    void save() {
        TesseraDAO tesseraDAO = new TesseraDAO();
        Tessera tessera = new Tessera(1235,0, null ,true, null );
        // Imposta i valori di tessera
        tesseraDAO.save(tessera);
        Tessera savedTessera = tesseraDAO.find(tessera.getIdTessera());
    }

}


