package Item;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Pizza extends ItemMenu{
    private List<Topping> toppings;

    public Pizza(String nome, double prezzo, int calorie, List<Topping> toppings) {
        super(nome, prezzo, calorie);
        this.toppings = toppings;
    }


}
