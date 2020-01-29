package chapter4.creator.simplefactory;

public class Main {
    public static void main(String[] args) {
        PizzaStore jodhpurPizzaStore = new JodhpurPizzaStore();
        jodhpurPizzaStore.order("VEGGIE");
    }
}
