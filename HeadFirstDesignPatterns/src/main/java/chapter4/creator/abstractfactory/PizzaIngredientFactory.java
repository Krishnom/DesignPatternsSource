package chapter4.creator.abstractfactory;

import chapter4.product.Cheese;
import chapter4.product.Dough;
import chapter4.product.Sauce;
import chapter4.product.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
}
