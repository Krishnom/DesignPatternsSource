package chapter1;

public class DuckSimulatorMain {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.performQuack();

        modelDuck.setFlyBehavior(new RocketFlyBehavior());
        modelDuck.performFly();
    }
}
