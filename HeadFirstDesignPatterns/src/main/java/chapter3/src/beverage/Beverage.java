package chapter3.src.beverage;

public abstract class Beverage {
    private String description = "Unknown Beverage";
    public abstract double cost();

    public String getDescription() {
        return description;
    }
}
