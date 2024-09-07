package Item;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class ItemMenu {
    private String nome;
    private double prezzo;
    private int calorie;

    public ItemMenu(String nome, double prezzo, int calorie) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.calorie = calorie;
    }




}
