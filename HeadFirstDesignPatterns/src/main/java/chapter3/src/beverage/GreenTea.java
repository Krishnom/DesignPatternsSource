package chapter3.src.beverage;

public class GreenTea extends Beverage {

    @Override
    public double cost() {
        return 10.0;
    }

    @Override
    public String getDescription() {
        return "Green Tea";
    }
}
