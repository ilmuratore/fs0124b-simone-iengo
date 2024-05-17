package Item;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Menu {
    private List<Pizza> pizze;
    private List<Bevanda> bevande;
    private List<Topping> toppings;

    //costruttore

    public Menu(List<Pizza> pizze, List<Bevanda> bevande, List<Topping> toppings) {
        this.pizze = pizze;
        this.bevande = bevande;
        this.toppings = toppings;
    }

    /* getter e setter */



}
