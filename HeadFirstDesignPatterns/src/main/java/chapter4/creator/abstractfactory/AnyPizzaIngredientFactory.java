package chapter4.creator.abstractfactory;

import chapter4.product.*;

public class AnyPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public String toString() {
        return "AnyPizzaIngredientFactory{}";
    }

    @Override
    public Dough createDough() {
        return new MaidaDough();
    }

    @Override
    public Sauce createSauce() {
        return new ChilliSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = new Veggies[3];
        veggies[0] = new Tomato();
        veggies[1] = new Jalapeno();
        veggies[2] = new Onion();
        return veggies;
    }


}
