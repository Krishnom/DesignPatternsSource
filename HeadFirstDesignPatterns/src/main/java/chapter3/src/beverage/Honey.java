package chapter3.src.beverage;

public class Honey extends CondimentDecorator {
    Beverage beverage;

    public Honey(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 5 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Honey";
    }
}
