package chapter4.creator.abstractfactory;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new ClassicPizzaStore();

        pizzaStore.order("CHEESE");

        pizzaStore = new JodhpurPizzaStore();
        pizzaStore.order("COUNTRY_SPECIAL");
    }
}
