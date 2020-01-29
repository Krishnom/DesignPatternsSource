package chapter4.creator.abstractfactory;

import chapter4.product.*;

public class ClassicPizzaStore extends PizzaStore {
    PizzaIngredientFactory pizzaIngredientFactory = new AnyPizzaIngredientFactory();

    @Override
    Pizza create(String type) {
        if (type.equals("CHEESE")) {
            return new CheesePizza(pizzaIngredientFactory);
        } else if (type.equals("VEGGIE")) {
            return new VeggiePizza(pizzaIngredientFactory);
        } else if (type.equals("COUNTRY_SPECIAL")) {
            return new CountrySpecialPizza(pizzaIngredientFactory);
        } else {
            System.out.println("Sorry we don't have that pizza available");
            return null;
        }
    }
}
