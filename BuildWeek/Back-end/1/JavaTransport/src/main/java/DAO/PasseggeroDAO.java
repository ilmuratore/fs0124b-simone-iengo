package dao;
import model.Passeggero;

import java.util.List;


public interface PasseggeroDAO {
    void save(Passeggero passeggero);
    Passeggero findById(int id);
    List<Passeggero> findAll();
    void update(Passeggero passeggero);
    void delete(int id);
}