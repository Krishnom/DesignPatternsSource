package chapter4.product;

public class JodhpurSpecialPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Making jodhpur special pizza");
        System.out.println("Making dough with millet flour");
        System.out.println("Applying spicy chutney");
        System.out.println("Adding some fresh vegetables");
        System.out.println("Topping with garlic");
        System.out.println("Adding some ghee");
        System.out.println("Baking");
    }

    @Override
    public void cut() {
        System.out.println("Cut into 4 slices");
    }

    @Override
    public void pack() {
        System.out.println("Pack in jodhpur pizza box");
    }
}
