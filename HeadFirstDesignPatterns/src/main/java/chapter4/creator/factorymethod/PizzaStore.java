package chapter4.creator.factorymethod;

import chapter4.product.Pizza;

public abstract class PizzaStore {
    abstract Pizza create(String type);

    Pizza order(String type) {
        Pizza pizza = create(type);
        if(pizza!= null){
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.pack();
        }
        return pizza;
    }
}
