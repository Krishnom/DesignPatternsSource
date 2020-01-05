package chapter1;

public class ModelDuck extends Duck {
    public ModelDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squeak());
    }

    @Override
    public void display() {
        System.out.println("I am a Model duck");
    }
}
