package chapter4.creator.original;

public class Main {
    public static void main(String[] args) {
        DependentPizzaStore dependentPizzaStore = new DependentPizzaStore();
        dependentPizzaStore.createPizza(null, "CHEESE");
        dependentPizzaStore.createPizza("Jodhpur", "VEGGIE");
    }
}
