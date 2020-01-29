package chapter4.creator.factorymethod;


public class Main {
    public static void main(String[] args) {
        PizzaStore jodhpurPizzaStore = new JodhpurPizzaStore();

        System.out.println("----------------------------------------------------");
        System.out.println("Odering Veggie pizza");
        jodhpurPizzaStore.order("VEGGIE");

        System.out.println("----------------------------------------------------");
        System.out.println("Odering CHEESE pizza");
        jodhpurPizzaStore.order("CHEESE");

        System.out.println("----------------------------------------------------");
        System.out.println("Odering Country Special pizza");
        jodhpurPizzaStore.order("COUNTRY_SPECIAL");
        System.out.println("----------------------------------------------------");
    }
}
