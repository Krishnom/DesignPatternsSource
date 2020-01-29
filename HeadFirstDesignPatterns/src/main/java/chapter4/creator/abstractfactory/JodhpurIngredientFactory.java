package chapter4.creator.abstractfactory;

import chapter4.product.*;

public class JodhpurIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new MilletDough();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
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

    @Override
    public String toString() {
        return "JodhpurIngredientFactory{}";
    }
}
