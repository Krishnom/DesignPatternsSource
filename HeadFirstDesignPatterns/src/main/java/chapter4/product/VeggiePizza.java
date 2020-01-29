package chapter4.product;

import chapter4.creator.abstractfactory.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        name = "VeggiePizza";
    }

    @Override
    public void prepare() {
        System.out.println("Making "+ name+ " from "+ pizzaIngredientFactory.toString());
        pizzaIngredientFactory.createDough();
        pizzaIngredientFactory.createSauce();
        pizzaIngredientFactory.createVeggies();
        pizzaIngredientFactory.createCheese();
    }
}
