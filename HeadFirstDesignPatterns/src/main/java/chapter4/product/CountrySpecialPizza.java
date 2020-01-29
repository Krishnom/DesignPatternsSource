package chapter4.product;

import chapter4.creator.abstractfactory.PizzaIngredientFactory;

public class CountrySpecialPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public CountrySpecialPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        this.name = "CountrySpecialPizza";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name + " from "+ pizzaIngredientFactory.toString());
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        veggies = pizzaIngredientFactory.createVeggies();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
