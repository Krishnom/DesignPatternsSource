package chapter4.creator.simplefactory;

import chapter4.product.Pizza;

public class PizzaStore {
    public Pizza order(String type){
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        Pizza pizza = simplePizzaFactory.create(type);
        if(pizza != null){
            pizza.prepare();
            pizza.cut();
            pizza.pack();
        }
        return pizza;
    }
}
