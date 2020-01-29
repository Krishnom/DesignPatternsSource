package chapter4.creator.factorymethod;

import chapter4.product.JodhpurSpecialPizza;
import chapter4.product.JodhpuriCheesePizza;
import chapter4.product.JodhpuriVeggiePizza;
import chapter4.product.Pizza;

public class JodhpurPizzaStore extends PizzaStore {
    @Override
    Pizza create(String type) {
        if (type.equals("CHEESE")) {
            return new JodhpuriCheesePizza();
        } else if (type.equals("VEGGIE")) {
            return new JodhpuriVeggiePizza();
        } else if (type.equals("COUNTRY_SPECIAL")) {
            return new JodhpurSpecialPizza();
        } else {
            System.out.println("Sorry we don't have that pizza available");
            return null;
        }
    }
}
