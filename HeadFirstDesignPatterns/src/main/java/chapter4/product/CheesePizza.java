package chapter4.product;

import chapter4.creator.abstractfactory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        this.name = "CheesePizza";
    }

    @Override
    public void prepare() {
        System.out.println("Making "+ name + " from "+ pizzaIngredientFactory.toString());
        pizzaIngredientFactory.createDough();
        pizzaIngredientFactory.createSauce();
        pizzaIngredientFactory.createVeggies();
        pizzaIngredientFactory.createCheese();
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
