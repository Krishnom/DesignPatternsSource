package chapter4.product;

import chapter4.creator.abstractfactory.PizzaIngredientFactory;

public class OldCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("We are closed");
    }

    @Override
    public void cut() {
        System.out.println("We are closed");
    }

    @Override
    public void pack() {
        System.out.println("We are closed");
    }
}
