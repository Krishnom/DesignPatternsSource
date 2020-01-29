package chapter4.product;

import chapter4.creator.abstractfactory.PizzaIngredientFactory;

public class JodhpuriCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Making Jodhpur style pizza");
        System.out.println("Preparing Dough");
        System.out.println("Adding lots of cheese");
        System.out.println("Adding lots of butter");
        System.out.println("Adding some spices");
        System.out.println("It's baking");
    }

    @Override
    public void cut() {
        System.out.println("Cutting into 6 slices");
    }

    @Override
    public void pack() {
        System.out.println("Packing for delivery");
    }
}
