package chapter3.src.beverage;

public class Espresso extends Beverage {
    @Override
    public double cost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Espresso ";
    }
}
