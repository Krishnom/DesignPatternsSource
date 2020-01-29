package chapter4.creator.original;

import chapter4.product.*;

public class DependentPizzaStore {
    public Pizza createPizza(String style, String type) {
        Pizza pizza = null;
        if(style == null){
            if (type.equals("CHEESE")) {
                pizza = new OldCheesePizza();
            } else if (type.equals("VEGGIE")) {
                pizza = new OldVeggiePizza();
            } else if (type.equals("COUNTRY_SPECIAL")) {
                pizza = new OldCountrySpecialPizza();
            }
        }
        else if (style.equals("Jodhpur")) {
            if (type.equals("CHEESE")) {
                pizza = new JodhpuriCheesePizza();
            } else if (type.equals("VEGGIE")) {
                pizza = new JodhpuriVeggiePizza();
            } else if (type.equals("COUNTRY_SPECIAL")) {
                pizza = new JodhpurSpecialPizza();
            }
        }

        pizza.prepare();
        pizza.cut();
        pizza.pack();
        return pizza;
    }
}
