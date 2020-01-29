package chapter4.creator.simplefactory;

import chapter4.product.*;

public class SimplePizzaFactory{
    public Pizza create(String type) {
        if (type.equals("CHEESE")) {
            return new OldCheesePizza();
        } else if (type.equals("VEGGIE")) {
            return new OldVeggiePizza();
        } else if (type.equals("COUNTRY_SPECIAL")) {
            return new OldCountrySpecialPizza();
        } else {
            System.out.println("Sorry we don't have that pizza available");
            return null;
        }
    }
}
