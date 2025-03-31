package dao;

import model.Autobus;
import model.Mezzo;

import java.util.List;

public interface MezzoDAO<A extends Mezzo> {
    void save(A mezzo);
    A trovaPerId(int id);
    List<A> trovaTutti();
    void update(A mezzo);
    void delete(int id);
}
